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
@TableName("biz_AttachServerConfig")
public class BizAttachserverconfig extends Model<BizAttachserverconfig> {

    private static final long serialVersionUID=1L;

    /**
     * 逻辑机器ID
     */
    @TableId("MachineID")
    private Integer MachineID;

    /**
     * 类别
     */
    @TableField("ServerType")
    private String ServerType;

    /**
     * 内网IP
     */
    @TableField("InnerIP")
    private String InnerIP;

    /**
     * 设备侧IP
     */
    @TableField("TermIp")
    private String TermIp;

    /**
     * 设备侧端口
     */
    @TableField("TermPort")
    private Integer TermPort;

    /**
     * 设备侧UDP端口
     */
    @TableField("TermUdpPort")
    private Integer TermUdpPort;

    /**
     * 用户侧IP
     */
    @TableField("UserIp")
    private String UserIp;

    /**
     * 用户侧端口
     */
    @TableField("UserPort")
    private Integer UserPort;

    /**
     * 用户侧UDP端口
     */
    @TableField("UserUdpPort")
    private Integer UserUdpPort;

    /**
     * 用户名
     */
    @TableField("UserName")
    private String UserName;

    /**
     * 密码
     */
    @TableField("UserPwd")
    private String UserPwd;

    /**
     * 本地存储目录
     */
    @TableField("LocalFolder")
    private String LocalFolder;

    /**
     * 虚拟目录
     */
    @TableField("VirtualPath")
    private String VirtualPath;

    /**
     * 是否删除
     */
    @TableField("IsDel")
    private Integer IsDel;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("Id")
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.MachineID;
    }

}
