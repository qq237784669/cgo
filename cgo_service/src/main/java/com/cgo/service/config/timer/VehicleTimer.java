package com.cgo.db.config.timer;

import com.alibaba.fastjson.JSON;
import com.cgo.common.utlis.DateUtli;
import com.cgo.common.utlis.RedisUtil;
import com.cgo.db.entity.BasAlarmflag;
import com.cgo.db.mapper.web_module.vehicle.VehicleMapper;
import com.cgo.entity.login_module.login.pojo.GlobalConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Description;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Component
@Slf4j
@Description("basAlarmFlagConst")
public class VehicleTimer {


    @Autowired
    GlobalConfig globalConfig;

    @Value("${dbconst.basAlarmFlag}")
    String basAlarmFlag;

    @Value("${timer.vehicleLock}")
    String VEHICLE_LOCK;

    @Value("${timer.vehicleIdList}")
    String VEHICLE_ID_LIST;

    @Value("${timer.vehiclePositioningList}")
    String VEHICLE_POSITIONING_LIST;


    @Autowired
    VehicleMapper vehicleMapper;


    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    RedissonClient redissonClient;

    private static String queryEndTime="1971-1-1 01:01:01.000";
    /**
     * 获取车辆定位 载入缓存 定时器
     */
    @Scheduled(fixedRate = 10000)
    public void vehicle() {



        log.info(" =============================定时器 10s/次 获取车辆定位中  =============================");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Date initDate=null;
        try {
            initDate = new SimpleDateFormat("yyyy-MM-dd").parse(queryEndTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateString = DateUtli.convertDate(initDate, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
        List<Map<String, Object>> vehiclePositioningList = vehicleMapper.findAllVehiclePositioning(dateString);

        // 更改 下次查询 的时间节点
        queryEndTime = vehiclePositioningList.get(0).get("queryEndTime").toString();



        /* 补充扩展字段*/
        // 获取外设数据的部分暂不翻译
        this.addExtField(dateFormat, vehiclePositioningList);


        RLock lock = redissonClient.getLock(VEHICLE_LOCK);
        boolean state=false;
        try {
            state = lock.tryLock(2L, 10L, TimeUnit.SECONDS);
            if (state){

                for (Map<String, Object> map : vehiclePositioningList) {

                    Object vehicleid = map.get("vehicleId");

                    if (vehicleid == null) {
                        log.error(" 该车辆 id = null  >>>  "+map);
                        continue;
                    }

                    List<String> vehicleIdListCache = redisTemplate.opsForList().range(VEHICLE_ID_LIST, 0, -1);
                    if (vehicleIdListCache != null ){

                        List<String> filterPost = vehicleIdListCache.stream().filter(vehicleIdCache -> vehicleIdCache.equals(vehicleid.toString())).collect(Collectors.toList());
                        if (filterPost.size() >0 ){
                            //在push之前 已经存在 则比较时间 谁 更接近当前时间

                            Map<String,String> vehiclePositioningCache = JSON.parseObject(
                                    (redisTemplate.opsForHash().get(VEHICLE_POSITIONING_LIST, filterPost.get(0))).toString(),
                                    Map.class
                            );
                            String gpsTime = vehiclePositioningCache.get("gpsTime");
                            try {
                                long timePre = dateFormat.parse(gpsTime).getTime();
                                long timeCur = dateFormat.parse(map.get("gpsTime").toString()).getTime();
                                if (timeCur<timePre){
                                    continue;
                                }
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }

                        }else {
                            // 增加id列表
                            redisTemplate.opsForList().rightPush(VEHICLE_ID_LIST,vehicleid.toString());
                        }

                    }else {
                        // 增加id列表
                        redisTemplate.opsForList().rightPush(VEHICLE_ID_LIST,vehicleid.toString());
                    }

                    // 格式  车辆定位列表【key】 ： 车辆id   ：数据
                    redisTemplate.opsForHash().put(VEHICLE_POSITIONING_LIST,vehicleid.toString(), JSON.toJSONString(map) );
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (state){
                lock.unlock();
            }
        }

        log.info(" =============================定时器 10s/次 获取车辆定位结束 =============================");

    }

    private void addExtField(SimpleDateFormat dateFormat, List<Map<String, Object>> vehiclePositioningList) {
        vehiclePositioningList.stream()
                .filter(pos -> pos.get("vehicleId") != null && !pos.get("vehicleId").toString().isEmpty())
                .forEach(pos -> {

                    // 修正卫星时间大于当前时间10分的数据
                    try {
                        Date gpsTime = dateFormat.parse(pos.get("gpsTime").toString());
                        Calendar validGpsTime = Calendar.getInstance();
                        validGpsTime.add(Calendar.MINUTE, 10);
                        if (gpsTime.compareTo(validGpsTime.getTime()) > 0) {
                            pos.put("gpsTime", dateFormat.format(new Date()));
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    if ("999".equals(pos.get("dvrTypeCode").toString()) && "1".equals(globalConfig.getHasVideo())) {
                        pos.put("dvrChannelNum", pos.get("dvrChannelNum").toString());
                    } else {
                        pos.put("dvrChannelNum", "0");
                    }

                    if (pos.get("residualFuel") == null) {
                        pos.put("residualFuel", "0.0");
                    } else {
                        pos.put("residualFuel", String.format("%.1f", Double.parseDouble(pos.get("residualFuel").toString())));
                    }

                    if (pos.get("mileage") == null) {
                        pos.put("mileage", "0.0");
                    } else {
                        pos.put("mileage", String.format("%.2f", Double.parseDouble(pos.get("mileage").toString())));
                    }

                    double lat = 0.0;
                    if (pos.get("lat") != null && !pos.get("lat").toString().isEmpty()) {
                        lat = Double.parseDouble(pos.get("lat").toString());
                    }
                    pos.put("lat", String.format("%.6f", lat));

                    double lng = 0.0;
                    if (pos.get("lng") != null && !pos.get("lng").toString().isEmpty()) {
                        lng = Double.parseDouble(pos.get("lng").toString());
                    }
                    pos.put("lng", String.format("%.6f", lng));

                    double direction = 0.0;
                    if (pos.get("direction") != null && !pos.get("direction").toString().isEmpty()) {
                        direction = Double.parseDouble(pos.get("direction").toString());
                    }
                    pos.put("direction", String.format("%.6f", direction));

                    if (pos.get("todayMileageCount") != null) {
                        pos.put("todayMileageCount", String.format("%.2f", Double.parseDouble(pos.get("todayMileageCount").toString())));
                    }

                    // 解析报警状态用于消息列表(未翻译)
                    if (Long.parseLong(pos.get("alarmFlag").toString()) > 0) {

                        String basAlarmflagString = (String) redisTemplate.opsForHash().get(basAlarmFlag, pos.get("alarmFlag").toString());
                        if (!StringUtils.isEmpty(basAlarmflagString)){
                            String alarmName = JSON.parseObject(basAlarmflagString, BasAlarmflag.class).getAlarmName();
                            pos.put("alarmName", alarmName);
                        }
                    }

                    // 获取外设数据的部分暂不翻译
                    pos.put("temperatureControl", "");
                    pos.put("height", "");
                    pos.put("address", "");
                    pos.put("description", "");

                });
    }

}

