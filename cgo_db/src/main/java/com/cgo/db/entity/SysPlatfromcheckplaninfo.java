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
@TableName("sys_PlatfromCheckPlanInfo")
public class SysPlatfromcheckplaninfo extends Model<SysPlatfromcheckplaninfo> {

    private static final long serialVersionUID=1L;

    @TableField("ObjectId")
    private String ObjectId;

    @TableField("OperatorId")
    private Integer OperatorId;

    @TableField("SpanTime")
    private Integer SpanTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("QueryOperateType")
    private Integer QueryOperateType;

    @TableField("StartTime")
    private LocalDateTime StartTime;

    @TableField("QuestionId")
    private Integer QuestionId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Createby")
    private String Createby;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("ObjectType")
    private Integer ObjectType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
