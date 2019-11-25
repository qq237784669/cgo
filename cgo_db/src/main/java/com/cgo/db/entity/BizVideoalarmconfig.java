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
@TableName("biz_VideoAlarmConfig")
public class BizVideoalarmconfig extends Model<BizVideoalarmconfig> {

    private static final long serialVersionUID=1L;

    @TableField("CaptureChannel")
    private Integer CaptureChannel;

    @TableField("IsEnableIntercom")
    private Boolean IsEnableIntercom;

    @TableField("SMSObject")
    private Integer SMSObject;

    @TableField("IsTemporaryMonitor")
    private Integer IsTemporaryMonitor;

    @TableField("AfterAlarmSeconds")
    private Integer AfterAlarmSeconds;

    @TableField("OrgChargerRemindSeconds")
    private Integer OrgChargerRemindSeconds;

    @TableField("TTSMsgContent")
    private String TTSMsgContent;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("IsShowAlarmPopupForm")
    private Boolean IsShowAlarmPopupForm;

    @TableField("VideoRecordChannel")
    private Integer VideoRecordChannel;

    @TableField("OwnerRemindSeconds")
    private Integer OwnerRemindSeconds;

    @TableField("TimeInterval")
    private Integer TimeInterval;

    @TableField("BeforeAlarmSeconds")
    private Integer BeforeAlarmSeconds;

    @TableField("VideoChannel")
    private Integer VideoChannel;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CorpChargerRemindSeconds")
    private Integer CorpChargerRemindSeconds;

    @TableField("TimetLimit")
    private Integer TimetLimit;

    @TableField("SMSContent")
    private String SMSContent;

    @TableField("IsEnableAlarmSound")
    private Boolean IsEnableAlarmSound;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
