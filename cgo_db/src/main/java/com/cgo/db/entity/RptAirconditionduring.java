package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("rpt_AirConditionDuring")
public class RptAirconditionduring extends Model<RptAirconditionduring> {

    private static final long serialVersionUID=1L;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("TotalFuel2")
    private Double TotalFuel2;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("GpsTime2")
    private LocalDateTime GpsTime2;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed2")
    private Double Speed2;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("GpsTime1")
    private LocalDateTime GpsTime1;

    @TableField("TotalFuel1")
    private Double TotalFuel1;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
