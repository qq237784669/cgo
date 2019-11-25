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
@TableName("bas_OwnerInfoOfOrg")
public class BasOwnerinfooforg extends Model<BasOwnerinfooforg> {

    private static final long serialVersionUID=1L;

    @TableField("OrgName")
    private String OrgName;

    @TableField("PersonId")
    private String PersonId;

    @TableField("Address")
    private String Address;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("OwnerTel")
    private String OwnerTel;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
