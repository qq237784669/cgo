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
@TableName("adas_AttachmentTaskLog")
public class AdasAttachmenttasklog extends Model<AdasAttachmenttasklog> {

    private static final long serialVersionUID=1L;

    /**
     * 1为成功 其他为失败
     */
    @TableField("Result")
    private Integer Result;

    @TableField("SimNum")
    private String SimNum;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("TaskId")
    private Long TaskId;

    @TableField("Remark")
    private String Remark;

    @TableField("FileName")
    private String FileName;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AlarmId")
    private String AlarmId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
