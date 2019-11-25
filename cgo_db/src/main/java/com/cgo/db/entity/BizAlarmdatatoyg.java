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
@TableName("biz_AlarmDataToYG")
public class BizAlarmdatatoyg extends Model<BizAlarmdatatoyg> {

    private static final long serialVersionUID=1L;

    @TableField("BeginAltitude")
    private Integer BeginAltitude;

    @TableField("BeginLat")
    private Double BeginLat;

    @TableField("EndVehicleStatus")
    private Long EndVehicleStatus;

    @TableField("BeginAlarmStatus")
    private Long BeginAlarmStatus;

    @TableField("AlarmType")
    private Long AlarmType;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("BeginSpeed")
    private Integer BeginSpeed;

    @TableField("Id")
    private Integer Id;

    @TableField("EndLng")
    private Double EndLng;

    @TableField("EndDirection")
    private Integer EndDirection;

    @TableField("BeginVehicleStatus")
    private Long BeginVehicleStatus;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndLat")
    private Double EndLat;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndAlarmStatus")
    private Long EndAlarmStatus;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("BeginDirection")
    private Integer BeginDirection;

    @TableField("BeginLng")
    private Double BeginLng;

    @TableField("EndSpeed")
    private Integer EndSpeed;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
