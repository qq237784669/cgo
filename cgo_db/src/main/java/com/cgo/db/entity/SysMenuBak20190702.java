package com.cgo.db.entity;

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
public class SysMenuBak20190702 extends Model<SysMenuBak20190702> {

    private static final long serialVersionUID=1L;

    @TableField("MaxAuth")
    private String MaxAuth;

    @TableField("PageLayout")
    private String PageLayout;

    @TableField("ParentCode")
    private String ParentCode;

    @TableField("MenuName")
    private String MenuName;

    @TableField("ModuleCode")
    private String ModuleCode;

    @TableField("Remark")
    private String Remark;

    @TableField("MenuOrder")
    private Integer MenuOrder;

    @TableField("MenuLink")
    private String MenuLink;

    @TableField("MenuCode")
    private String MenuCode;

    @TableField("MenuType")
    private Integer MenuType;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
