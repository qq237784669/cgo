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
@TableName("adas_AlarmProcessMode")
public class AdasAlarmprocessmode extends Model<AdasAlarmprocessmode> {

    private static final long serialVersionUID=1L;

    /**
     * 处理方式
     */
    @TableField("Value")
    private String Value;

    @TableField("Key")
    private Integer Key;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
