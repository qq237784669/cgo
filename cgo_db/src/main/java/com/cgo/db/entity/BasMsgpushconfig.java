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
@TableName("bas_MsgPushConfig")
public class BasMsgpushconfig extends Model<BasMsgpushconfig> {

    private static final long serialVersionUID=1L;

    @TableField("IsSendToClient")
    private Boolean IsSendToClient;

    @TableField("SmsTemplateNumber")
    private String SmsTemplateNumber;

    @TableField("EmailMsgTemplate")
    private String EmailMsgTemplate;

    @TableField("VoiceMsgTemplate")
    private String VoiceMsgTemplate;

    @TableField("AlarmName")
    private String AlarmName;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IsSendEmail")
    private Boolean IsSendEmail;

    @TableField("SendDispatchMsgTimeSpan")
    private Integer SendDispatchMsgTimeSpan;

    @TableField("IsSendVoiceMsg")
    private Boolean IsSendVoiceMsg;

    @TableField("SendEmailByDuration")
    private Integer SendEmailByDuration;

    @TableField("SendSmsMsgTimeSpan")
    private Integer SendSmsMsgTimeSpan;

    @TableField("SendVoiceByDuration")
    private Integer SendVoiceByDuration;

    @TableField("AlarmType")
    private Integer AlarmType;

    @TableField("SmsMsgTemplate")
    private String SmsMsgTemplate;

    @TableField("SendEmailMsgTimeSpan")
    private Integer SendEmailMsgTimeSpan;

    @TableField("DispatchMsgTemplate")
    private String DispatchMsgTemplate;

    @TableField("SendVoiceMsgTimeSpan")
    private Integer SendVoiceMsgTimeSpan;

    @TableField("IsSendSmsMsg")
    private Boolean IsSendSmsMsg;

    @TableId("AlarmTag")
    private String AlarmTag;

    @TableField("SendSmsByDuration")
    private Integer SendSmsByDuration;

    @TableField("VoiceTemplateNumber")
    private String VoiceTemplateNumber;

    @TableField("IsSendDispatchMsg")
    private Boolean IsSendDispatchMsg;


    @Override
    protected Serializable pkVal() {
        return this.AlarmTag;
    }

}
