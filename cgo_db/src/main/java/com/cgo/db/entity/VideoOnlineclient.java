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
@TableName("video_OnlineClient")
public class VideoOnlineclient extends Model<VideoOnlineclient> {

    private static final long serialVersionUID=1L;

    private Integer port;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    private Long id;

    private String userid;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("LastTime")
    private LocalDateTime LastTime;

    private String ip;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
