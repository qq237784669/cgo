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
@TableName("mon_EnterpriseInfo")
public class MonEnterpriseinfo extends Model<MonEnterpriseinfo> {

    private static final long serialVersionUID=1L;

    @TableField("CompanyName")
    private String CompanyName;

    @TableField("Phone")
    private String Phone;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Organization")
    private String Organization;

    @TableField("OperatingLicenseNo")
    private String OperatingLicenseNo;

    @TableField("CompanyID")
    private Integer CompanyID;

    @TableField("Legal")
    private String Legal;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
