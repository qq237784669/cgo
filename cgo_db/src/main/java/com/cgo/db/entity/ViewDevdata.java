package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("View_DevData")
public class ViewDevdata extends Model<ViewDevdata> {

    private static final long serialVersionUID=1L;

    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("DeviceType")
    private Integer DeviceType;

    @TableField("DeviceId")
    private Integer DeviceId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed")
    private Double Speed;

    @TableField("Id")
    private String Id;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("Value")
    private String Value;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
