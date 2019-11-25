package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_AlarmPlatExamineInfo")
public class BizAlarmplatexamineinfo extends Model<BizAlarmplatexamineinfo> {

    private static final long serialVersionUID=1L;

    @TableId("UserId")
    private String UserId;

    @TableField("NotAlarmReason")
    private String NotAlarmReason;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AlarmId")
    private String AlarmId;

    @TableField("HandlerFlag")
    private Boolean HandlerFlag;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
