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
@TableName("biz_SendCmd_Buff")
public class BizSendcmdBuff extends Model<BizSendcmdBuff> {

    private static final long serialVersionUID=1L;

    @TableField("SessionId")
    private String SessionId;

    @TableField("ParamContentEx")
    private String ParamContentEx;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ParamContent")
    private String ParamContent;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("CmdCodeFlag")
    private String CmdCodeFlag;

    @TableField("RspContent")
    private String RspContent;

    @TableField("CmdDescription")
    private String CmdDescription;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("RspDescription")
    private String RspDescription;

    @TableField("CmdCode")
    private Long CmdCode;

    @TableField("UserId")
    private String UserId;

    @TableField("CmdResult")
    private Integer CmdResult;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
