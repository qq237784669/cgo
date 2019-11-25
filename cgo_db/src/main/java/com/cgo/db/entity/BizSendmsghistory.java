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
@TableName("biz_SendMsgHistory")
public class BizSendmsghistory extends Model<BizSendmsghistory> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("MsgId")
    private Integer MsgId;

    @TableField("SendTime")
    private String SendTime;

    @TableField("TerminalLogId")
    private Long TerminalLogId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("TaskId")
    private String TaskId;

    @TableField("MsgContent")
    private String MsgContent;

    @TableField("UserId")
    private String UserId;

    private Integer result;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
