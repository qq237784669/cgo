package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("View_UserVehicle")
public class ViewUservehicle extends Model<ViewUservehicle> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("LineCode")
    private Integer LineCode;

    @TableField("TerminalTypeId")
    private Integer TerminalTypeId;

    @TableField("ADASEquip")
    private Integer ADASEquip;

    @TableField("TPMSEquip")
    private Integer TPMSEquip;

    @TableField("TransTypeCode")
    private String TransTypeCode;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("BSDEquip")
    private Integer BSDEquip;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("RealSimNum")
    private String RealSimNum;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("VehicleTypeCode")
    private Integer VehicleTypeCode;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("OldPlateNum")
    private String OldPlateNum;

    @TableField("DSMEquip")
    private Integer DSMEquip;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
