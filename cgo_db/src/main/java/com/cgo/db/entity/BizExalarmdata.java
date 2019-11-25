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
@TableName("biz_ExAlarmData")
public class BizExalarmdata extends Model<BizExalarmdata> {

    private static final long serialVersionUID=1L;

    @TableField("MinSpeed")
    private Double MinSpeed;

    @TableField("MaxDeviation")
    private Integer MaxDeviation;

    @TableField("BeginStateFlag")
    private Long BeginStateFlag;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginWirelessSignal")
    private Integer BeginWirelessSignal;

    @TableField("TargetId")
    private Integer TargetId;

    @TableField("BeginAdditionData")
    private String BeginAdditionData;

    @TableField("BeginSpeedingPosType")
    private Integer BeginSpeedingPosType;

    @TableField("UserId")
    private String UserId;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("EndInOutPosId")
    private Integer EndInOutPosId;

    @TableField("EndResidualFuel")
    private Double EndResidualFuel;

    @TableField("EndAlarmTime")
    private LocalDateTime EndAlarmTime;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("BeginExStateFlag")
    private Long BeginExStateFlag;

    @TableField("EndDrivingDuration")
    private Integer EndDrivingDuration;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("IsPunish")
    private Integer IsPunish;

    @TableField("BeginDrivingPathSectionId")
    private Integer BeginDrivingPathSectionId;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("BeginSpeedingPosId")
    private Integer BeginSpeedingPosId;

    @TableField("MinDeviation")
    private Integer MinDeviation;

    @TableField("EndStateFlag")
    private Long EndStateFlag;

    @TableField("EndSpeedingPosType")
    private Integer EndSpeedingPosType;

    @TableField("TargetName")
    private String TargetName;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("EndWirelessSignal")
    private Integer EndWirelessSignal;

    @TableField("EndAdditionData")
    private String EndAdditionData;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("Remark")
    private String Remark;

    @TableField("BeginAlarmTime")
    private LocalDateTime BeginAlarmTime;

    @TableField("BeginInOutPosId")
    private Integer BeginInOutPosId;

    @TableField("BeginResidualFuel")
    private Double BeginResidualFuel;

    @TableId("Id")
    private String Id;

    @TableField("BeginDirection")
    private Integer BeginDirection;

    @TableField("BeginDrivingFlag")
    private Integer BeginDrivingFlag;

    @TableField("EndExStateFlag")
    private Long EndExStateFlag;

    @TableField("BeginADRSpeed")
    private Double BeginADRSpeed;

    @TableField("EndDrivingPathSectionId")
    private Integer EndDrivingPathSectionId;

    @TableField("EndSpeedingPosId")
    private Integer EndSpeedingPosId;

    @TableField("AvgSpeed")
    private Double AvgSpeed;

    @TableField("LimitDuration")
    private Integer LimitDuration;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndADRSpeed")
    private Double EndADRSpeed;

    @TableField("SimNum")
    private String SimNum;

    @TableField("AlarmOverSee")
    private Integer AlarmOverSee;

    @TableField("BeginAltitude")
    private Integer BeginAltitude;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("BeginDrivingDuration")
    private Integer BeginDrivingDuration;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("EndDrivingFlag")
    private Integer EndDrivingFlag;

    @TableField("PunishId")
    private Integer PunishId;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("EndDirection")
    private Integer EndDirection;

    @TableField("MaxSpeed")
    private Double MaxSpeed;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
