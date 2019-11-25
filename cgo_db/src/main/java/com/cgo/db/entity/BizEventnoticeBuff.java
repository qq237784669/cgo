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
@TableName("biz_EventNotice_Buff")
public class BizEventnoticeBuff extends Model<BizEventnoticeBuff> {

    private static final long serialVersionUID=1L;

    @TableField("EventType")
    private Integer EventType;

    @TableField("IsNeedAnalysis")
    private Integer IsNeedAnalysis;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("UserId")
    private String UserId;

    @TableField("ParamContent")
    private String ParamContent;

    @TableField("EventContent")
    private String EventContent;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UpdataType")
    private Integer UpdataType;

    @TableField("DistributeType")
    private Integer DistributeType;

    @TableField("EventDescript")
    private String EventDescript;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
