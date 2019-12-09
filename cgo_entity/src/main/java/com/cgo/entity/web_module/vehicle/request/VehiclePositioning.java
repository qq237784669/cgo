package com.cgo.entity.web_module.vehicle.request;


import lombok.Data;

/**
 * 车辆定位接口  传参 请求 映射
 */
@Data
public class VehiclePositioning {

    private String userId;
    private String vehicleIds;
    private String lastQueryTime;
    private String currVehicle;
    private String mobileOs;
    private Integer appVersionCode;

}
