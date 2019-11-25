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
@TableName("biz_MeterInfo")
public class BizMeterinfo extends Model<BizMeterinfo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("MeterType")
    private Integer MeterType;

    @TableField("BankCardNO")
    private String BankCardNO;

    @TableField("Price")
    private Double Price;

    @TableField("UpTime")
    private LocalDateTime UpTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("MileageN")
    private Double MileageN;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("Fee")
    private Double Fee;

    @TableField("State")
    private String State;

    @TableField("WaitTime")
    private Integer WaitTime;

    @TableField("WorkLicenseId")
    private String WorkLicenseId;

    @TableField("DownTime")
    private LocalDateTime DownTime;

    @TableField("ChargeType")
    private Integer ChargeType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
