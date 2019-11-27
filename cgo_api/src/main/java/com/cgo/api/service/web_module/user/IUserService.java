package com.cgo.api.service.web_module.user;

import com.cgo.entity.login_module.login.request.LoginRequest;
import com.cgo.common.response.ResponseResult;

import java.util.List;

public interface IUserService {
    /**
     * 登录
     * @param loginRequest
     * @return
     */
    ResponseResult login(LoginRequest loginRequest);
}
