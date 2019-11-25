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
 * 报警路线参数_缓存表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_AlarmPathParam_Buff")
public class BizAlarmpathparamBuff extends Model<BizAlarmpathparamBuff> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 命令流水号
     */
    @TableField("OrderId")
    private Integer OrderId;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 路线Id
     */
    @TableField("PathId")
    private Integer PathId;

    /**
     * 实际下发区域Id
     */
    @TableField("CmdPathId")
    private Integer CmdPathId;

    /**
     * 路线属性
     */
    @TableField("PathProperty")
    private Integer PathProperty;

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


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
