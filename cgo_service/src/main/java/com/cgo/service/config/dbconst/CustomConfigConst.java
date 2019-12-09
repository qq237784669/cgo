package com.cgo.service.config.dbconst;

import com.alibaba.fastjson.JSON;
import com.cgo.db.mapper.db_const.CustomConfigConstMapper;
import com.cgo.entity.login_module.login.pojo.CustomConfig;
import com.cgo.entity.login_module.login.pojo.GlobalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Component
public class CustomConfigConst implements ApplicationRunner {


    @Autowired
    CustomConfigConstMapper customConfigConstMapper;

    @Autowired
    GlobalConfig globalConfig;

    @Autowired
    StringRedisTemplate redisTemplate;

    // map
    public void run(ApplicationArguments args) throws Exception {

        customConfigConstMapper.call_spApp_InitMobDb(); //= DbInitService.init();

        Map<String, Object> result = customConfigConstMapper.call_dbo_spApp_ModifySysConfig();

        String isPlatformMileageStatisticsMode = result.remove("Value").toString();//是否使用平台计算里程
        Integer milRule = (Integer) result.get("milRule");
        Integer hasWeChatModule = (Integer) result.get("hasWeChatModule");
        Integer hasWxAlarmPostLog = (Integer) result.get("hasWxAlarmPostLog");
        Integer hasDeviceData = (Integer) result.get("hasDeviceData");

        result.put("isPlatformMileageStatisticsMode",isPlatformMileageStatisticsMode);
        result.put("milRule",milRule==1 ? true : false);
        result.put("hasWeChatModule",hasWeChatModule==1 ? true : false);
        result.put("hasWxAlarmPostLog",hasWxAlarmPostLog==1 ? true : false);
        result.put("hasDeviceData",hasDeviceData==1 ? true : false);
        result.put("cusModule",new ArrayList<String>());

        // 日志处理（未翻译）


        if ((boolean)result.get("hasWxAlarmPostLog"))
            clearWxAlarmPostLogData();


        //存储平台模块
        getCusModuleList(result);

        // store redis
        redisTemplate.opsForValue().set("globalConfig", JSON.toJSONString(result));


    }



    private void getCusModuleList(Map<String, Object> result) {
        List<Map<String,Object>> cusModuleList= customConfigConstMapper.findgetCusModuleList();
        cusModuleList.forEach(item -> { ((List)result.get("cusModule") ).add( item.get("ModuleCode") ); });
    }


    /**
     * 清除报警编号缓存表指定天数的旧数据
     */
    private void clearWxAlarmPostLogData() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -globalConfig.getOldAlarmPostDataClearInterval());
        String createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());

        customConfigConstMapper.deleteDizMobLessThanCreateTime(createTime);
    }


}
