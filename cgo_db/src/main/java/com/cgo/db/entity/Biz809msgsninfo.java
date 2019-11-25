package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_809MsgSNInfo")
public class Biz809msgsninfo extends Model<Biz809msgsninfo> {

    private static final long serialVersionUID=1L;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableId("CmdCode")
    private Long CmdCode;

    @TableField("GovId")
    private String GovId;

    @TableField("OrderId")
    private Long OrderId;

    @TableField("ChannelType")
    private Integer ChannelType;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.CmdCode;
    }

}
