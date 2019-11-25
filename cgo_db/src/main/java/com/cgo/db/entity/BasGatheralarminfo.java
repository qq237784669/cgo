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
@TableName("bas_GatherAlarmInfo")
public class BasGatheralarminfo extends Model<BasGatheralarminfo> {

    private static final long serialVersionUID=1L;

    @TableId("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Id")
    private Long Id;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("AllowCount")
    private Integer AllowCount;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("CurrentCount")
    private Integer CurrentCount;

    @TableField("RegionID")
    private Integer RegionID;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.CreateTime;
    }

}
