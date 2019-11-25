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
@TableName("bas_TermnalServiceType")
public class BasTermnalservicetype extends Model<BasTermnalservicetype> {

    private static final long serialVersionUID=1L;

    @TableField("ServiceTypeName")
    private String ServiceTypeName;

    @TableId(value = "ServiceTypeId", type = IdType.AUTO)
    private Integer ServiceTypeId;


    @Override
    protected Serializable pkVal() {
        return this.ServiceTypeId;
    }

}
