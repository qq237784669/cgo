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
@TableName("biz_CurrentPos")
public class BizCurrentpos extends Model<BizCurrentpos> {

    private static final long serialVersionUID=1L;

    @TableField("GasConcentration")
    private String GasConcentration;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("ResidualFuel")
    private Double ResidualFuel;

    @TableField("InOutPosId")
    private Integer InOutPosId;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("MediaEventCode")
    private Integer MediaEventCode;

    @TableField("LastUpdateTime")
    private LocalDateTime LastUpdateTime;

    @TableField("LimitSpeedType")
    private Integer LimitSpeedType;

    @TableField("SpeedingPosType")
    private Integer SpeedingPosType;

    @TableField("Direction")
    private Integer Direction;

    @TableField("WirelessSignal")
    private Integer WirelessSignal;

    @TableField("Id")
    private Long Id;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("DrivingDuration")
    private Integer DrivingDuration;

    @TableField("MediaType")
    private Integer MediaType;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("Speed")
    private Double Speed;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("DrivingFlag")
    private Integer DrivingFlag;

    @TableField("SpeedingPosId")
    private Integer SpeedingPosId;

    @TableField("LastRunTime")
    private LocalDateTime LastRunTime;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("Analogue")
    private Integer Analogue;

    @TableField("InOutFlag")
    private Integer InOutFlag;

    @TableField("MediaChannelId")
    private Integer MediaChannelId;

    @TableId("SimNum")
    private String SimNum;

    @TableField("MediaFormatCode")
    private Integer MediaFormatCode;

    @TableField("DrivingPathSectionId")
    private Integer DrivingPathSectionId;

    @TableField("LastStopTime")
    private LocalDateTime LastStopTime;

    @TableField("AlarmEventId")
    private Integer AlarmEventId;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("JTBExtendOilData")
    private String JTBExtendOilData;

    @TableField("InOutPosType")
    private Integer InOutPosType;

    @TableField("Reserved")
    private Integer Reserved;

    @TableField("StateFlag")
    private Long StateFlag;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
