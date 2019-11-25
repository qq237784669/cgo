package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("rpt_ContainerMileage")
public class RptContainermileage extends Model<RptContainermileage> {

    private static final long serialVersionUID=1L;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("IfMoving")
    private Boolean IfMoving;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
