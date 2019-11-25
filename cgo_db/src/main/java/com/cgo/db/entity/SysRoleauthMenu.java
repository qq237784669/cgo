package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色菜单权限表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_RoleAuth_Menu")
public class SysRoleauthMenu extends Model<SysRoleauthMenu> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 角色Id
     */
    @TableField("RoleId")
    private Integer RoleId;

    /**
     * 菜单代码
     */
    @TableField("MenuCode")
    private String MenuCode;

    /**
     * 菜单权限
     */
    @TableField("MenuAuth")
    private String MenuAuth;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
