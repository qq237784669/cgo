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
@TableName("a_tempTrack_bak")
public class ATemptrackBak extends Model<ATemptrackBak> {

    private static final long serialVersionUID=1L;

    @TableField("InOutPosType")
    private Integer InOutPosType;

    @TableField("GasConcentration")
    private String GasConcentration;

    @TableField("Analogue")
    private Integer Analogue;

    @TableField("MediaChannelId")
    private Integer MediaChannelId;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("AlarmEventId")
    private Integer AlarmEventId;

    @TableField("MediaType")
    private Integer MediaType;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("Reserved")
    private Integer Reserved;

    @TableField("InOutFlag")
    private Integer InOutFlag;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("Id")
    private String Id;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("SpeedingPosId")
    private Integer SpeedingPosId;

    @TableField("DrivingFlag")
    private Integer DrivingFlag;

    @TableField("JTBExtendOilData")
    private String JTBExtendOilData;

    @TableField("MediaEventCode")
    private Integer MediaEventCode;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SpeedingPosType")
    private Integer SpeedingPosType;

    @TableField("DrivingDuration")
    private Integer DrivingDuration;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("InOutPosId")
    private Integer InOutPosId;

    @TableField("WirelessSignal")
    private Integer WirelessSignal;

    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("Speed")
    private Double Speed;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("MediaFormatCode")
    private Integer MediaFormatCode;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("ResidualFuel")
    private Double ResidualFuel;

    @TableField("DrivingPathSectionId")
    private Integer DrivingPathSectionId;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("MediaData")
    private byte[] MediaData;

    @TableField("Direction")
    private Integer Direction;

    @TableField("StateFlag")
    private Long StateFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
