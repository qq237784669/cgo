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
@TableName("biz_GdTaxiYearMileage")
public class BizGdtaxiyearmileage extends Model<BizGdtaxiyearmileage> {

    private static final long serialVersionUID=1L;

    @TableField("Year")
    private Integer Year;

    @TableField("Remark")
    private String Remark;

    @TableField("OwnerCode")
    private String OwnerCode;

    @TableField("Result")
    private Integer Result;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("RunScope")
    private String RunScope;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("State")
    private Integer State;

    @TableField("Span")
    private Integer Span;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
