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
@TableName("biz_ExAlarmProcess")
public class BizExalarmprocess extends Model<BizExalarmprocess> {

    private static final long serialVersionUID=1L;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Remark")
    private String Remark;

    @TableField("ProcessTime")
    private LocalDateTime ProcessTime;

    @TableField("UserId")
    private String UserId;

    @TableField("ProcessMode")
    private String ProcessMode;

    @TableField("ModuleCode")
    private String ModuleCode;

    @TableField("AlarmId")
    private String AlarmId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("WorkId")
    private Integer WorkId;

    @TableField("ProcessResult")
    private Integer ProcessResult;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
