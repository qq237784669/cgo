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
@TableName("biz_MobWxUserConfig")
public class BizMobwxuserconfig extends Model<BizMobwxuserconfig> {

    private static final long serialVersionUID=1L;

    @TableField("MobileOS")
    private Integer MobileOS;

    @TableField("AdasAlarmTypeWithTwo")
    private Long AdasAlarmTypeWithTwo;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("ReadSafetyAlarmTime")
    private LocalDateTime ReadSafetyAlarmTime;

    @TableField("HasLogin")
    private Integer HasLogin;

    @TableField("ReadAlarmTime")
    private LocalDateTime ReadAlarmTime;

    @TableField("UserId")
    private String UserId;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("ReadVideoAlarmTime")
    private LocalDateTime ReadVideoAlarmTime;

    @TableField("AlarmType")
    private Long AlarmType;

    @TableField("AdasAlarmTypeWithOne")
    private Long AdasAlarmTypeWithOne;

    @TableId("OpenId")
    private String OpenId;

    @TableField("UserType")
    private String UserType;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;


    @Override
    protected Serializable pkVal() {
        return this.OpenId;
    }

}
