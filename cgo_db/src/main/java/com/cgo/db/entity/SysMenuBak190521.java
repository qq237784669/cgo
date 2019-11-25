package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("sys_Menu_bak190521")
public class SysMenuBak190521 extends Model<SysMenuBak190521> {

    private static final long serialVersionUID=1L;

    @TableField("ModuleCode")
    private String ModuleCode;

    @TableField("MenuLink")
    private String MenuLink;

    @TableField("MenuOrder")
    private Integer MenuOrder;

    @TableField("Remark")
    private String Remark;

    @TableField("MenuType")
    private Integer MenuType;

    @TableField("PageLayout")
    private String PageLayout;

    @TableField("MaxAuth")
    private String MaxAuth;

    @TableField("MenuCode")
    private String MenuCode;

    @TableField("MenuName")
    private String MenuName;

    @TableField("ParentCode")
    private String ParentCode;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
