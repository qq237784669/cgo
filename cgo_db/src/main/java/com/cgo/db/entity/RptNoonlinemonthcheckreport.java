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
@TableName("rpt_NoOnlineMonthCheckReport")
public class RptNoonlinemonthcheckreport extends Model<RptNoonlinemonthcheckreport> {

    private static final long serialVersionUID=1L;

    @TableField("Speed")
    private Double Speed;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableId("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("AlarmFlag")
    private Long AlarmFlag;


    @Override
    protected Serializable pkVal() {
        return this.GpsDate;
    }

}
