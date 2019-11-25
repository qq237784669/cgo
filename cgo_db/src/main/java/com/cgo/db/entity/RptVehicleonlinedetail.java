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
@TableName("rpt_VehicleOnLineDetail")
public class RptVehicleonlinedetail extends Model<RptVehicleonlinedetail> {

    private static final long serialVersionUID=1L;

    /**
     * 在线时长/离线时长
     */
    @TableField("SpanTime")
    private Integer SpanTime;

    /**
     * 1：在线，2：断线
     */
    @TableField("DataType")
    private String DataType;

    @TableField("Longitude2")
    private Double Longitude2;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("Id")
    private Integer Id;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("OperateStatuFlag")
    private Integer OperateStatuFlag;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("Longitude1")
    private Double Longitude1;

    @TableField("Latitude2")
    private Double Latitude2;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("Latitude1")
    private Double Latitude1;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
