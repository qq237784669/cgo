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
 * 拓展信号标志位表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_ExStateFlag")
public class BasExstateflag extends Model<BasExstateflag> {

    private static final long serialVersionUID=1L;

    /**
     * 信号状态标志位
     */
    @TableId("ExState")
    private Long ExState;

    /**
     * 信号状态名称
     */
    @TableField("ExStateName")
    private String ExStateName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.ExState;
    }

}
