package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("bas_AlarmWeChatPushConfig")
public class BasAlarmwechatpushconfig extends Model<BasAlarmwechatpushconfig> {

    private static final long serialVersionUID=1L;

    /**
     * 组织id
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 超速率阀值
     */
    @TableField("OverSpeedRateThreshold")
    private Double OverSpeedRateThreshold;

    /**
     * 疲劳驾驶持续时长阀值（单位：分钟）
     */
    @TableField("TireDrivingThreshold")
    private Integer TireDrivingThreshold;

    /**
     * 推送报警（多选）用逗号分隔开每一个报警
     */
    @TableField("PushAlarm")
    private String PushAlarm;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
