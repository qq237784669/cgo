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
@TableName("Wx2_Log")
public class Wx2Log extends Model<Wx2Log> {

    private static final long serialVersionUID=1L;

    @TableId("OpenID")
    private String OpenID;

    @TableField("UserPwd")
    private String UserPwd;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("PlatformUrl")
    private String PlatformUrl;

    @TableField("PlatformName")
    private String PlatformName;

    @TableField("HasLogin")
    private Integer HasLogin;

    @TableField("LastLoginTime")
    private LocalDateTime LastLoginTime;

    @TableField("UserID")
    private String UserID;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableField("UserOrgName")
    private String UserOrgName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("UserType")
    private String UserType;

    @TableField("PlatformCode")
    private String PlatformCode;


    @Override
    protected Serializable pkVal() {
        return this.OpenID;
    }

}
