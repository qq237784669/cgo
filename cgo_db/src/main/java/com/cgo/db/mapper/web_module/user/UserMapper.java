package com.cgo.db.mapper.web_module.user;

import com.cgo.entity.login_module.login.request.LoginRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

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

    // 获取 移动端在线用户信息
    List<Map<String, Object>> findOnlineUserInfo();

    List<Map<String, Object>> findVehicleList(@Param("userType") String userType,@Param("userId") String userId);

    void spApp_ModifyMobOnlineUser(LoginRequest loginRequest);

    void deleteUserLoginInfo(LoginRequest loginRequest);
}