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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rpt_TiredAlarmDetail")
public class RptTiredalarmdetail extends Model<RptTiredalarmdetail> {

    private static final long serialVersionUID=1L;

    /**
     * 0:无报警，1:疲劳驾驶，2:累计超时驾驶
     */
    @TableField("AlarmFlag")
    private Integer AlarmFlag;

    /**
     * 报警时长
     */
    @TableField("AlarmTime")
    private Integer AlarmTime;

    /**
     * 行驶分析结束标识（标识本次行驶分析是否结束，结束规则为两条间隔20分钟，0:未结束，1:已结束）
     */
    @TableField("EndFlag")
    private Integer EndFlag;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Latitude1")
    private Double Latitude1;

    @TableField("Latitude2")
    private Double Latitude2;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Id")
    private Integer Id;

    @TableField("Longitude2")
    private Double Longitude2;

    @TableField("Longitude1")
    private Double Longitude1;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Mileage2")
    private Double Mileage2;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
