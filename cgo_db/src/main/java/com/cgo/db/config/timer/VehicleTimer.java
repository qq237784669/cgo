package com.cgo.db.config.timer;

import com.alibaba.fastjson.JSON;
import com.cgo.common.utlis.DateUtli;
import com.cgo.common.utlis.RedisUtil;
import com.cgo.db.mapper.web_module.vehicle.VehicleMapper;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class VehicleTimer {



    @Autowired
    VehicleMapper vehicleMapper;


    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    RedissonClient redissonClient;
    /**
     * 获取车辆定位 载入缓存 定时器
     */
    @Scheduled(fixedRate = 10000)
    public void vehicle() {


        log.info(" =============================定时器 10s/次 获取车辆定位中  =============================");

        String dateString = DateUtli.convertDate(new Date(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
        List<Map<String, Object>> vehiclePositioningList = vehicleMapper.findAllVehiclePositioning(dateString);

        RLock lock = redissonClient.getLock("vehiclePositioning");
        boolean state=false;
        try {
            state = lock.tryLock(2L, 10L, TimeUnit.SECONDS);
            if (state){

                for (Map<String, Object> map : vehiclePositioningList) {

                    Object vehicleid = map.get("VEHICLEID");

                    if (vehicleid == null) {
                        log.error(" 该车辆 id = null  >>>  "+map);
                        continue;
                    }
                    // 增加id列表
                    redisTemplate.opsForList().rightPush("vehicleIdList",vehicleid.toString());

                    // 格式  车辆定位列表【key】 ： 车辆id   ：数据
                    redisTemplate.opsForHash().put("vehiclePositioningList",vehicleid.toString(), JSON.toJSONString(map) );
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
}
