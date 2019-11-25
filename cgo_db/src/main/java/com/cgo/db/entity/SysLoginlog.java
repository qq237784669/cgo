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
 * 用户登录日志表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_LoginLog")
public class SysLoginlog extends Model<SysLoginlog> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 用户账号
     */
    @TableField("UserId")
    private String UserId;

    /**
     * IP地址
     */
    @TableField("IPAddress")
    private String IPAddress;

    /**
     * 系统模块代码
     */
    @TableField("ModuleCode")
    private String ModuleCode;

    /**
     * 登录标识
     */
    @TableField("ClientId")
    private String ClientId;

    /**
     * 登录时间
     */
    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    /**
     * 退出时间
     */
    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    /**
     * 退出原因
     */
    @TableField("LogoutReason")
    private String LogoutReason;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
