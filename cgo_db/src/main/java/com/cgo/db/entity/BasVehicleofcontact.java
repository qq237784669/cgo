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
@TableName("bas_VehicleOfContact")
public class BasVehicleofcontact extends Model<BasVehicleofcontact> {

    private static final long serialVersionUID=1L;

    /**
     * 联系人Id（关联表bas_CompanyContactInfo）
     */
    @TableField("ContactId")
    private Integer ContactId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("VehicleId")
    private Integer VehicleId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
