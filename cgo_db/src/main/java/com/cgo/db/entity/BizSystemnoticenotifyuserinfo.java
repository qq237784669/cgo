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
@TableName("biz_SystemNoticeNotifyUserInfo")
public class BizSystemnoticenotifyuserinfo extends Model<BizSystemnoticenotifyuserinfo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("NotifyUserType")
    private Integer NotifyUserType;

    @TableField("NotifyUser")
    private String NotifyUser;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("NoticeId")
    private Long NoticeId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
