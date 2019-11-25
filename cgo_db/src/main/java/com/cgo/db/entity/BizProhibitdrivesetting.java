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
@TableName("biz_ProhibitDriveSetting")
public class BizProhibitdrivesetting extends Model<BizProhibitdrivesetting> {

    private static final long serialVersionUID=1L;

    @TableField("SimNums")
    private String SimNums;

    @TableField("FixedTimeFlag")
    private Integer FixedTimeFlag;

    @TableField("SendMsgFlag")
    private Integer SendMsgFlag;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableField("TaskName")
    private String TaskName;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("OperateTypeCodes")
    private String OperateTypeCodes;

    @TableField("MsgContent")
    private String MsgContent;

    @TableField("EnableFlag")
    private Boolean EnableFlag;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("strategyFlag")
    private Integer strategyFlag;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
