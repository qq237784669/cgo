package com.cgo.api.service.web_module.vehicle;

import com.cgo.common.response.ResponseResult;
import com.cgo.entity.login_module.login.request.LoginRequest;
import com.cgo.entity.web_module.vehicle.request.VehicleTrack;

import java.util.List;

public interface IVehicleService {
    /**
     * 通过用户id、用户类型返回车辆列表
     * @param userId 用户id
     * @param userType 用户类型
     * @return 车辆列表
     */
    List getVehicleList(String userId, String userType);

    /**
     * 获取车辆定位 列表
     * @param vehicleIdList
     * @return
     */
    List getVehiclePositioningList(String[] vehicleIdList);

    /**
     * 获取车辆轨迹
     * @param vehicleTrack
     * @return
     */
    List getTrack(VehicleTrack vehicleTrack);
}
