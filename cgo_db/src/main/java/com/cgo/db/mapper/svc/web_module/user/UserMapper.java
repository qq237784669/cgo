package com.cgo.db.mapper.svc.web_module.user;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    /**
     * 根据用户类型   用户id 查询
     * @param userType
     * @param userId
     * @return
     */
    List<Map<String,String>> findByUserTypeZero(String userId);
    List<Map<String,String>> findByUserTypeOne(String userId);



    List<Map<String, String>> findUserAuth(String userId);

    List<Map<String, String>> findVehicleIcons();

    List<Map<String, String>> call_spApp_GetNavMenuAuthByUser(String userId);

    List<Map<String, String>> call_spApp_GetNavMenuAuthByPlateNum(String userId);

    List<Map<String, String>> call_spApp_IsWorkMenuAuth(String userId);

    List<Map<String,Object>> finVehicleListByUserTypeEqZero(String userId);

    List<Map<String,Object>> finVehicleListByUserTypeEqOne(String userId);
}