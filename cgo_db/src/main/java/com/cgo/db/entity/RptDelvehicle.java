package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
@TableName("rpt_DelVehicle")
public class RptDelvehicle extends Model<RptDelvehicle> {

    private static final long serialVersionUID=1L;

    @TableField("PlateColor")
    private Integer PlateColor;

    @TableField("DelTime")
    private LocalDateTime DelTime;

    @TableField("DelBy")
    private String DelBy;

    @TableField("PlateNum")
    private String PlateNum;

    @TableId("VehicleId")
    private Integer VehicleId;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
