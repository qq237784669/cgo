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
@TableName("biz_PhotographTaskInfo")
public class BizPhotographtaskinfo extends Model<BizPhotographtaskinfo> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("CreateUserId")
    private String CreateUserId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Proportion")
    private Integer Proportion;

    @TableField("IntervalTime")
    private Integer IntervalTime;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("TaskName")
    private String TaskName;

    @TableField("IsCancel")
    private Integer IsCancel;

    @TableField("CameraChannel")
    private Integer CameraChannel;

    @TableField("TimeRange")
    private String TimeRange;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
