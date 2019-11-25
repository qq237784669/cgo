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
@TableName("rep_CustomerDefaultSetting")
public class RepCustomerdefaultsetting extends Model<RepCustomerdefaultsetting> {

    private static final long serialVersionUID=1L;

    @TableField("LogoPicImgStream")
    private byte[] LogoPicImgStream;

    @TableField("AlarmTitle")
    private String AlarmTitle;

    @TableField("Remark")
    private String Remark;

    @TableField("ServerVersion")
    private String ServerVersion;

    @TableField("BannerPicLinkUrl")
    private String BannerPicLinkUrl;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("AndroidVersionCode")
    private Integer AndroidVersionCode;

    @TableField("LoginBackPicLinkUrl")
    private String LoginBackPicLinkUrl;

    @TableField("BannerPicImgStream")
    private byte[] BannerPicImgStream;

    @TableField("IsUpdateByOnekey")
    private Boolean IsUpdateByOnekey;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("LoginBackPicImgStream")
    private byte[] LoginBackPicImgStream;

    @TableField("LoginAdsPicLinkUrl")
    private String LoginAdsPicLinkUrl;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AppUpdateLevel")
    private Integer AppUpdateLevel;

    @TableField("MapType")
    private String MapType;

    @TableField("AndroidVersionName")
    private String AndroidVersionName;

    @TableField("UpdateTimes")
    private Integer UpdateTimes;

    @TableField("Title")
    private String Title;

    @TableField("ProductCenterTitle")
    private String ProductCenterTitle;

    @TableField("IsSpecial")
    private Boolean IsSpecial;

    @TableField("IsReleaseServer")
    private Boolean IsReleaseServer;

    @TableField("AppDownloadUrl")
    private String AppDownloadUrl;

    @TableField("PlatformType")
    private String PlatformType;

    @TableField("LogoPicLinkUrl")
    private String LogoPicLinkUrl;

    @TableField("LoginAdsPicImgStream")
    private byte[] LoginAdsPicImgStream;

    @TableField("ProductCenterUrl")
    private String ProductCenterUrl;

    @TableField("ServerDownloadUrl")
    private String ServerDownloadUrl;

    @TableField("AppUpdateDigest")
    private String AppUpdateDigest;

    @TableField("Url")
    private String Url;

    @TableField("ReportTitle")
    private String ReportTitle;

    @TableField("IsReleaseAndroid")
    private Boolean IsReleaseAndroid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
