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
 * 驾驶员信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_Driver")
public class BasDriver extends Model<BasDriver> {

    private static final long serialVersionUID=1L;

    /**
     * 驾驶员身份证
     */
    @TableId("DriverID")
    private String DriverID;

    /**
     * 驾驶员姓名
     */
    @TableField("DriverName")
    private String DriverName;

    /**
     * 从业资格证
     */
    @TableField("DriverLicense")
    private String DriverLicense;

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

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("DrivingAge")
    private Integer DrivingAge;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("DriverPwd")
    private String DriverPwd;

    @TableField("DriverTelephone")
    private String DriverTelephone;

    @TableField("ContactAddress")
    private String ContactAddress;

    @TableField("SimNum")
    private String SimNum;

    @TableField("LeftFacePic")
    private byte[] LeftFacePic;

    @TableField("DrivingLevel")
    private String DrivingLevel;

    @TableField("MainDriver")
    private Integer MainDriver;

    @TableField("DriverNum")
    private String DriverNum;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("DrivingLicenseExpiryTime")
    private LocalDateTime DrivingLicenseExpiryTime;

    @TableField("DriverOrigin")
    private String DriverOrigin;

    @TableField("DriverLicensePic")
    private String DriverLicensePic;

    @TableField("JobLicenseExpiryTime")
    private LocalDateTime JobLicenseExpiryTime;

    @TableField("RightFacePic")
    private byte[] RightFacePic;

    private String evaluate;

    @TableField("Territory")
    private String Territory;

    @TableField("Sex")
    private Integer Sex;

    private byte[] pic;

    @TableField("UploadState")
    private String UploadState;

    @TableField("JobLicensePic")
    private String JobLicensePic;

    @TableField("Score")
    private Double Score;


    @Override
    protected Serializable pkVal() {
        return this.DriverID;
    }

}
