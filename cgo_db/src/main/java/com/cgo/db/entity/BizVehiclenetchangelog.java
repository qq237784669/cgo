package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleNetChangeLog")
public class BizVehiclenetchangelog extends Model<BizVehiclenetchangelog> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("OperatorIdFrom")
    private Integer OperatorIdFrom;

    @TableField("PlateColor")
    private String PlateColor;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("ExecuteUserId")
    private String ExecuteUserId;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("OperatorIdTo")
    private Integer OperatorIdTo;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
