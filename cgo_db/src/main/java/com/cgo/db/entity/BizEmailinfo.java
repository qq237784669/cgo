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
@TableName("biz_EmailInfo")
public class BizEmailinfo extends Model<BizEmailinfo> {

    private static final long serialVersionUID=1L;

    @TableField("MailTo")
    private String MailTo;

    @TableField("MailBody")
    private String MailBody;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("PostState")
    private Integer PostState;

    @TableField("InsTime")
    private LocalDateTime InsTime;

    @TableField("MailCode")
    private String MailCode;

    @TableField("MailToName")
    private String MailToName;

    @TableField("PostTime")
    private LocalDateTime PostTime;

    @TableField("IsPerReportSent")
    private String IsPerReportSent;

    @TableField("AttachPath")
    private String AttachPath;

    @TableField("PlanTime")
    private LocalDateTime PlanTime;

    @TableField("PostTimes")
    private Integer PostTimes;

    @TableField("MailType")
    private Integer MailType;

    @TableField("MailSubject")
    private String MailSubject;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
