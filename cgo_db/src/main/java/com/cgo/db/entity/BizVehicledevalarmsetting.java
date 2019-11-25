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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleDevAlarmSetting")
public class BizVehicledevalarmsetting extends Model<BizVehicledevalarmsetting> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆Id
     */
    @TableId("VehicleId")
    private Integer VehicleId;

    /**
     * 是否开启温度异常报警（0：不开启，1：开启）
     */
    @TableField("EnableTempratureAlarm")
    private Boolean EnableTempratureAlarm;

    /**
     * 高温报警阈值(°C), -255至255
     */
    @TableField("MaxTemperature")
    private Integer MaxTemperature;

    /**
     * 低温报警阈值(°C), -255至255
     */
    @TableField("MinTemperature")
    private Integer MinTemperature;

    /**
     * 是否开启油量异常报警（0：不开启，1：开启）
     */
    @TableField("EnableFuelAlarm")
    private Boolean EnableFuelAlarm;

    /**
     * 漏油报警阈值(L/分钟), 默认:1(油量下降速度), 范围:0.1-10.0L
     */
    @TableField("MaxFuelReduceSpeed")
    private Double MaxFuelReduceSpeed;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
