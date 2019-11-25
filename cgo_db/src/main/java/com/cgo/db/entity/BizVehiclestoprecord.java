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
@TableName("biz_VehicleStopRecord")
public class BizVehiclestoprecord extends Model<BizVehiclestoprecord> {

    private static final long serialVersionUID=1L;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("RunState")
    private Integer RunState;

    @TableField("EndMileage")
    private Double EndMileage;

    private String id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginLatituede")
    private Double BeginLatituede;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
