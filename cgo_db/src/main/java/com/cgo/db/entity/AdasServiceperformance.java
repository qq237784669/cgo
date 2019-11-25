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
@TableName("adas_ServicePerformance")
public class AdasServiceperformance extends Model<AdasServiceperformance> {

    private static final long serialVersionUID=1L;

    @TableField("DetailInfo")
    private String DetailInfo;

    @TableId(value = "ServiceId", type = IdType.AUTO)
    private Integer ServiceId;

    @TableField("CPU")
    private Double cpu;

    @TableField("ServiceStates")
    private Integer ServiceStates;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IP")
    private String ip;

    @TableField("UseMemory")
    private Double UseMemory;

    @TableField("CPUThreshold")
    private Double CPUThreshold;

    @TableField("AvailableCapacity")
    private Double AvailableCapacity;

    @TableField("TotalMemory")
    private Double TotalMemory;

    @TableField("DiskThreshold")
    private Double DiskThreshold;

    @TableField("TotalCapacity")
    private Double TotalCapacity;

    @TableField("Description")
    private String Description;

    @TableField("DriverLetter")
    private String DriverLetter;

    @TableField("MemoryThreshold")
    private Double MemoryThreshold;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("ServiceName")
    private String ServiceName;


    @Override
    protected Serializable pkVal() {
        return this.ServiceId;
    }

}
