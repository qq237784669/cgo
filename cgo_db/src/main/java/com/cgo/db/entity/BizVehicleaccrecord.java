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
@TableName("biz_VehicleAccRecord")
public class BizVehicleaccrecord extends Model<BizVehicleaccrecord> {

    private static final long serialVersionUID=1L;

    @TableField("BeginLatituede")
    private Double BeginLatituede;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("ACCState")
    private Integer ACCState;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndLatitude")
    private Double EndLatitude;

    private String id;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;

    @TableField("BeginSpeed")
    private Double BeginSpeed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
