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
@TableName("sys_UserOnline")
public class SysUseronline extends Model<SysUseronline> {

    private static final long serialVersionUID=1L;

    @TableField("UserId")
    private String UserId;

    @TableField("ServerPort")
    private String ServerPort;

    @TableField("LastTime")
    private LocalDateTime LastTime;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableField("IPAddress")
    private String IPAddress;

    @TableId("Id")
    private Integer Id;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("ServerIP")
    private String ServerIP;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
