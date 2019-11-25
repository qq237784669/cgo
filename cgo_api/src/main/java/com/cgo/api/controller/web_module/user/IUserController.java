package com.cgo.api.controller.web_module.user;

import com.cgo.common.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

@Api(value="用户信息")
public interface IUserController {


    @ApiOperation(value = "获取车辆列表", httpMethod = "POST")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "userId",value = "用户id",defaultValue = "admin"),
                    @ApiImplicitParam(name = "userType",value = "用户类型",defaultValue = "0")
            }
    )
    public ResponseResult findList(Map<String,String> param);
}
