package com.cgo.db.mapper.web_module.vehicle;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface VehicleMapper {


    // 获取所有车辆定位
    List<Map<String,Object>>  findAllVehiclePositioning(String date);
}
