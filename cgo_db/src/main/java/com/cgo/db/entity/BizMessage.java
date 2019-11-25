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
@TableName("biz_Message")
public class BizMessage extends Model<BizMessage> {

    private static final long serialVersionUID=1L;

    @TableField("MsgTypeId")
    private Integer MsgTypeId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("MsgContent")
    private String MsgContent;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CreateBy")
    private String CreateBy;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
