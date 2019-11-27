package com.cgo.db.mapper.web_module.user;

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

    /**
     * 获取车辆列表  和组织列表  userType=0的情况ia
     * @param userId
     * @return
     */
    List<Map<String,Object>> findVehicleListByUserTypeEqZero(String userId);
    List<Map<String,Object>> findOrganizationListByUserTypeEqZero(String userId);

    List<Map<String,Object>> findVehicleListByUserTypeEqOne(String userId);

}