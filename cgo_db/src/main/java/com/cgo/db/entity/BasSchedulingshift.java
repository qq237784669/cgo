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
@TableName("bas_SchedulingShift")
public class BasSchedulingshift extends Model<BasSchedulingshift> {

    private static final long serialVersionUID=1L;

    /**
     * 排班班次Id
     */
    @TableId(value = "ShiftId", type = IdType.AUTO)
    private Integer ShiftId;

    @TableField("BeginTime")
    private String BeginTime;

    @TableField("ShiftName")
    private String ShiftName;

    @TableField("EndTime")
    private String EndTime;


    @Override
    protected Serializable pkVal() {
        return this.ShiftId;
    }

}
