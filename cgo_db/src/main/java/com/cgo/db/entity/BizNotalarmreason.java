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
@TableName("biz_NotAlarmReason")
public class BizNotalarmreason extends Model<BizNotalarmreason> {

    private static final long serialVersionUID=1L;

    @TableField("Reason")
    private String Reason;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Remark")
    private String Remark;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("AlarmVerify")
    private Integer AlarmVerify;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
