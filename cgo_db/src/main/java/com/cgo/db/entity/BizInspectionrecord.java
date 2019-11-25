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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_InspectionRecord")
public class BizInspectionrecord extends Model<BizInspectionrecord> {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SIM卡
     */
    @TableField("SimNum")
    private String SimNum;

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
     * 报警状态
     */
    @TableField("AlarmFlag")
    private Long AlarmFlag;

    /**
     * 车辆状态
     */
    @TableField("StateFlag")
    private Long StateFlag;

    /**
     * 速度
     */
    @TableField("Speed")
    private Double Speed;

    /**
     * 限速值
     */
    @TableField("LimitSpeed")
    private Double LimitSpeed;

    /**
     * GPS时间
     */
    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    /**
     * 接收时间
     */
    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    /**
     * 抽查内容
     */
    @TableField("CheckContent")
    private String CheckContent;

    /**
     * 创建者
     */
    @TableField("CreatedBy")
    private String CreatedBy;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
