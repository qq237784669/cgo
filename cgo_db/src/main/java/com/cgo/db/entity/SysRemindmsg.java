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
@TableName("sys_RemindMsg")
public class SysRemindmsg extends Model<SysRemindmsg> {

    private static final long serialVersionUID=1L;

    @TableField("IsEnable")
    private Boolean IsEnable;

    @TableField("MsgName")
    private String MsgName;

    @TableField("MsgContent")
    private String MsgContent;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("MsgType")
    private Integer MsgType;

    @TableField("Remark")
    private String Remark;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IsPopup")
    private Boolean IsPopup;

    @TableField("ExpiryDate")
    private LocalDateTime ExpiryDate;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("AppliedRange")
    private Integer AppliedRange;

    @TableField("CreateBy")
    private String CreateBy;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
