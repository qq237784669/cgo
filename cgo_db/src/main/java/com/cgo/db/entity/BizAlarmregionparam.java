package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 报警区域参数表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_AlarmRegionParam")
public class BizAlarmregionparam extends Model<BizAlarmregionparam> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 命令类型
     */
    @TableField("CmdType")
    private Integer CmdType;

    /**
     * 区域Id
     */
    @TableField("RegionId")
    private Integer RegionId;

    /**
     * 区域标识
     */
    @TableField("RegionType")
    private Integer RegionType;

    /**
     * 区域属性
     */
    @TableField("RegionProperty")
    private Integer RegionProperty;

    /**
     * 实际下发区域Id
     */
    @TableField("CmdRegionId")
    private Integer CmdRegionId;

    /**
     * 开始时间 格式: YY-MM-DD-hh-mm-ss 每天循环时间段时年月日值为00 例如：00-00-00-08-30-00
     */
    @TableField("BeginTime")
    private String BeginTime;

    /**
     * 结束时间 格式: YY-MM-DD-hh-mm-ss 每天循环时间段时年月日值为00 例如：00-00-00-18-30-00
     */
    @TableField("EndTime")
    private String EndTime;

    /**
     * 限制速度
     */
    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    /**
     * 超速持续时间
     */
    @TableField("SpeedingDuration")
    private Integer SpeedingDuration;

    @TableField("RegionName")
    private String RegionName;

    @TableField("NightHighSpeed")
    private Integer NightHighSpeed;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
