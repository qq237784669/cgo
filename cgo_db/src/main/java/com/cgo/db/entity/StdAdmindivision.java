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
 * 行政区划代码表 按照GB/T 2260 中的规定
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("std_AdminDivision")
public class StdAdmindivision extends Model<StdAdmindivision> {

    private static final long serialVersionUID=1L;

    /**
     * 行政区划代码
     */
    @TableId("ADCode")
    private Integer ADCode;

    /**
     * 行政区划名称
     */
    @TableField("ADName")
    private String ADName;

    /**
     * 级别
     */
    @TableField("ADLevel")
    private Integer ADLevel;

    /**
     * 全称
     */
    @TableField("ADFullName")
    private String ADFullName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.ADCode;
    }

}
