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
@TableName("biz_AlarmData809")
public class BizAlarmdata809 extends Model<BizAlarmdata809> {

    private static final long serialVersionUID=1L;

    @TableField("BeginAltitude")
    private Integer BeginAltitude;

    @TableField("BeginDirection")
    private Integer BeginDirection;

    @TableField("BeginAlarmTime")
    private LocalDateTime BeginAlarmTime;

    @TableField("BeginInOutPosId")
    private Integer BeginInOutPosId;

    @TableField("LimitDuration")
    private Integer LimitDuration;

    @TableField("EndDrivingPathSectionId")
    private Integer EndDrivingPathSectionId;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("EndSpeedingPosId")
    private Integer EndSpeedingPosId;

    @TableField("BeginResidualFuel")
    private Double BeginResidualFuel;

    @TableField("TargetName")
    private String TargetName;

    @TableField("BeginDrivingFlag")
    private Integer BeginDrivingFlag;

    @TableField("EndExStateFlag")
    private Long EndExStateFlag;

    @TableField("BeginSpeedingPosType")
    private Integer BeginSpeedingPosType;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndDrivingFlag")
    private Integer EndDrivingFlag;

    @TableField("EndResidualFuel")
    private Double EndResidualFuel;

    @TableField("EndADRSpeed")
    private Double EndADRSpeed;

    @TableField("EndDirection")
    private Integer EndDirection;

    @TableField("MaxSpeed")
    private Double MaxSpeed;

    @TableField("EndAlarmTime")
    private LocalDateTime EndAlarmTime;

    @TableField("EndInOutPosId")
    private Integer EndInOutPosId;

    @TableField("BeginWirelessSignal")
    private Integer BeginWirelessSignal;

    @TableField("BeginDrivingDuration")
    private Integer BeginDrivingDuration;

    @TableField("EndTrackId")
    private String EndTrackId;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginAdditionData")
    private String BeginAdditionData;

    @TableField("BeginSpeedingPosId")
    private Integer BeginSpeedingPosId;

    @TableField("MinSpeed")
    private Double MinSpeed;

    @TableField("MaxDeviation")
    private Integer MaxDeviation;

    @TableField("BeginStateFlag")
    private Long BeginStateFlag;

    @TableField("EndDrivingDuration")
    private Integer EndDrivingDuration;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("BeginDrivingPathSectionId")
    private Integer BeginDrivingPathSectionId;

    @TableField("UserId")
    private String UserId;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableId("Id")
    private String Id;

    @TableField("EndWirelessSignal")
    private Integer EndWirelessSignal;

    @TableField("TargetId")
    private Integer TargetId;

    @TableField("BeginExStateFlag")
    private Long BeginExStateFlag;

    @TableField("BeginTrackId")
    private String BeginTrackId;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("AvgSpeed")
    private Double AvgSpeed;

    @TableField("BeginADRSpeed")
    private Double BeginADRSpeed;

    @TableField("EndAdditionData")
    private String EndAdditionData;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("EndSpeedingPosType")
    private Integer EndSpeedingPosType;

    @TableField("MinDeviation")
    private Integer MinDeviation;

    @TableField("EndStateFlag")
    private Long EndStateFlag;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
