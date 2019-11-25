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
 * 全局配置表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_Config")
public class SysConfig extends Model<SysConfig> {

    private static final long serialVersionUID=1L;

    /**
     * 参数键
     */
    @TableId("Key")
    private String Key;

    /**
     * 参数值
     */
    @TableField("Value")
    private String Value;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("FromModule")
    private String FromModule;

    @TableField("IsConfigurable")
    private Integer IsConfigurable;


    @Override
    protected Serializable pkVal() {
        return this.Key;
    }

}
