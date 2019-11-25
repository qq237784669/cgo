package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_VehicleDynamicMonitorRecord")
public class BizVehicledynamicmonitorrecord extends Model<BizVehicledynamicmonitorrecord> {

    private static final long serialVersionUID=1L;

    @TableField("ProcessResult")
    private String ProcessResult;

    @TableField("ADRSpeed")
    private String ADRSpeed;

    @TableField("TrackLineState")
    private Integer TrackLineState;

    @TableField("IsOnline")
    private Boolean IsOnline;

    @TableField("CameraLocation")
    private Integer CameraLocation;

    @TableField("IsFill")
    private Boolean IsFill;

    @TableField("IsADRDataNormal")
    private Boolean IsADRDataNormal;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Processor")
    private String Processor;

    @TableField("OtherIllegal")
    private String OtherIllegal;

    @TableField("IsOverTimeDrive")
    private Boolean IsOverTimeDrive;

    @TableField("LastQueryTime")
    private LocalDateTime LastQueryTime;

    @TableField("Remark")
    private String Remark;

    @TableField("GpsSpeed")
    private String GpsSpeed;

    @TableField("LastQueryPos")
    private String LastQueryPos;

    @TableField("CameraState")
    private Integer CameraState;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("FeedbackTime")
    private LocalDateTime FeedbackTime;

    @TableField("TrackState")
    private Integer TrackState;

    @TableField("ProcessMethod")
    private String ProcessMethod;

    @TableField("ADRUnnormalData")
    private String ADRUnnormalData;

    @TableField("RecordTime")
    private LocalDateTime RecordTime;

    @TableField("OtherTrackState")
    private String OtherTrackState;

    @TableField("ProcessTime")
    private LocalDateTime ProcessTime;

    @TableField("IsOverSpeed")
    private Boolean IsOverSpeed;

    @TableField("BadCameraNum")
    private String BadCameraNum;

    @TableField("IsDriveBeforeDawn")
    private Boolean IsDriveBeforeDawn;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
