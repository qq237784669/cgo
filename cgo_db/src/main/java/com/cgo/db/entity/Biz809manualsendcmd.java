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
@TableName("biz_809ManualSendCmd")
public class Biz809manualsendcmd extends Model<Biz809manualsendcmd> {

    private static final long serialVersionUID=1L;

    @TableField("ParameValue")
    private String ParameValue;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CmdCode")
    private String CmdCode;

    @TableField("SimNum")
    private String SimNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
