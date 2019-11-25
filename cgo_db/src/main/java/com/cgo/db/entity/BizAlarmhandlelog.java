package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_AlarmHandleLog")
public class BizAlarmhandlelog extends Model<BizAlarmhandlelog> {

    private static final long serialVersionUID=1L;

    @TableField("HandleUserId")
    private String HandleUserId;

    @TableField("AlarmVerify")
    private Integer AlarmVerify;

    @TableField("AlarmFlag")
    private Integer AlarmFlag;

    @TableField("HandleTime")
    private LocalDateTime HandleTime;

    @TableField("Id")
    private String Id;

    @TableField("AlarmFalseNum")
    private Integer AlarmFalseNum;

    @TableField("HandleInfo")
    private String HandleInfo;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
