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
@TableName("biz_MobUserConfig")
public class BizMobuserconfig extends Model<BizMobuserconfig> {

    private static final long serialVersionUID=1L;

    @TableField("ReadSafetyAlarmTime")
    private LocalDateTime ReadSafetyAlarmTime;

    @TableField("MobileOS")
    private Integer MobileOS;

    @TableField("pushIsWork")
    private Integer pushIsWork;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableId("UserId")
    private String UserId;

    @TableField("UserType")
    private String UserType;

    @TableField("AdasAlarmTypeWithTwo")
    private Long AdasAlarmTypeWithTwo;

    @TableField("IMEI")
    private String imei;

    @TableField("BDChannelId")
    private String BDChannelId;

    @TableField("IsPushAlarm")
    private Integer IsPushAlarm;

    @TableField("ReadAlarmTime")
    private LocalDateTime ReadAlarmTime;

    @TableField("AdasAlarmTypeWithOne")
    private Long AdasAlarmTypeWithOne;

    @TableField("AlarmType")
    private Long AlarmType;

    @TableField("BDTokenId")
    private String BDTokenId;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
