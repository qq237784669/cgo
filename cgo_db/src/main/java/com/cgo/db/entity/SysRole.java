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
 * 用户角色表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_Role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID=1L;

    /**
     * 角色Id
     */
    @TableId(value = "RoleId", type = IdType.AUTO)
    private Integer RoleId;

    /**
     * 角色名称
     */
    @TableField("RoleName")
    private String RoleName;

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

    @TableField("SearchCode")
    private String SearchCode;

    @TableField("ParentId")
    private Integer ParentId;

    @TableField("CreatedBy")
    private String CreatedBy;


    @Override
    protected Serializable pkVal() {
        return this.RoleId;
    }

}
