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
@TableName("biz_GatherAlarmVehicleInfo")
public class BizGatheralarmvehicleinfo extends Model<BizGatheralarmvehicleinfo> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("GatherAlarmId")
    private Long GatherAlarmId;

    @TableField("Id")
    private Long Id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
