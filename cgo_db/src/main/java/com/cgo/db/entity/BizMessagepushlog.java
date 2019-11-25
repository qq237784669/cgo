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
@TableName("biz_MessagePushLog")
public class BizMessagepushlog extends Model<BizMessagepushlog> {

    private static final long serialVersionUID=1L;

    @TableField("IsPerReportSent")
    private String IsPerReportSent;

    @TableField("AttachPath")
    private String AttachPath;

    @TableField("Remark")
    private String Remark;

    @TableField("MailToName")
    private String MailToName;

    @TableField("MailCode")
    private String MailCode;

    @TableField("SendMode")
    private Integer SendMode;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("PostTime")
    private LocalDateTime PostTime;

    @TableField("MailTo")
    private String MailTo;

    @TableField("MailBody")
    private String MailBody;

    @TableField("MailType")
    private Integer MailType;

    @TableField("InsTime")
    private LocalDateTime InsTime;

    @TableField("MailSubject")
    private String MailSubject;

    @TableField("PostState")
    private Integer PostState;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
