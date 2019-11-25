package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("adas_RealRiskData")
public class AdasRealriskdata extends Model<AdasRealriskdata> {

    private static final long serialVersionUID=1L;

    /**
     * 通讯SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 司机身份证号
     */
    @TableField("DriverId")
    private String DriverId;

    /**
     * 从业资格证号
     */
    @TableField("QualificationNum")
    private String QualificationNum;

    /**
     * 开始时间
     */
    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    /**
     * 结束时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 风险等级（1：低风险，2：中风险，3：高风险）
     */
    @TableField("RiskLevel")
    private Integer RiskLevel;

    /**
     * 风险值
     */
    @TableField("RiskNum")
    private Double RiskNum;

    /**
     * 插入时间
     */
    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    /**
     * 最后更新时间
     */
    @TableField("LastUpdateTime")
    private LocalDateTime LastUpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableId("RiskId")
    private String RiskId;


    @Override
    protected Serializable pkVal() {
        return this.RiskId;
    }

}
