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
@TableName("rpt_OfflineDriftAlarmDetail")
public class RptOfflinedriftalarmdetail extends Model<RptOfflinedriftalarmdetail> {

    private static final long serialVersionUID=1L;

    @TableField("Longitude1")
    private Double Longitude1;

    @TableField("Latitude2")
    private Double Latitude2;

    @TableField("StateFlag1")
    private Long StateFlag1;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("Id")
    private Integer Id;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Latitude1")
    private Double Latitude1;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Drift")
    private Double Drift;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("StateFlag2")
    private Long StateFlag2;

    @TableField("Longitude2")
    private Double Longitude2;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
