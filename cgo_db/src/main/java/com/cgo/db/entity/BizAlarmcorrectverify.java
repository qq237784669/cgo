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
@TableName("biz_AlarmCorrectVerify")
public class BizAlarmcorrectverify extends Model<BizAlarmcorrectverify> {

    private static final long serialVersionUID=1L;

    @TableId("AlarmId")
    private String AlarmId;

    @TableField("LastVerifyUser")
    private String LastVerifyUser;

    @TableField("RemindTime")
    private LocalDateTime RemindTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IsCorrect")
    private Integer IsCorrect;

    @TableField("LastVerifyTime")
    private LocalDateTime LastVerifyTime;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsPush")
    private Integer IsPush;

    @TableField("IsNotRemind")
    private Integer IsNotRemind;


    @Override
    protected Serializable pkVal() {
        return this.AlarmId;
    }

}
