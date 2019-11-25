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
@TableName("rep_IMEIOfSim")
public class RepImeiofsim extends Model<RepImeiofsim> {

    private static final long serialVersionUID=1L;

    /**
     * 通讯卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * IMEI卡号
     */
    @TableField("IMEINum")
    private String IMEINum;

    /**
     * 运营商
     */
    @TableField("Operator")
    private String Operator;

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

    /**
     * 创建时间
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 卡状态（0：未使用，1：已使用）
     */
    @TableField("CardState")
    private Integer CardState;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
