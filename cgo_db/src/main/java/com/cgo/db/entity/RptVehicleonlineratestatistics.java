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
@TableName("rpt_VehicleOnLineRateStatistics")
public class RptVehicleonlineratestatistics extends Model<RptVehicleonlineratestatistics> {

    private static final long serialVersionUID=1L;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("Latitude2")
    private Double Latitude2;

    @TableField("Longitude1")
    private Double Longitude1;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Latitude1")
    private Double Latitude1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("Speed1")
    private Double Speed1;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Longitude2")
    private Double Longitude2;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
