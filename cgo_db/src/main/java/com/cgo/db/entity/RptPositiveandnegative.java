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
@TableName("rpt_PositiveAndNegative")
public class RptPositiveandnegative extends Model<RptPositiveandnegative> {

    private static final long serialVersionUID=1L;

    /**
     * 类别（0：正转，1：反转，2：停转）
     */
    private Integer type;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Lon2")
    private Double Lon2;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Lon1")
    private Double Lon1;

    @TableField("SimNum")
    private String SimNum;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Lat2")
    private Double Lat2;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("Lat1")
    private Double Lat1;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
