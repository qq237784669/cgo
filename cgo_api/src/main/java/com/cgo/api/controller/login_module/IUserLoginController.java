package com.cgo.api.controller.login_module;


import com.cgo.api.pojo.login_module.login.LoginRequest;
import com.cgo.common.response.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


import java.util.Map;


@Api(value="用户登录模块")
public interface IUserLoginController {

    @ApiOperation(value = "登录获取token", httpMethod = "POST")
    ResponseResult login( LoginRequest loginRequest);

    @ApiOperation(value = "获取用户信息", httpMethod = "POST")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "access_token",value = "jwt_token"),
            }
    )
    ResponseResult userInfo( Map<String,String> map);



}
