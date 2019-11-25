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
@TableName("biz_809AcrossVehiclePos")
public class Biz809acrossvehiclepos extends Model<Biz809acrossvehiclepos> {

    private static final long serialVersionUID=1L;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("StayCity")
    private Integer StayCity;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("Direction")
    private Integer Direction;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Speed")
    private Double Speed;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("StayDate")
    private LocalDateTime StayDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
