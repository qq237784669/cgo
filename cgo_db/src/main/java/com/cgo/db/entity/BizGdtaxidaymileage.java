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
@TableName("biz_GdTaxiDayMileage")
public class BizGdtaxidaymileage extends Model<BizGdtaxidaymileage> {

    private static final long serialVersionUID=1L;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("OwnerCode")
    private String OwnerCode;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("EndTime")
    private String EndTime;

    @TableField("RunScope")
    private String RunScope;

    @TableField("Remark")
    private String Remark;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("Result")
    private Integer Result;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("BeginTime")
    private String BeginTime;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("Date")
    private LocalDateTime Date;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("State")
    private Integer State;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
