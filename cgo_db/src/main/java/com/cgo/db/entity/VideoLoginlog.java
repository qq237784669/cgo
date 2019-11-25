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
@TableName("video_LoginLog")
public class VideoLoginlog extends Model<VideoLoginlog> {

    private static final long serialVersionUID=1L;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("Ip")
    private String Ip;

    @TableField("ClientId")
    private Long ClientId;

    @TableField("UserId")
    private String UserId;

    @TableField("LogoutReason")
    private String LogoutReason;

    private Long id;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableField("Port")
    private Integer Port;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
