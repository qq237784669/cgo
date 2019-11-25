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
@TableName("adas_StateFlag")
public class AdasStateflag extends Model<AdasStateflag> {

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
     * 状态为0时显示名称
     */
    @TableField("CloseText")
    private String CloseText;

    /**
     * 状态为1时显示名称
     */
    @TableField("OpenText")
    private String OpenText;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.StateFlag;
    }

}
