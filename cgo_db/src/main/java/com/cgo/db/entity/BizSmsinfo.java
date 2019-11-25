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
@TableName("biz_SMSInfo")
public class BizSmsinfo extends Model<BizSmsinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 0：普通通知
     */
    @TableField("SmsType")
    private Integer SmsType;

    /**
     * 目标SIMNUM，多个用逗号格开
     */
    @TableField("ToTelephone")
    private String ToTelephone;

    /**
     * 短信内容
     */
    @TableField("SmsMsg")
    private String SmsMsg;

    /**
     * 发送结果：0：待发送  1：成功  2：失败  
     */
    @TableField("Result")
    private Integer Result;

    /**
     * 发送类型 0：立即发送 1：定时发送
     */
    @TableField("SendType")
    private Integer SendType;

    /**
     *  发送时间
     */
    @TableField("SendTime")
    private LocalDateTime SendTime;

    /**
     * 最后发送时间
     */
    @TableField("LastSendTime")
    private LocalDateTime LastSendTime;

    /**
     * 失败重发次数
     */
    @TableField("ReSendTimes")
    private Integer ReSendTimes;

    /**
     * 通讯SIMNum卡号，以逗号隔开
     */
    @TableField("SimNum")
    private String SimNum;

    @TableField("TemplateId")
    private String TemplateId;

    @TableField("NetType")
    private Integer NetType;

    @TableField("AlarmID")
    private Long AlarmID;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("FromInfo")
    private String FromInfo;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Content")
    private String Content;

    @TableField("ClientInfo")
    private String ClientInfo;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
