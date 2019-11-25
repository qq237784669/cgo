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
@TableName("bas_DVRType")
public class BasDvrtype extends Model<BasDvrtype> {

    private static final long serialVersionUID=1L;

    @TableField("DVRTypeName")
    private String DVRTypeName;

    @TableId(value = "DVRTypeId", type = IdType.AUTO)
    private Integer DVRTypeId;

    @TableField("DVRTypeCode")
    private String DVRTypeCode;


    @Override
    protected Serializable pkVal() {
        return this.DVRTypeId;
    }

}
