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
 *                                           这个 实体类 对应的 xml 还没有改 tableFiled 注解还没加       [  标记为：QWERT   ]
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rpt_IOStateCount")
public class RptIostatecount extends Model<RptIostatecount> {

    private static final long serialVersionUID=1L;

    /**
     * ACC开的次数
     */
    private Integer rpt_IOSC_1;

    /**
     * 定位次数
     */
    private Integer rpt_IOSC_2;

    /**
     * 近光灯开次数
     */
    private Integer rpt_IOSC_4294967296;

    /**
     * 远光灯开次数
     */
    private Integer rpt_IOSC_8589934592;

    /**
     * 右转向灯开次数
     */
    private Integer rpt_IOSC_17179869184;

    /**
     * 左转向灯开次数
     */
    private Integer rpt_IOSC_34359738368;

    /**
     * 制动灯开次数
     */
    private Integer rpt_IOSC_68719476736;

    /**
     * 定位轨迹数
     */
    @TableField("2T")
    private Integer rpt_IOSC_2t;

    /**
     * 未定位轨迹数
     */
    @TableField("N2T")
    private Integer n2t;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    private Integer rpt_IOSC_137438953472;

    private Integer rpt_IOSC_35184372088832;

    @TableField("SimNum")
    private String SimNum;

    @TableField("UselessTrack")
    private Integer UselessTrack;

    private Integer rpt_IOSC_4398046511104;

    private Integer rpt_IOSC_549755813888;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    private Integer rpt_IOSC_274877906944;

    private Integer rpt_IOSC_17592186044416;

    @TableField("Id")
    private Integer Id;

    @TableField("UsefulTrack")
    private Integer UsefulTrack;

    private Integer rpt_IOSC_2199023255552;

    private Integer rpt_IOSC_70368744177664;

    private Integer rpt_IOSC_1099511627776;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    private Integer rpt_IOSC_8796093022208;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
