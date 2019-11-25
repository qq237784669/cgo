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
@TableName("biz_CurrDevData")
public class BizCurrdevdata extends Model<BizCurrdevdata> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Value")
    private String Value;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("DeviceId")
    private Integer DeviceId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed")
    private Double Speed;

    @TableField("LastUpdateTime")
    private LocalDateTime LastUpdateTime;

    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("DeviceType")
    private Integer DeviceType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
