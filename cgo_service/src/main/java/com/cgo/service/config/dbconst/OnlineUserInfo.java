package com.cgo.service.config.dbconst;

import com.alibaba.fastjson.JSON;
import com.cgo.db.mapper.web_module.user.UserMapper;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 移动端在线用户信息
 */
@Component
public class OnlineUserInfo implements Runnable  {

    @Autowired
    UserMapper userMapper;

    @Autowired
    StringRedisTemplate redisTemplate;

    //  移动端在线用户信息 key
    @Value("${dbconst.mobileOnlineUserInfo}")
    String MOBILE_ONLINE_USERINFO;



    @Value("${dbconst.basAlarmFlag}")
    String basAlarmFlag;

    @Value("${timer.vehicleLock}")
    String VEHICLE_LOCK;

    @Value("${timer.vehicleIdList}")
    String VEHICLE_ID_LIST;

    @Value("${timer.vehiclePositioningList}")
    String VEHICLE_POSITIONING_LIST;



    public void run()  {
        List<Map<String,Object>> onlineUserInfoList=userMapper.findOnlineUserInfo();
        //车辆定位id列表
        List<String> vehicleIdListCache = redisTemplate.opsForList().range(VEHICLE_ID_LIST, 0, -1);

        onlineUserInfoList.forEach(item->{
            String userType = (String) item.get("userType");
            String userId = (String) item.get("userId");
            String imei = (String) item.get("imei");
            String bdChannelId = (String) item.get("bdChannelId");

            //存储在redis中的小key
            String userId_bdChannelId_redisKey = item.get("userId") + "_" + (bdChannelId==null ? "" : bdChannelId);
            // 构建以row["simNum"]、row["plateNum"]为键值的Map集合，作为全局移动端在线用户信息缓存的vehicleList字段
            List<Map<String,Object>> vehicleList= userMapper.findVehicleList(userType,userId);
            item.put("vehicleList",vehicleList);

            redisTemplate.opsForHash().put(MOBILE_ONLINE_USERINFO,
                    userId_bdChannelId_redisKey, //以用户id 和bdChannelId 作为混合key
                    JSON.toJSONString(item));


            if (vehicleList != null && vehicleList.size() > 0)
                this.vehiclePositioningListAddField(vehicleList,vehicleIdListCache,userId+"_"+imei);
        });
    }

    /**
     *
     * @param vehicleList 当前用户的车辆列表
     * @param vehicleIdListCache 缓存中的 车辆定位ID列表
     */
    private void vehiclePositioningListAddField(List<Map<String, Object>> vehicleList, List<String> vehicleIdListCache,String userInfo) {

        for (Map<String, Object> map : vehicleList) {
            String vehicleId =  map.get("vehicleId").toString();
            for (String vehicleIdCache : vehicleIdListCache) {

                if (vehicleId.equals(vehicleIdCache)){
                    //如果相等 那么把当前 车对应的用户 添加到 车辆定位列表对应的 用户列表中
                    Map<String,Object> vehiclePositioning = JSON.parseObject(
                            redisTemplate.opsForHash().get(VEHICLE_POSITIONING_LIST, vehicleId).toString(),
                            Map.class);
                    List<String> userList = (List<String>) vehiclePositioning.get("userList");
                    if (userList==null){
                        userList=new ArrayList<>();
                        userList.add(userInfo);
                        vehiclePositioning.put("userList",userList);
                    }else {
                        // 不重复添加
                        if (!userList.contains(userInfo))
                            userList.add(userInfo);
                    }
                    redisTemplate.opsForHash().put(VEHICLE_POSITIONING_LIST,vehicleId,JSON.toJSONString(vehiclePositioning));
                }

            }
        }

    }
}
