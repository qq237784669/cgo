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
@TableName("biz_FalseAlarmRule")
public class BizFalsealarmrule extends Model<BizFalsealarmrule> {

    private static final long serialVersionUID=1L;

    /**
     * 1:自动核警 2:人工核警
     */
    @TableField("CheckType")
    private Integer CheckType;

    @TableField("OrderId")
    private Integer OrderId;

    @TableId("Id")
    private Integer Id;

    @TableField("Rule")
    private String Rule;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
