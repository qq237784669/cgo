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
@TableName("rpt_AlarmDetail")
public class RptAlarmdetail extends Model<RptAlarmdetail> {

    private static final long serialVersionUID=1L;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("TachographSpeed")
    private Double TachographSpeed;

    @TableField("Longitude2")
    private Double Longitude2;

    @TableField("Speed")
    private Double Speed;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Longitude1")
    private Double Longitude1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("AdditionData")
    private String AdditionData;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("SpeedingTime")
    private Integer SpeedingTime;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("Latitude1")
    private Double Latitude1;

    @TableField("Id")
    private Long Id;

    @TableField("Latitude2")
    private Double Latitude2;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
