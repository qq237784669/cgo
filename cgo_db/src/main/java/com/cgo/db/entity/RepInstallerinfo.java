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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rep_InstallerInfo")
public class RepInstallerinfo extends Model<RepInstallerinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 安装人员ID
     */
    @TableId("InstallerId")
    private String InstallerId;

    /**
     * 安装人员姓名
     */
    @TableField("InstallerName")
    private String InstallerName;

    /**
     * 登录密码
     */
    @TableField("Pwd")
    private String Pwd;

    /**
     * 联系电话
     */
    @TableField("Telephone")
    private String Telephone;

    /**
     * 停用标识(0：正常 1：停用)
     */
    @TableField("StopFlag")
    private Boolean StopFlag;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 创建人
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("BDChannelId")
    private String BDChannelId;

    @TableField("StaffType")
    private Integer StaffType;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("BDTokenId")
    private String BDTokenId;

    @TableField("MobileOS")
    private Integer MobileOS;


    @Override
    protected Serializable pkVal() {
        return this.InstallerId;
    }

}
