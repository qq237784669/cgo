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
 * 运输行业编码表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("std_TransType")
public class StdTranstype extends Model<StdTranstype> {

    private static final long serialVersionUID=1L;

    /**
     * 代码
     */
    @TableId("TransTypeCode")
    private String TransTypeCode;

    /**
     * 行业类别
     */
    @TableField("TransTypeName")
    private String TransTypeName;

    /**
     * 父级代码
     */
    @TableField("ParentCode")
    private String ParentCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.TransTypeCode;
    }

}
