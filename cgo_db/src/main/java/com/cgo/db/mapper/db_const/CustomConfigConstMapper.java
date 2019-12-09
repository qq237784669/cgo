package com.cgo.db.mapper.db_const;

import java.util.List;
import java.util.Map;

public interface CustomConfigConstMapper {
    List<Map<String,Object>> call_spApp_InitMobDb();

    Map<String,Object> call_dbo_spApp_ModifySysConfig();

    void deleteDizMobLessThanCreateTime(String createTime);

    List<Map<String, Object>> findgetCusModuleList();
}
