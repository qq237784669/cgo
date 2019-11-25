package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleOfflineLog")
public class BizVehicleofflinelog extends Model<BizVehicleofflinelog> {

    private static final long serialVersionUID=1L;

    @TableField("AlarmEventId")
    private Integer AlarmEventId;

    @TableField("Analogue")
    private Integer Analogue;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("Reserved")
    private Integer Reserved;

    @TableField("InOutPosType")
    private Integer InOutPosType;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("ResidualFuel")
    private Double ResidualFuel;

    @TableField("OfflineTimeOut")
    private Integer OfflineTimeOut;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableField("Direction")
    private Integer Direction;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("DrivingPathSectionId")
    private Integer DrivingPathSectionId;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("InOutPosId")
    private Integer InOutPosId;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableId("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("DrivingDuration")
    private Integer DrivingDuration;

    @TableField("Speed")
    private Double Speed;

    @TableField("SpeedingPosType")
    private Integer SpeedingPosType;

    @TableField("WirelessSignal")
    private Integer WirelessSignal;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("SpeedingPosId")
    private Integer SpeedingPosId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("InOutFlag")
    private Integer InOutFlag;

    @TableField("DrivingFlag")
    private Integer DrivingFlag;

    @TableField("AlarmFlag")
    private Long AlarmFlag;


    @Override
    protected Serializable pkVal() {
        return this.ReceTime;
    }

}
