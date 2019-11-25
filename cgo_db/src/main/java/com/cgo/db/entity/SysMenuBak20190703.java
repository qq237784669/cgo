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
public class SysMenuBak20190703 extends Model<SysMenuBak20190703> {

    private static final long serialVersionUID=1L;

    @TableField("MenuLink")
    private String MenuLink;

    @TableField("Remark")
    private String Remark;

    @TableField("PageLayout")
    private String PageLayout;

    @TableField("MenuType")
    private Integer MenuType;

    @TableField("MenuCode")
    private String MenuCode;

    @TableField("MaxAuth")
    private String MaxAuth;

    @TableField("ModuleCode")
    private String ModuleCode;

    @TableField("ParentCode")
    private String ParentCode;

    @TableField("MenuName")
    private String MenuName;

    @TableField("MenuOrder")
    private Integer MenuOrder;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
