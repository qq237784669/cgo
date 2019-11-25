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
@TableName("View_adas_AlarmData")
public class ViewAdasAlarmdata extends Model<ViewAdasAlarmdata> {

    private static final long serialVersionUID=1L;

    @TableField("AlarmState")
    private Integer AlarmState;

    @TableField("Remark")
    private String Remark;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("TerminalId")
    private String TerminalId;

    @TableField("FileCount")
    private Integer FileCount;

    @TableField("PosTime")
    private LocalDateTime PosTime;

    @TableField("Speed")
    private Double Speed;

    @TableField("AlarmTime")
    private LocalDateTime AlarmTime;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("FlagNumber")
    private Integer FlagNumber;

    @TableField("AlarmLevel")
    private Integer AlarmLevel;

    @TableField("DriftType")
    private Integer DriftType;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("AlarmFlagNum")
    private String AlarmFlagNum;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("FrontDistance")
    private Double FrontDistance;

    @TableField("AlarmType")
    private Integer AlarmType;

    @TableField("RoadSignData")
    private Integer RoadSignData;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("TiredLevel")
    private Integer TiredLevel;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("FlagTime")
    private LocalDateTime FlagTime;

    @TableField("QualificationNum")
    private String QualificationNum;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("AdrSpeed")
    private Double AdrSpeed;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableField("DriverId")
    private String DriverId;

    @TableField("FrontSpeed")
    private Double FrontSpeed;

    @TableField("AlarmId")
    private String AlarmId;

    @TableField("RoadSignType")
    private Integer RoadSignType;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("EndAlarmTime")
    private LocalDateTime EndAlarmTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
