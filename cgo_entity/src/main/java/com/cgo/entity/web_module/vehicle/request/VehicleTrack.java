package com.cgo.entity.web_module.vehicle.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class VehicleTrack implements Serializable {

    private String userId;
    private String vehicleId;

    private Integer minSpeed;

    private String beginTime;
    private String endTime;

    private Integer startRow;
    private Integer endRow;
}
