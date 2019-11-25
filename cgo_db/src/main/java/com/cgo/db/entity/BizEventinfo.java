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
@TableName("biz_EventInfo")
public class BizEventinfo extends Model<BizEventinfo> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("MsgText")
    private String MsgText;

    @TableField("MsgType")
    private Integer MsgType;

    @TableField("Result")
    private Integer Result;

    @TableField("FromInfo")
    private String FromInfo;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SendType")
    private Integer SendType;

    @TableField("ToUserList")
    private String ToUserList;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
