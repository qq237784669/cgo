package com.cgo.api.controller.web_module.vehicle;

import com.cgo.common.response.ResponseResult;
import com.cgo.entity.web_module.vehicle.request.VehiclePositioning;
import com.cgo.entity.web_module.vehicle.request.VehicleTrack;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

@Api(value="车辆信息")
public interface IVehicleController {
    @ApiOperation(value = "获取车辆列表", httpMethod = "POST")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "userId",value = "用户id",defaultValue = "admin"),
                    @ApiImplicitParam(name = "userType",value = "用户类型",defaultValue = "0")
            }
    )
    ResponseResult getVehicleList(Map<String, String> param);


    @ApiOperation(value = "获取车辆定位列表", httpMethod = "POST")
    ResponseResult getVehiclePositioningList(VehiclePositioning param);

    @ApiOperation(value = "获取车辆轨迹列表", httpMethod = "POST")
    ResponseResult getTrack(VehicleTrack vehicleTrack);
}
