package com.cgo.api.service.web_module.user;

import com.cgo.api.pojo.login_module.login.LoginRequest;
import com.cgo.common.response.ResponseResult;

import java.util.List;

public interface IUserService {
    /**
     * 登录
     * @param loginRequest
     * @return
     */
    ResponseResult login(LoginRequest loginRequest);

    /**
     * 通过 用户id   用户类型 查询  对应的车辆
     * @param userId
     * @param userType
     * @return
     */
    List getVehicleList(String userId, String userType);


}
