package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("rep_Customer")
public class RepCustomer extends Model<RepCustomer> {

    private static final long serialVersionUID=1L;

    @TableField("ServerVersion")
    private String ServerVersion;

    @TableField("PlatformType")
    private String PlatformType;

    @TableField("LoginBackPicImgStream")
    private byte[] LoginBackPicImgStream;

    @TableField("IsUpdateByOnekey")
    private Boolean IsUpdateByOnekey;

    @TableField("LoginAdsPicLinkUrl")
    private String LoginAdsPicLinkUrl;

    @TableField("AppUpdateLevel")
    private Integer AppUpdateLevel;

    @TableField("AndroidVersionCode")
    private Integer AndroidVersionCode;

    @TableField("MapType")
    private String MapType;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AlarmTitle")
    private String AlarmTitle;

    @TableField("LogoPicImgStream")
    private byte[] LogoPicImgStream;

    @TableField("ServerDownloadUrl")
    private String ServerDownloadUrl;

    @TableField("Url")
    private String Url;

    @TableField("AppUpdateDigest")
    private String AppUpdateDigest;

    @TableField("Remark")
    private String Remark;

    @TableField("BannerPicLinkUrl")
    private String BannerPicLinkUrl;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("LoginBackPicLinkUrl")
    private String LoginBackPicLinkUrl;

    @TableField("LoginAdsPicImgStream")
    private byte[] LoginAdsPicImgStream;

    @TableField("ProductCenterUrl")
    private String ProductCenterUrl;

    @TableField("UpdateTimes")
    private Integer UpdateTimes;

    @TableField("ReportTitle")
    private String ReportTitle;

    @TableField("IsReleaseAndroid")
    private Boolean IsReleaseAndroid;

    @TableField("IsSpecial")
    private Boolean IsSpecial;

    @TableField("LogoPicLinkUrl")
    private String LogoPicLinkUrl;

    @TableId("Code")
    private String Code;

    @TableField("BannerPicImgStream")
    private byte[] BannerPicImgStream;

    @TableField("AndroidVersionName")
    private String AndroidVersionName;

    @TableField("Title")
    private String Title;

    @TableField("ProductCenterTitle")
    private String ProductCenterTitle;

    @TableField("IsReleaseServer")
    private Boolean IsReleaseServer;

    @TableField("AppDownloadUrl")
    private String AppDownloadUrl;

    @TableField("CustomerName")
    private String CustomerName;


    @Override
    protected Serializable pkVal() {
        return this.Code;
    }

}
