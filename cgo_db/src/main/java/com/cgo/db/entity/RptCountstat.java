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
@TableName("rpt_CountStat")
public class RptCountstat extends Model<RptCountstat> {

    private static final long serialVersionUID=1L;

    @TableField("PicCount")
    private Integer PicCount;

    private Integer rpt_CS_2048;

    private Integer rpt_CS_8;

    private Integer rpt_CS_2147483648;

    private Integer rpt_CS_562949953421312;

    private Integer rpt_CS_67108864;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    private Integer rpt_CS_576460752303423488;

    private Integer rpt_CS_64;

    private Integer rpt_CS_2097152;

    private Integer rpt_CS_70368744177664;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    private Integer rpt_CS_4503599627370496;

    private Integer rpt_CS_4611686018427387904;

    @TableField("DifWorktime")
    private Integer DifWorktime;

    private Integer rpt_CS_1;

    private Integer rpt_CS_18014398509481984;

    private Integer rpt_CS_536870912;

    private Integer rpt_CS_8388608;

    private Integer rpt_CS_140737488355328;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    private Integer rpt_CS_128;

    private Integer rpt_CS_17179869184;

    @TableField("DifOil")
    private Double DifOil;

    private Integer rpt_CS_144115188075855872;

    private Integer rpt_CS_16;

    private Integer rpt_CS_17592186044416;

    private Integer rpt_CS_16384;

    private Integer rpt_CS_524288;

    private Integer rpt_CS_134217728;

    @TableField("SimNum")
    private String SimNum;

    private Integer rpt_CS_1125899906842624;

    @TableField("DifSpeedingtime")
    private Integer DifSpeedingtime;

    private Integer rpt_CS_1152921504606846976;

    private Integer rpt_CS_512;

    private Integer rpt_CS_4194304;

    private Integer rpt_CS_35184372088832;

    private Integer rpt_CS_1048576;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    private Integer rpt_CS_9007199254740992;

    private Integer rpt_CS_2305843009213693952;

    private Integer rpt_CS_2;

    private Integer rpt_CS_4096;

    private Integer rpt_CS_36028797018963968;

    private Integer rpt_CS_1073741824;

    private Integer rpt_CS_33554432;

    @TableField("BeginMileage")
    private Double BeginMileage;

    private Integer rpt_CS_256;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("TransportCount")
    private Integer TransportCount;

    private Integer rpt_CS_288230376151711744;

    private Integer rpt_CS_72057594037927936;

    private Integer rpt_CS_32;

    private Integer rpt_CS_8192;

    private Integer rpt_CS_2251799813685248;

    private Integer rpt_CS_268435456;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("DifTimeout")
    private Integer DifTimeout;

    private Integer rpt_CS_262144;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("TransportWorktime")
    private Integer TransportWorktime;

    private Integer rpt_CS_1024;

    private Integer rpt_CS_16777216;

    private Integer rpt_CS_281474976710656;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    private Integer rpt_CS_4;

    @TableField("LastOil")
    private Double LastOil;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
