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
 * 系统模块表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_Module")
public class SysModule extends Model<SysModule> {

    private static final long serialVersionUID=1L;

    /**
     * 系统模块代码
     */
    @TableId("ModuleCode")
    private String ModuleCode;

    /**
     * 系统模块名称
     */
    @TableField("ModuleName")
    private String ModuleName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("loadMode")
    private String loadMode;

    @TableField("ModuleOrder")
    private Integer ModuleOrder;

    @TableField("Url")
    private String Url;


    @Override
    protected Serializable pkVal() {
        return this.ModuleCode;
    }

}
