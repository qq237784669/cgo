package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_809SendCmdResult")
public class Biz809sendcmdresult extends Model<Biz809sendcmdresult> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("WorkId")
    private Integer WorkId;

    @TableField("MsgType")
    private Integer MsgType;

    @TableField("OrderResult")
    private String OrderResult;

    @TableField("OrderID")
    private Integer OrderID;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
