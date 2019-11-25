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
@TableName("biz_VehicleTransportRecord")
public class BizVehicletransportrecord extends Model<BizVehicletransportrecord> {

    private static final long serialVersionUID=1L;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("CarryingCapacity")
    private Double CarryingCapacity;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("TransportState")
    private Integer TransportState;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginLatituede")
    private Double BeginLatituede;

    private String id;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndLatitude")
    private Double EndLatitude;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
