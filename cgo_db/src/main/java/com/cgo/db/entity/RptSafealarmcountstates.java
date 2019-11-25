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
 *                                        这个 实体类 对应的 xml 还没有改 tableFiled 注解还没加       [  标记为：QWERT   ]
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rpt_SafeAlarmCountStates")
public class RptSafealarmcountstates extends Model<RptSafealarmcountstates> {

    private static final long serialVersionUID=1L;

    /**
     * 1：一级 2：二级
     */
    @TableField("Level")
    private Integer Level;

    @TableField("TotalMileage")
    private Double TotalMileage;

    private Integer rpt_SACS_164;

    private Integer rpt_SACS_234359738368;

    private Integer rpt_SACS_2137438953472;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer rpt_SACS_24294967296;

    private Integer rpt_SACS_2281474976710656;

    private Integer rpt_SACS_2562949953421312;

    private Integer rpt_SACS_28589934592;

    private Integer rpt_SACS_116;

    private Integer rpt_SACS_12;

    private Integer rpt_SACS_268719476736;

    private Integer rpt_SACS_132768;

    @TableField("SimNum")
    private String SimNum;

    private Integer rpt_SACS_22305843009213693952;

    private Integer rpt_SACS_22147483648;

    private Integer rpt_SACS_14;

    private Integer rpt_SACS_165536;

    private Integer rpt_SACS_132;

    private Integer rpt_SACS_11;

    private Integer rpt_SACS_21152921504606846976;

    private Integer rpt_SACS_2140737488355328;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    private Integer rpt_SACS_24611686018427387904;

    private Integer rpt_SACS_217179869184;

    private Integer rpt_SACS_18;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
