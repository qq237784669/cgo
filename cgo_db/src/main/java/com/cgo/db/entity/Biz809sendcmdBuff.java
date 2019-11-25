package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("biz_809SendCmd_Buff")
public class Biz809sendcmdBuff extends Model<Biz809sendcmdBuff> {

    private static final long serialVersionUID=1L;

    @TableField("CmdDescription")
    private String CmdDescription;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("RspDescription")
    private String RspDescription;

    @TableField("SubCmdCode")
    private Integer SubCmdCode;

    @TableField("CmdResult")
    private Integer CmdResult;

    @TableField("SessionId")
    private String SessionId;

    @TableField("GovId")
    private String GovId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("ParamContent")
    private String ParamContent;

    @TableField("RspContent")
    private String RspContent;

    @TableField("UserId")
    private String UserId;

    @TableField("CmdCode")
    private Integer CmdCode;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
