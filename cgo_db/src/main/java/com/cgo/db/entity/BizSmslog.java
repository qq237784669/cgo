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
@TableName("biz_SmsLog")
public class BizSmslog extends Model<BizSmslog> {

    private static final long serialVersionUID=1L;

    @TableField("ToTelephone")
    private String ToTelephone;

    @TableField("FromInfo")
    private String FromInfo;

    @TableField("Remark")
    private String Remark;

    @TableField("SmsMsg")
    private String SmsMsg;

    @TableField("NoticeType")
    private Integer NoticeType;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableField("ClientInfo")
    private String ClientInfo;

    @TableField("SmsType")
    private Integer SmsType;

    @TableField("SendResult")
    private Integer SendResult;

    @TableField("InformType")
    private String InformType;

    @TableField("AlarmId")
    private Long AlarmId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
