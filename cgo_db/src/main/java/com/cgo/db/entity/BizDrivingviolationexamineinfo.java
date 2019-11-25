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
@TableName("biz_DrivingViolationExamineInfo")
public class BizDrivingviolationexamineinfo extends Model<BizDrivingviolationexamineinfo> {

    private static final long serialVersionUID=1L;

    @TableField("UserId")
    private String UserId;

    @TableField("TrackId")
    private String TrackId;

    @TableField("DrivingViolationId")
    private Long DrivingViolationId;

    @TableField("Remark")
    private String Remark;

    @TableField("ExamineFlag")
    private Integer ExamineFlag;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
