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
@TableName("biz_AlarmData")
public class BizAlarmdata extends Model<BizAlarmdata> {

    private static final long serialVersionUID=1L;

    @TableField("EndAlarmTime")
    private LocalDateTime EndAlarmTime;

    @TableField("EndResidualFuel")
    private Double EndResidualFuel;

    @TableField("MaxSpeed")
    private Double MaxSpeed;

    @TableField("EndDirection")
    private Integer EndDirection;

    @TableField("BeginDrivingDuration")
    private Integer BeginDrivingDuration;

    @TableField("BeginStateFlag")
    private Long BeginStateFlag;

    @TableField("BeginTrackId")
    private String BeginTrackId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginWirelessSignal")
    private Integer BeginWirelessSignal;

    @TableField("EndInOutPosId")
    private Integer EndInOutPosId;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("BeginSpeedingPosType")
    private Integer BeginSpeedingPosType;

    @TableField("EndDrivingFlag")
    private Integer EndDrivingFlag;

    @TableField("EndADRSpeed")
    private Double EndADRSpeed;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("LimitDuration")
    private Integer LimitDuration;

    @TableField("EndExStateFlag")
    private Long EndExStateFlag;

    @TableField("BeginInOutPosId")
    private Integer BeginInOutPosId;

    @TableField("EndSpeedingPosId")
    private Integer EndSpeedingPosId;

    @TableField("BeginDrivingFlag")
    private Integer BeginDrivingFlag;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("BeginResidualFuel")
    private Double BeginResidualFuel;

    @TableField("BeginAlarmTime")
    private LocalDateTime BeginAlarmTime;

    @TableField("TargetName")
    private String TargetName;

    @TableField("BeginAltitude")
    private Integer BeginAltitude;

    @TableField("BeginDirection")
    private Integer BeginDirection;

    @TableField("EndDrivingPathSectionId")
    private Integer EndDrivingPathSectionId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndAdditionData")
    private String EndAdditionData;

    @TableField("SchedulUser")
    private String SchedulUser;

    @TableField("EndWirelessSignal")
    private Integer EndWirelessSignal;

    @TableField("TargetId")
    private Integer TargetId;

    @TableField("AvgSpeed")
    private Double AvgSpeed;

    @TableField("EndSpeedingPosType")
    private Integer EndSpeedingPosType;

    @TableField("EndStateFlag")
    private Long EndStateFlag;

    @TableField("BeginADRSpeed")
    private Double BeginADRSpeed;

    @TableField("LimitSpeedType")
    private Integer LimitSpeedType;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("BeginExStateFlag")
    private Long BeginExStateFlag;

    @TableField("MinDeviation")
    private Integer MinDeviation;

    @TableId("Id")
    private String Id;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("MaxDeviation")
    private Integer MaxDeviation;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("BeginDrivingPathSectionId")
    private Integer BeginDrivingPathSectionId;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("UserId")
    private String UserId;

    @TableField("BeginAdditionData")
    private String BeginAdditionData;

    @TableField("MinSpeed")
    private Double MinSpeed;

    @TableField("EndDrivingDuration")
    private Integer EndDrivingDuration;

    @TableField("BeginSpeedingPosId")
    private Integer BeginSpeedingPosId;

    @TableField("EndTrackId")
    private String EndTrackId;

    @TableField("EndLatitude")
    private Double EndLatitude;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
