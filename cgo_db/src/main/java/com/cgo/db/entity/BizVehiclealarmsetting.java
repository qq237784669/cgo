package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("biz_VehicleAlarmSetting")
public class BizVehiclealarmsetting extends Model<BizVehiclealarmsetting> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆ID
     */
    @TableId("VehicleId")
    private Integer VehicleId;

    /**
     * 是否开启超速报警
     */
    @TableField("EnableSpeed")
    private Boolean EnableSpeed;

    /**
     * 限制速度
     */
    @TableField("SpeedLimit")
    private Integer SpeedLimit;

    /**
     * 预警差值， 0表示不进行预警提示
     */
    @TableField("WarnDiff")
    private Integer WarnDiff;

    /**
     * 是否开启夜间超速报警
     */
    @TableField("EnableNightSpeed")
    private Boolean EnableNightSpeed;

    /**
     * 夜间限速(存储为百分比)
     */
    @TableField("NightSpeedLimit")
    private Integer NightSpeedLimit;

    /**
     * 夜间限速开始时间
     */
    @TableField("NightSpeedBeginTime")
    private String NightSpeedBeginTime;

    /**
     * 夜间限速结束时间
     */
    @TableField("NightSpeedEndTime")
    private String NightSpeedEndTime;

    /**
     * 是否开启疲劳驾驶报警
     */
    @TableField("EnableTiredDrive")
    private Boolean EnableTiredDrive;

    /**
     * 连续驾驶时长，单位：分钟
     */
    @TableField("DriveTime")
    private Integer DriveTime;

    /**
     * 休息时长，单位：分钟
     */
    @TableField("RestTime")
    private Integer RestTime;

    /**
     * 是否开启夜间疲劳驾驶报警
     */
    @TableField("EnableNightTiredDrive")
    private Boolean EnableNightTiredDrive;

    /**
     * 夜间连续驾驶时长，单位：分钟
     */
    @TableField("NightDriveTime")
    private Integer NightDriveTime;

    /**
     * 夜间休息时长，单位：分钟
     */
    @TableField("NightRestTime")
    private Integer NightRestTime;

    /**
     * 夜间限速开始时间
     */
    @TableField("NightDriveBeginTime")
    private String NightDriveBeginTime;

    /**
     * 夜间限速结束时间
     */
    @TableField("NightDriveEndTime")
    private String NightDriveEndTime;

    /**
     * 是否开启夜间禁行
     */
    @TableField("EnableForbid")
    private Boolean EnableForbid;

    /**
     * 禁行开始时间
     */
    @TableField("ForbidBeginTime")
    private String ForbidBeginTime;

    /**
     * 禁行结束时间
     */
    @TableField("ForbidEndTime")
    private String ForbidEndTime;

    /**
     * 禁行行驶速度，大于此速度的算禁行
     */
    @TableField("ForbidSpeed")
    private Integer ForbidSpeed;

    /**
     * 是否开启掉线报警
     */
    @TableField("EnableOffline")
    private Boolean EnableOffline;

    /**
     * 掉线时长，单位：分钟
     */
    @TableField("OfflineTime")
    private Integer OfflineTime;

    /**
     * 最后更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 更新用户ID
     */
    @TableField("UpdateUserId")
    private String UpdateUserId;

    /**
     * 高速限速值
     */
    @TableField("ExpySpeedLimit")
    private Integer ExpySpeedLimit;

    /**
     * 禁行持续时长
     */
    @TableField("ForbidDurationTime")
    private Integer ForbidDurationTime;

    @TableField("LowSpeedLimit")
    private Integer LowSpeedLimit;

    @TableField("PosAbnormalDriveTime")
    private Integer PosAbnormalDriveTime;

    @TableField("AbnormalOfflineTime")
    private Integer AbnormalOfflineTime;

    @TableField("LoadSpeedThreshold")
    private Integer LoadSpeedThreshold;

    @TableField("SpeedDurationTime")
    private Integer SpeedDurationTime;

    @TableField("AbnormalOfflineSpeed")
    private Integer AbnormalOfflineSpeed;

    @TableField("SpeedLastTime")
    private String SpeedLastTime;

    @TableField("NationalSpeedLimit")
    private Integer NationalSpeedLimit;

    @TableField("AccOutLocationDriveTime")
    private Integer AccOutLocationDriveTime;

    @TableField("LoadStartTime")
    private String LoadStartTime;

    @TableField("AbnormalOfflineMileage")
    private Integer AbnormalOfflineMileage;

    @TableField("ProvincialSpeedLimit")
    private Integer ProvincialSpeedLimit;

    @TableField("AccAbnormaDriveTime")
    private Integer AccAbnormaDriveTime;

    @TableField("EnableRoadRealSpeed")
    private Boolean EnableRoadRealSpeed;

    @TableField("ForbidType")
    private Integer ForbidType;

    @TableField("EnableLoadAlarm")
    private Boolean EnableLoadAlarm;

    @TableField("SpeedAlarmAtOnce")
    private Integer SpeedAlarmAtOnce;

    @TableField("DriveWarnDiff")
    private Integer DriveWarnDiff;

    @TableField("IsOpenAccAbnormalAlarm")
    private Boolean IsOpenAccAbnormalAlarm;

    @TableField("LowSpeedTime")
    private Integer LowSpeedTime;

    @TableField("IsOpenPosAbnormalAlarm")
    private Boolean IsOpenPosAbnormalAlarm;

    @TableField("LoadEndTime")
    private String LoadEndTime;

    @TableField("AccAbnormaLimitSpeed")
    private Integer AccAbnormaLimitSpeed;

    @TableField("CountrySpeedLimit")
    private Integer CountrySpeedLimit;

    @TableField("EnableDivideRoadLevel")
    private Boolean EnableDivideRoadLevel;

    @TableField("EnableLowSpeedAlarm")
    private Boolean EnableLowSpeedAlarm;

    @TableField("IsOpenAccOutLocation")
    private Boolean IsOpenAccOutLocation;

    @TableField("EnableAbnormalOffline")
    private Integer EnableAbnormalOffline;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
