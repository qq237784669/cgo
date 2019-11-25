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
@TableName("biz_ReceCmd_Buff")
public class BizRececmdBuff extends Model<BizRececmdBuff> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("SessionId")
    private String SessionId;

    @TableField("ParamContent")
    private String ParamContent;

    @TableField("CmdCode")
    private Long CmdCode;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CmdDescription")
    private String CmdDescription;

    @TableField("OrderId")
    private Integer OrderId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
