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
@TableName("sys_UserOnline_BS")
public class SysUseronlineBs extends Model<SysUseronlineBs> {

    private static final long serialVersionUID=1L;

    /**
     * 账号
     */
    @TableField("UserId")
    private String UserId;

    /**
     * IP地址
     */
    @TableField("IPAddress")
    private String IPAddress;

    /**
     * 对话ID
     */
    @TableField("SessionId")
    private String SessionId;

    /**
     * 登录时间
     */
    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    /**
     * 最后更新时间
     */
    @TableField("LastTime")
    private LocalDateTime LastTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
