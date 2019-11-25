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
 * 用户信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_User")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID=1L;

    /**
     * 用户账号
     */
    @TableId("UserId")
    private String UserId;

    /**
     * 用户姓名
     */
    @TableField("UserName")
    private String UserName;

    /**
     * 用户密码
     */
    @TableField("UserPwd")
    private String UserPwd;

    /**
     * 用户角色
     */
    @TableField("RoleId")
    private Integer RoleId;

    /**
     * 所属分组
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 电子邮件
     */
    @TableField("Email")
    private String Email;

    /**
     * 联系电话
     */
    @TableField("Telphone")
    private String Telphone;

    /**
     * 停用标识
     */
    @TableField("StopFlag")
    private Boolean StopFlag;

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

    @TableField("Province")
    private Integer Province;

    @TableField("UserLevel")
    private Integer UserLevel;

    @TableField("Industry")
    private String Industry;

    @TableField("LastLoginFailTime")
    private LocalDateTime LastLoginFailTime;

    @TableField("CompanyName")
    private String CompanyName;

    @TableField("Department")
    private String Department;

    @TableField("UserType")
    private Integer UserType;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("Post")
    private String Post;

    @TableField("LoginFailCount")
    private Integer LoginFailCount;

    @TableField("RoleList")
    private String RoleList;

    @TableField("IsHead")
    private Boolean IsHead;

    @TableField("ExpiryDate")
    private LocalDateTime ExpiryDate;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
