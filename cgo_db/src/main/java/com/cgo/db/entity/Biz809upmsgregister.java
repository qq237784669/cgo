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
@TableName("biz_809UpMsgRegister")
public class Biz809upmsgregister extends Model<Biz809upmsgregister> {

    private static final long serialVersionUID=1L;

    @TableField("TerminalModelType")
    private String TerminalModelType;

    @TableField("TerminalResult")
    private Integer TerminalResult;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("TerminalImeiNum")
    private String TerminalImeiNum;

    @TableField("TerminalSimCode")
    private String TerminalSimCode;

    @TableField("ProducerID")
    private String ProducerID;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("PlatFormID")
    private String PlatFormID;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("TerminalID")
    private String TerminalID;

    @TableField("RegisterResult")
    private Integer RegisterResult;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
