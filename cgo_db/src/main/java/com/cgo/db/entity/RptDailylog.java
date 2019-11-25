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
@TableName("rpt_DailyLog")
public class RptDailylog extends Model<RptDailylog> {

    private static final long serialVersionUID=1L;

    @TableField("SpeedOver5Detail")
    private Integer SpeedOver5Detail;

    @TableField("AdasAlarmCount")
    private Integer AdasAlarmCount;

    @TableField("OnLineDetail")
    private Integer OnLineDetail;

    @TableField("CreateDate")
    private LocalDateTime CreateDate;

    @TableField("DataSummaryAnly")
    private Integer DataSummaryAnly;

    @TableField("CountStat")
    private Boolean CountStat;

    @TableField("AlarmDetail")
    private Integer AlarmDetail;

    @TableField("DriverAlarmCount")
    private Integer DriverAlarmCount;

    @TableField("CountType")
    private Integer CountType;

    @TableField("Remark")
    private String Remark;

    @TableField("Id")
    private Long Id;

    @TableField("OverTimeDrive")
    private Integer OverTimeDrive;

    @TableField("ACCDetail")
    private Boolean ACCDetail;

    @TableField("TrackDataDetail")
    private Integer TrackDataDetail;

    @TableField("OffLineCount")
    private Integer OffLineCount;

    @TableField("SpeedDetail")
    private Boolean SpeedDetail;

    @TableField("BanDrivingDetail")
    private Integer BanDrivingDetail;

    @TableId("GpsDate")
    private LocalDateTime GpsDate;


    @Override
    protected Serializable pkVal() {
        return this.GpsDate;
    }

}
