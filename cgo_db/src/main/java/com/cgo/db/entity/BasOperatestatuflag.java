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
@TableName("bas_OperateStatuFlag")
public class BasOperatestatuflag extends Model<BasOperatestatuflag> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableId("OperateStatuFlag")
    private Integer OperateStatuFlag;

    @TableField("OperateStatuName")
    private String OperateStatuName;


    @Override
    protected Serializable pkVal() {
        return this.OperateStatuFlag;
    }

}
