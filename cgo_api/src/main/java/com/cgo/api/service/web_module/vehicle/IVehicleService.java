package com.cgo.api.service.web_module.vehicle;

import com.cgo.common.response.ResponseResult;
import com.cgo.entity.login_module.login.request.LoginRequest;

import java.util.List;

public interface IVehicleService {
    /**
     * 通过用户id、用户类型返回车辆列表
     * @param userId 用户id
     * @param userType 用户类型
     * @return 车辆列表
     */
    List getVehicleList(String userId, String userType);
}
