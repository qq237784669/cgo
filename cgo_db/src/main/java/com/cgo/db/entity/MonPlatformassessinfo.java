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
@TableName("mon_PlatformAssessInfo")
public class MonPlatformassessinfo extends Model<MonPlatformassessinfo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("RateOfVehicle")
    private String RateOfVehicle;

    @TableField("InterruptConnTimes")
    private String InterruptConnTimes;

    @TableField("RateOfRepairVehicle")
    private String RateOfRepairVehicle;

    @TableField("CallAnswerRate")
    private String CallAnswerRate;

    @TableField("Time")
    private LocalDateTime Time;

    @TableField("AccidentInfo")
    private String AccidentInfo;

    @TableField("RepairTime")
    private String RepairTime;

    @TableField("InterruptTime")
    private String InterruptTime;

    @TableField("Software")
    private String Software;

    @TableField("ComSatisfaction")
    private String ComSatisfaction;

    @TableField("ConnTime")
    private String ConnTime;

    @TableField("Complaint")
    private String Complaint;

    @TableField("RepairVehicle")
    private String RepairVehicle;

    @TableField("NumOfVehicle")
    private String NumOfVehicle;

    @TableField("DataQuality")
    private String DataQuality;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
