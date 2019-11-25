package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("adas_OrgScoreStd")
public class AdasOrgscorestd extends Model<AdasOrgscorestd> {

    private static final long serialVersionUID=1L;

    private Double adas_OS_28589934592;

    private Double adas_OS_268719476736;

    @TableId("OrgId")
    private Integer OrgId;

    @TableField("1_4_D")
    private Double adas_OS_14D;

    @TableField("2_17179869184_D")
    private Double adas_OS_217179869184D;

    private Double adas_OS_12;

    private Double adas_OS_116;

    @TableField("1_1_D")
    private Double adas_OS_11D;

    private Double adas_OS_132;

    @TableField("1_8_D")
    private Double adas_OS_18D;

    @TableField("2_2147483648_D")
    private Double adas_OS_22147483648D;

    private Double adas_OS_14;

    private Double adas_OS_217179869184;

    private Double adas_OS_22147483648;

    @TableField("1_16_D")
    private Double adas_OS_116D;

    @TableField("2_34359738368_D")
    private Double adas_OS_234359738368D;

    @TableField("2_4294967296_D")
    private Double adas_OS_24294967296D;

    private Double adas_OS_18;

    private Double adas_OS_234359738368;

    private Double adas_OS_24294967296;

    @TableField("1_2_D")
    private Double adas_OS_12D;

    @TableField("2_68719476736_D")
    private Double adas_OS_268719476736D;

    @TableField("2_8589934592_D")
    private Double adas_OS_28589934592D;

    private Double adas_OS_11;

    @TableField("1_32_D")
    private Double adas_OS_132D;


    @Override
    protected Serializable pkVal() {
        return this.OrgId;
    }

}
