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
@TableName("View_Vehicle")
public class ViewVehicle extends Model<ViewVehicle> {

    private static final long serialVersionUID=1L;

    @TableField("RegFlag")
    private Integer RegFlag;

    @TableField("TerminalTypeName")
    private String TerminalTypeName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("TerminalModel")
    private String TerminalModel;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("RealSimNum")
    private String RealSimNum;

    @TableField("FactoryPlateModel")
    private String FactoryPlateModel;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("ProtocolCode")
    private String ProtocolCode;

    @TableField("VehicleTypeCode")
    private Integer VehicleTypeCode;

    @TableField("Remark")
    private String Remark;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("TerminalId")
    private String TerminalId;

    @TableField("TerminalTypeId")
    private Integer TerminalTypeId;

    @TableField("HomeCity")
    private Integer HomeCity;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("TransTypeCode")
    private String TransTypeCode;

    @TableField("MauFacturer")
    private String MauFacturer;

    @TableField("AuthCode")
    private String AuthCode;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
