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
@TableName("biz_JTBRegisterData")
public class BizJtbregisterdata extends Model<BizJtbregisterdata> {

    private static final long serialVersionUID=1L;

    @TableField("TerminalId")
    private String TerminalId;

    @TableField("OptCode")
    private Integer OptCode;

    @TableField("SoftWareVersionNo")
    private String SoftWareVersionNo;

    @TableField("TransType")
    private String TransType;

    @TableField("Remark")
    private String Remark;

    @TableField("OwnersName")
    private String OwnersName;

    @TableField("ManufacturerID")
    private String ManufacturerID;

    @TableField("CreateDate")
    private LocalDateTime CreateDate;

    @TableField("PatateColor")
    private String PatateColor;

    @TableField("ProvinceID")
    private Integer ProvinceID;

    @TableField("VehicleNationality")
    private String VehicleNationality;

    @TableField("IsSynSuccess")
    private Boolean IsSynSuccess;

    @TableField("CityID")
    private Integer CityID;

    @TableField("OwnersTel")
    private String OwnersTel;

    @TableField("TerminalModel")
    private String TerminalModel;

    @TableField("SimNum")
    private String SimNum;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("OwnersId")
    private String OwnersId;

    @TableField("VehicleType")
    private String VehicleType;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("AuthCode")
    private String AuthCode;

    @TableField("IMEI")
    private String imei;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
