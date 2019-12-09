package com.cgo.db.mapper.web_module.vehicle;

import com.cgo.entity.web_module.vehicle.request.VehicleTrack;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface VehicleMapper {


    // 获取所有车辆定位
    List<Map<String,Object>>  findAllVehiclePositioning(String date);

    //  车辆轨迹列表
    List<Map<String, Object>> findTrack(VehicleTrack vehicleTrack);
}
