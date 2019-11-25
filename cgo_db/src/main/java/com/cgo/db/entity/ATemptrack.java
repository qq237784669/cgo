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
@TableName("a_tempTrack")
public class ATemptrack extends Model<ATemptrack> {

    private static final long serialVersionUID=1L;

    @TableField("ResidualFuel")
    private Double ResidualFuel;

    @TableField("InOutPosId")
    private Integer InOutPosId;

    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("WirelessSignal")
    private Integer WirelessSignal;

    @TableField("SpeedingPosType")
    private Integer SpeedingPosType;

    @TableField("DrivingDuration")
    private Integer DrivingDuration;

    @TableField("MediaData")
    private byte[] MediaData;

    @TableField("Direction")
    private Integer Direction;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("SpeedingPosId")
    private Integer SpeedingPosId;

    @TableField("JTBExtendOilData")
    private String JTBExtendOilData;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("Id")
    private String Id;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("InOutFlag")
    private Integer InOutFlag;

    @TableField("MediaEventCode")
    private Integer MediaEventCode;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("Speed")
    private Double Speed;

    @TableField("AlarmEventId")
    private Integer AlarmEventId;

    @TableField("DrivingFlag")
    private Integer DrivingFlag;

    @TableField("MediaChannelId")
    private Integer MediaChannelId;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("GasConcentration")
    private String GasConcentration;

    @TableField("Analogue")
    private Integer Analogue;

    @TableField("MediaType")
    private Integer MediaType;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Reserved")
    private Integer Reserved;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("DrivingPathSectionId")
    private Integer DrivingPathSectionId;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("MediaFormatCode")
    private Integer MediaFormatCode;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("InOutPosType")
    private Integer InOutPosType;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("StateFlag")
    private Long StateFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
