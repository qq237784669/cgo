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
 * 组织类别表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_OrgType")
public class BasOrgtype extends Model<BasOrgtype> {

    private static final long serialVersionUID=1L;

    /**
     * 组织类别
     */
    @TableId("OrgType")
    private Integer OrgType;

    /**
     * 组织类别描述(1 公司 2 车队 3 … 99 其他)
     */
    @TableField("OrgTypeName")
    private String OrgTypeName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.OrgType;
    }

}
