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
 * 状态标志位表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_StateFlag")
public class BasStateflag extends Model<BasStateflag> {

    private static final long serialVersionUID=1L;

    /**
     * 状态标志
     */
    @TableId("StateFlag")
    private Long StateFlag;

    /**
     * 状态名称
     */
    @TableField("StateName")
    private String StateName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("CloseText")
    private String CloseText;

    @TableField("OpenText")
    private String OpenText;


    @Override
    protected Serializable pkVal() {
        return this.StateFlag;
    }

}
