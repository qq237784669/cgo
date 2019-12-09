package com.cgo.service.config.dbconst;

import com.alibaba.fastjson.JSON;
import com.cgo.common.utlis.RedisUtil;
import com.cgo.db.entity.BasAlarmflag;
import com.cgo.db.mapper.BasAlarmflagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 明天加个查询主表select * from bas_alarmFlag。
 * 系统一启动的时候就从这个表查数据，放在缓存中
 */
@Component
public class BasAlarmFlagConst implements ApplicationRunner {


    // redis对应的key
    @Value("${dbconst.basAlarmFlag}")
    String basAlarmFlag;



    @Autowired
    BasAlarmflagMapper basAlarmflagMapper;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;
    // pojo - map
    public void run(ApplicationArguments args) throws Exception {
        // 所有数据
        List<BasAlarmflag> basAlarmflags = basAlarmflagMapper.selectList(null);
        //载入redis
        basAlarmflags.forEach(item->{
            // id
            String alarmFlag = item.getAlarmFlag().toString();
            redisTemplate.opsForHash().put(
                    basAlarmFlag,
                    alarmFlag,
                    JSON.toJSONString(item)  //存储字符串  不要Object
                    );
        });
    }
}
