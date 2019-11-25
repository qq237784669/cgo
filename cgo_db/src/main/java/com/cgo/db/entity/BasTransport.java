package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 押运员信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_Transport")
public class BasTransport extends Model<BasTransport> {

    private static final long serialVersionUID=1L;

    /**
     * 押运员身份证
     */
    @TableId("TransportID")
    private String TransportID;

    /**
     * 押运员姓名
     */
    @TableField("TransportName")
    private String TransportName;

    /**
     * 从业资格证
     */
    @TableField("TransportLicense")
    private String TransportLicense;

    /**
     * 发证机构
     */
    @TableField("LicenseOrgName")
    private String LicenseOrgName;

    /**
     * 所属组织Id
     */
    @TableField("OrgId")
    private Integer OrgId;

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

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("SimNum")
    private String SimNum;

    @TableField("UseState")
    private String UseState;

    @TableField("UploadState")
    private String UploadState;

    private byte[] pic;

    private String evaluate;

    @TableField("TransportOrigin")
    private String TransportOrigin;

    @TableField("JobLicenseExpiryTime")
    private LocalDateTime JobLicenseExpiryTime;

    @TableField("TransportPwd")
    private String TransportPwd;

    @TableField("Sex")
    private Integer Sex;

    @TableField("TransportType")
    private Integer TransportType;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("OfficeTel")
    private String OfficeTel;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("TransportTelephone")
    private String TransportTelephone;

    @TableField("JobLicensePic")
    private String JobLicensePic;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;


    @Override
    protected Serializable pkVal() {
        return this.TransportID;
    }

}
