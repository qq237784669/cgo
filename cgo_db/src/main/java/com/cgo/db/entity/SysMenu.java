package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_Menu")
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID=1L;

    /**
     * 菜单代码
     */
    @TableId("MenuCode")
    private String MenuCode;

    /**
     * 菜单名称
     */
    @TableField("MenuName")
    private String MenuName;

    /**
     * 菜单顺序
     */
    @TableField("MenuOrder")
    private Integer MenuOrder;

    /**
     * 菜单类型 0 组  1 页面
     */
    @TableField("MenuType")
    private Integer MenuType;

    /**
     * 父级代码
     */
    @TableField("ParentCode")
    private String ParentCode;

    /**
     * 链接地址
     */
    @TableField("MenuLink")
    private String MenuLink;

    /**
     * 最大权限
     */
    @TableField("MaxAuth")
    private String MaxAuth;

    /**
     * 所属系统模块
     */
    @TableField("ModuleCode")
    private String ModuleCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("PageLayout")
    private String PageLayout;


    @Override
    protected Serializable pkVal() {
        return this.MenuCode;
    }

}
