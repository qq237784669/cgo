package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("Wx2_MessagePushLog")
public class Wx2Messagepushlog extends Model<Wx2Messagepushlog> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableField("PushTime")
    private LocalDateTime PushTime;

    @TableField("WxNickName")
    private String WxNickName;

    @TableField("UserId")
    private String UserId;

    @TableField("PushType")
    private String PushType;

    @TableField("PushContont")
    private String PushContont;

    @TableField("OpenId")
    private String OpenId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
