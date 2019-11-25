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
@TableName("sys_Sequence")
public class SysSequence extends Model<SysSequence> {

    private static final long serialVersionUID=1L;

    @TableField("CURRENT_VALUE")
    private Long currentValue;

    @TableField("VALUE_STEP")
    private Integer valueStep;

    @TableField("SEQNAME")
    private String seqname;

    @TableField("STARTWITH")
    private Integer startwith;

    @TableField("MAXVALUE")
    private Integer maxvalue;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
