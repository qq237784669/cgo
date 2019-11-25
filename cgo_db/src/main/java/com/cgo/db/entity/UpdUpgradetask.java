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
@TableName("upd_UpgradeTask")
public class UpdUpgradetask extends Model<UpdUpgradetask> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableId(value = "TaskId", type = IdType.AUTO)
    private Integer TaskId;

    @TableField("SimNumList")
    private String SimNumList;

    @TableField("TaskType")
    private Integer TaskType;

    @TableField("PlanTime")
    private LocalDateTime PlanTime;

    @TableField("TaskName")
    private String TaskName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("VersionId")
    private Integer VersionId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("TaskState")
    private Integer TaskState;


    @Override
    protected Serializable pkVal() {
        return this.TaskId;
    }

}
