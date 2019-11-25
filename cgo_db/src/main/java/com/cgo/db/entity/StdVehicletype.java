package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 车辆类型表 按照JT/T 145-2006中5.4.9的规定
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("std_VehicleType")
public class StdVehicletype extends Model<StdVehicletype> {

    private static final long serialVersionUID=1L;

    /**
     * 代码
     */
    @TableId("VehicleTypeCode")
    private Integer VehicleTypeCode;

    /**
     * 类型
     */
    @TableField("VehicleTypeName")
    private String VehicleTypeName;

    /**
     * 父级代码
     */
    @TableField("ParentCode")
    private Integer ParentCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 车辆图标
     */
    @TableField("IconType")
    private String IconType;

    @TableField("DefaultLimitSpeed")
    private Integer DefaultLimitSpeed;

    @TableField("TypeOrder")
    private Integer TypeOrder;

    @TableField("NightLimitSpeed")
    private Integer NightLimitSpeed;

    @TableField("IsNotJTB")
    private Integer IsNotJTB;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.VehicleTypeCode;
    }

}
