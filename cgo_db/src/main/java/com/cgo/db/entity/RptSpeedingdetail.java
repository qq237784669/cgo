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
@TableName("rpt_SpeedingDetail")
public class RptSpeedingdetail extends Model<RptSpeedingdetail> {

    private static final long serialVersionUID=1L;

    @TableField("MinSpeed")
    private Double MinSpeed;

    @TableField("Lon1")
    private Double Lon1;

    @TableField("AvgTachographSpeed")
    private Double AvgTachographSpeed;

    @TableField("PathName")
    private String PathName;

    @TableField("Distance2")
    private Double Distance2;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("SpeedingTime")
    private Integer SpeedingTime;

    @TableField("AvgSpeed")
    private Double AvgSpeed;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Continue2MinAvgSpeed")
    private Double Continue2MinAvgSpeed;

    @TableField("Lat1")
    private Double Lat1;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("Lon2")
    private Double Lon2;

    @TableField("MaxSpeed")
    private Double MaxSpeed;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("MaxTachographSpeed")
    private Double MaxTachographSpeed;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("MinTachographSpeed")
    private Double MinTachographSpeed;

    @TableField("Distance1")
    private Double Distance1;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("LimitSpeedType")
    private Integer LimitSpeedType;

    @TableField("Lat2")
    private Double Lat2;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
