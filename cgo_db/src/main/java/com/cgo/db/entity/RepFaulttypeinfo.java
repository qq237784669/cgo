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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rep_FaultTypeInfo")
public class RepFaulttypeinfo extends Model<RepFaulttypeinfo> {

    private static final long serialVersionUID=1L;

    @TableId("FaultTypeCode")
    private Integer FaultTypeCode;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("FaultTypeName")
    private String FaultTypeName;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.FaultTypeCode;
    }

}
