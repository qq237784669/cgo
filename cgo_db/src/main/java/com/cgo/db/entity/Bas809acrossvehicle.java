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
@TableName("bas_809AcrossVehicle")
public class Bas809acrossvehicle extends Model<Bas809acrossvehicle> {

    private static final long serialVersionUID=1L;

    @TableField("RoadTransportId")
    private String RoadTransportId;

    @TableField("DriverInfo")
    private String DriverInfo;

    @TableField("OwnerTel")
    private String OwnerTel;

    @TableField("RTOLN")
    private String rtoln;

    @TableField("TransType")
    private String TransType;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("Owner")
    private String Owner;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("OrigVehicleId")
    private Integer OrigVehicleId;

    @TableField("OrigOwnerId")
    private Integer OrigOwnerId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("VehicleType")
    private Integer VehicleType;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("VehicleColor")
    private Integer VehicleColor;

    @TableField("HomeCity")
    private Integer HomeCity;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
