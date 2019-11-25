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
@TableName("biz_809PlatformCheckRequest")
public class Biz809platformcheckrequest extends Model<Biz809platformcheckrequest> {

    private static final long serialVersionUID=1L;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("SendUserId")
    private String SendUserId;

    @TableField("ObjectType")
    private Integer ObjectType;

    @TableField("PlatformId")
    private String PlatformId;

    @TableField("Question")
    private String Question;

    @TableField("ObjectId")
    private String ObjectId;

    @TableField("NeedSendTime")
    private LocalDateTime NeedSendTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("QueryOperateType")
    private Integer QueryOperateType;

    @TableField("QuestionBankId")
    private Integer QuestionBankId;

    @TableField("QueryPlanId")
    private Integer QueryPlanId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
