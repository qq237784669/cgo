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
@TableName("rep_VehicleMarkInfo")
public class RepVehiclemarkinfo extends Model<RepVehiclemarkinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 品牌编号
     */
    @TableId(value = "VehicleMarkId", type = IdType.AUTO)
    private Integer VehicleMarkId;

    /**
     * 品牌名称
     */
    @TableField("VehicleMarkName")
    private String VehicleMarkName;

    @TableField("OrderCode")
    private Integer OrderCode;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.VehicleMarkId;
    }

}
