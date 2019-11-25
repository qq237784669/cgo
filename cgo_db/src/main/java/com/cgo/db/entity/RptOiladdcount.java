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
@TableName("rpt_OilAddCount")
public class RptOiladdcount extends Model<RptOiladdcount> {

    private static final long serialVersionUID=1L;

    @TableField("Lat1")
    private Double Lat1;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("OilValue1")
    private Double OilValue1;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("GpsTime1")
    private LocalDateTime GpsTime1;

    @TableField("OilValue2")
    private Double OilValue2;

    @TableField("GpsTime2")
    private LocalDateTime GpsTime2;

    @TableField("Mileage1")
    private Double Mileage1;

    @TableField("DeviceId")
    private Integer DeviceId;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("Mileage2")
    private Double Mileage2;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Lon1")
    private Double Lon1;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
