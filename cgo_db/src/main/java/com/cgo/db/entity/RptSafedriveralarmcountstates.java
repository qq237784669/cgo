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
 *                                          这个 实体类 对应的 xml 还没有改 tableFiled 注解还没加       [  标记为：QWERT   ]
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rpt_SafeDriverAlarmCountStates")
public class RptSafedriveralarmcountstates extends Model<RptSafedriveralarmcountstates> {

    private static final long serialVersionUID=1L;

    /**
     * 1：一级 2：二级
     */
    @TableField("Level")
    private Integer Level;

    private Integer rpt_SDAC_14;

    private Integer rpt_SDAC_22147483648;

    @TableField("DriverId")
    private String DriverId;

    private Integer rpt_SDAC_132;

    private Integer rpt_SDAC_268719476736;

    private Integer rpt_SDAC_22305843009213693952;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    private Integer rpt_SDAC_165536;

    private Integer rpt_SDAC_2140737488355328;

    private Integer rpt_SDAC_24611686018427387904;

    private Integer rpt_SDAC_217179869184;

    private Integer rpt_SDAC_21152921504606846976;

    private Integer rpt_SDAC_164;

    private Integer rpt_SDAC_234359738368;

    private Integer rpt_SDAC_11;

    private Integer rpt_SDAC_18;

    private Integer rpt_SDAC_24294967296;

    private Integer rpt_SDAC_2281474976710656;

    private Integer rpt_SDAC_2137438953472;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer rpt_SDAC_12;

    private Integer rpt_SDAC_116;

    private Integer rpt_SDAC_28589934592;

    @TableField("TotalMileage")
    private Double TotalMileage;

    private Integer rpt_SDAC_132768;

    private Integer rpt_SDAC_2562949953421312;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
