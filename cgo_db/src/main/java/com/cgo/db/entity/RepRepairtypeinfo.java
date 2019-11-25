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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rep_RepairTypeInfo")
public class RepRepairtypeinfo extends Model<RepRepairtypeinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 类型名称
     */
    @TableField("LogTypeName")
    private String LogTypeName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("OrderId")
    private Integer OrderId;

    @TableId(value = "LogTypeId", type = IdType.AUTO)
    private Integer LogTypeId;


    @Override
    protected Serializable pkVal() {
        return this.LogTypeId;
    }

}
