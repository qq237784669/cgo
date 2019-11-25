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
@TableName("adas_ServicePerformanceSoft")
public class AdasServiceperformancesoft extends Model<AdasServiceperformancesoft> {

    private static final long serialVersionUID=1L;

    @TableField("ProcessName")
    private String ProcessName;

    @TableField("Memory")
    private Double Memory;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ServiceId")
    private Integer ServiceId;

    @TableField("AppType")
    private Integer AppType;

    @TableField("RunTime")
    private Integer RunTime;

    @TableField("CPUThreshold")
    private Double CPUThreshold;

    @TableField("Sates")
    private Integer Sates;

    @TableField("MemoryThreshold")
    private Double MemoryThreshold;

    @TableField("CPU")
    private Double cpu;

    @TableField("Description")
    private String Description;

    @TableField("ApplicationName")
    private String ApplicationName;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
