package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_TodayStartPos")
public class BizTodaystartpos extends Model<BizTodaystartpos> {

    private static final long serialVersionUID=1L;

    /**
     * 通讯simnum卡号
     */
    @TableId("SimNum")
    private String SimNum;

    /**
     * Gps时间
     */
    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    /**
     * 接收时间
     */
    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    /**
     * 里程
     */
    @TableField("Mileage")
    private Double Mileage;

    /**
     * 经度
     */
    @TableField("Longitude")
    private Double Longitude;

    /**
     * 纬度
     */
    @TableField("Latitude")
    private Double Latitude;

    /**
     * 车辆状态
     */
    @TableField("StateFlag")
    private Long StateFlag;

    /**
     * 报警状态
     */
    @TableField("AlarmFlag")
    private Long AlarmFlag;

    /**
     * 速度
     */
    @TableField("Speed")
    private Double Speed;

    /**
     * 脉冲速度
     */
    @TableField("ADRSpeed")
    private Double ADRSpeed;

    /**
     * 更新时间
     */
    @TableField("Updatetime")
    private LocalDateTime Updatetime;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
