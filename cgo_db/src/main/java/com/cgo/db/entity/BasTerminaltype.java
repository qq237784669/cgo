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
 * 终端类型
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_TerminalType")
public class BasTerminaltype extends Model<BasTerminaltype> {

    private static final long serialVersionUID=1L;

    /**
     * 终端类型Id
     */
    @TableId(value = "TerminalTypeId", type = IdType.AUTO)
    private Integer TerminalTypeId;

    /**
     * 终端类型名称
     */
    @TableField("TerminalTypeName")
    private String TerminalTypeName;

    /**
     * 协议代码
     */
    @TableField("ProtocolCode")
    private String ProtocolCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("FactoryPlateModel")
    private String FactoryPlateModel;

    @TableField("KindName")
    private String KindName;

    @TableField("DVRTypeCode")
    private String DVRTypeCode;

    @TableField("FactoryNum")
    private String FactoryNum;

    @TableField("IsSafeEquipType")
    private Boolean IsSafeEquipType;

    @TableField("DVRUserID")
    private String DVRUserID;

    @TableField("RecorderVersion")
    private String RecorderVersion;

    @TableField("ChanelNumInfo")
    private String ChanelNumInfo;

    @TableField("TerminalModel")
    private String TerminalModel;

    @TableField("VideoServerIP")
    private String VideoServerIP;

    @TableField("BSDEquip")
    private Integer BSDEquip;

    @TableField("ADASEquip")
    private Integer ADASEquip;

    @TableField("MauFacturer")
    private String MauFacturer;

    @TableField("DVRUserPwd")
    private String DVRUserPwd;

    @TableField("IsDVREquip")
    private Boolean IsDVREquip;

    @TableField("IsIntegrated")
    private Boolean IsIntegrated;

    @TableField("DSMEquip")
    private Integer DSMEquip;

    @TableField("IconCode")
    private String IconCode;

    @TableField("VideoServerPort")
    private String VideoServerPort;

    @TableField("TPMSEquip")
    private Integer TPMSEquip;

    @TableField("Icon")
    private String Icon;

    @TableField("BrandCode")
    private String BrandCode;

    @TableField("DVRChannelNum")
    private Integer DVRChannelNum;


    @Override
    protected Serializable pkVal() {
        return this.TerminalTypeId;
    }

}
