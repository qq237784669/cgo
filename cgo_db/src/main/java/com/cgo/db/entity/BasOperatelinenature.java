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
@TableName("bas_OperateLineNature")
public class BasOperatelinenature extends Model<BasOperatelinenature> {

    private static final long serialVersionUID=1L;

    @TableField("LineNatureName")
    private String LineNatureName;

    @TableId(value = "LineNature", type = IdType.AUTO)
    private Integer LineNature;


    @Override
    protected Serializable pkVal() {
        return this.LineNature;
    }

}
