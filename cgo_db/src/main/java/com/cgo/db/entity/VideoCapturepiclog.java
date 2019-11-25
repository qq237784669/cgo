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
@TableName("video_CapturePicLog")
public class VideoCapturepiclog extends Model<VideoCapturepiclog> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("Info")
    private String Info;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("Data")
    private byte[] Data;

    @TableField("SimNum")
    private String SimNum;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
