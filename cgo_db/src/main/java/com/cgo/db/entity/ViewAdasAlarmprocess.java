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
@TableName("View_adas_AlarmProcess")
public class ViewAdasAlarmprocess extends Model<ViewAdasAlarmprocess> {

    private static final long serialVersionUID=1L;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("ProcessResult")
    private Integer ProcessResult;

    @TableField("AlarmId")
    private String AlarmId;

    @TableField("ProcessMode")
    private String ProcessMode;

    @TableField("SessionId")
    private String SessionId;

    @TableField("AlarmType")
    private Integer AlarmType;

    @TableField("Remark")
    private String Remark;

    @TableField("ProcessTime")
    private LocalDateTime ProcessTime;

    @TableField("UserId")
    private String UserId;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
