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
@TableName("bas_IllegalProMethod")
public class BasIllegalpromethod extends Model<BasIllegalpromethod> {

    private static final long serialVersionUID=1L;

    @TableField("Id")
    private Integer Id;

    @TableField("Value")
    private String Value;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
