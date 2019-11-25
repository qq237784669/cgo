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
@TableName("biz_809SendCmd")
public class Biz809sendcmd extends Model<Biz809sendcmd> {

    private static final long serialVersionUID=1L;

    @TableField("OrderID")
    private Integer OrderID;

    @TableField("CmdContent")
    private String CmdContent;

    @TableField("CmdCode")
    private Integer CmdCode;

    @TableField("bSend")
    private Integer bSend;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("AddTime")
    private LocalDateTime AddTime;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
