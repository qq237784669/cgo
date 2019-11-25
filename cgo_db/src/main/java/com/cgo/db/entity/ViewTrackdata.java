package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
@TableName("View_TrackData")
public class ViewTrackdata extends Model<ViewTrackdata> {

    private static final long serialVersionUID=1L;

    @TableField("DrivingPathSectionId")
    private Integer DrivingPathSectionId;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("InOutPosType")
    private Integer InOutPosType;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableField("Direction")
    private Integer Direction;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("MediaFormatCode")
    private Integer MediaFormatCode;

    @TableField("LimitSpeedType")
    private Integer LimitSpeedType;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("WirelessSignal")
    private Integer WirelessSignal;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("InOutPosId")
    private Integer InOutPosId;

    @TableField("MediaData")
    private byte[] MediaData;

    @TableField("SpeedingPosType")
    private Integer SpeedingPosType;

    @TableField("DrivingDuration")
    private Integer DrivingDuration;

    @TableField("ResidualFuel")
    private Double ResidualFuel;

    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("SimNum")
    private String SimNum;

    @TableField("MediaEventCode")
    private Integer MediaEventCode;

    @TableField("Id")
    private String Id;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("Speed")
    private Double Speed;

    @TableField("InOutFlag")
    private Integer InOutFlag;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("JTBExtendOilData")
    private String JTBExtendOilData;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("SpeedingPosId")
    private Integer SpeedingPosId;

    @TableField("DrivingFlag")
    private Integer DrivingFlag;

    @TableField("MediaType")
    private Integer MediaType;

    @TableField("Reserved")
    private Integer Reserved;

    @TableField("GasConcentration")
    private String GasConcentration;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("Analogue")
    private Integer Analogue;

    @TableField("MediaChannelId")
    private Integer MediaChannelId;

    @TableField("AlarmEventId")
    private Integer AlarmEventId;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("AlarmFlag")
    private Long AlarmFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
