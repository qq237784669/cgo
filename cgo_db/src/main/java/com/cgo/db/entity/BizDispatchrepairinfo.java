package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_DispatchRepairInfo")
public class BizDispatchrepairinfo extends Model<BizDispatchrepairinfo> {

    private static final long serialVersionUID=1L;

    @TableField("RepairEndTime")
    private LocalDateTime RepairEndTime;

    @TableField("Status")
    private Integer Status;

    @TableField("TransmitTime")
    private LocalDateTime TransmitTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("RepairUserid")
    private String RepairUserid;

    @TableField("FaultDescription")
    private String FaultDescription;

    @TableField("RepairMethod")
    private String RepairMethod;

    @TableField("DispatchTime")
    private LocalDateTime DispatchTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("TransmitUserid")
    private String TransmitUserid;

    @TableField("DispatchUserId")
    private String DispatchUserId;

    @TableField("OffLineTime")
    private LocalDateTime OffLineTime;

    @TableField("RepairBeginTime")
    private LocalDateTime RepairBeginTime;

    @TableField("RepairLevel")
    private Integer RepairLevel;

    @TableField("SimNum")
    private String SimNum;

    @TableField("RepairResult")
    private String RepairResult;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
