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
@TableName("bas_VehicleConfig")
public class BasVehicleconfig extends Model<BasVehicleconfig> {

    private static final long serialVersionUID=1L;

    @TableField("AlarmConnectorFir")
    private String AlarmConnectorFir;

    @TableField("VehicleOperateState")
    private Integer VehicleOperateState;

    @TableField("ADName")
    private String ADName;

    @TableId("VehicleId")
    private Integer VehicleId;

    @TableField("SpeedThreshold")
    private Double SpeedThreshold;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ISOpenAD")
    private String ISOpenAD;

    @TableField("TermLimitSpeed")
    private Double TermLimitSpeed;

    @TableField("AlarmConnectorFou")
    private String AlarmConnectorFou;

    @TableField("AlarmSwitch")
    private Long AlarmSwitch;

    @TableField("IsOpenSendSms")
    private Integer IsOpenSendSms;

    @TableField("AccState")
    private Integer AccState;

    @TableField("AlarmConnectorSec")
    private String AlarmConnectorSec;

    @TableField("VehicleOfflineTimeOut")
    private Integer VehicleOfflineTimeOut;

    @TableField("AlarmConnectorThr")
    private String AlarmConnectorThr;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("LimitSpeed")
    private Double LimitSpeed;

    @TableField("ADCode")
    private String ADCode;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
