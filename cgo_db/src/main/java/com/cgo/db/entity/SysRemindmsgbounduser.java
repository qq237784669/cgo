package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_RemindMsgBoundUser")
public class SysRemindmsgbounduser extends Model<SysRemindmsgbounduser> {

    private static final long serialVersionUID=1L;

    @TableId("BoundUserId")
    private String BoundUserId;

    @TableField("Id")
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.BoundUserId;
    }

}
