package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("rpt_SpeedingAlarmByOptType")
public class RptSpeedingalarmbyopttype extends Model<RptSpeedingalarmbyopttype> {

    private static final long serialVersionUID=1L;

    @TableField("Lon1")
    private Double Lon1;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("Lon2")
    private Double Lon2;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Lat1")
    private Double Lat1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SpeedingTime")
    private Integer SpeedingTime;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("Speed2")
    private Double Speed2;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("Lat2")
    private Double Lat2;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
