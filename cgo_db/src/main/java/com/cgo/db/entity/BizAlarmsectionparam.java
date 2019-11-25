package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_AlarmSectionParam")
public class BizAlarmsectionparam extends Model<BizAlarmsectionparam> {

    private static final long serialVersionUID=1L;

    @TableField("MaxDuration")
    private Integer MaxDuration;

    @TableField("NightHighSpeed")
    private Integer NightHighSpeed;

    @TableId("PathSectionId")
    private Integer PathSectionId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SpeedingDuration")
    private Integer SpeedingDuration;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("SectionWidth")
    private Integer SectionWidth;

    @TableField("MinDuration")
    private Integer MinDuration;


    @Override
    protected Serializable pkVal() {
        return this.PathSectionId;
    }

}
