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
@TableName("video_ReplayReqHistory")
public class VideoReplayreqhistory extends Model<VideoReplayreqhistory> {

    private static final long serialVersionUID=1L;

    @TableField("StorageType")
    private Integer StorageType;

    @TableField("ReqEndTime")
    private LocalDateTime ReqEndTime;

    @TableField("FastType")
    private Integer FastType;

    @TableField("ReplayBeginTime")
    private LocalDateTime ReplayBeginTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("PlayMode")
    private Integer PlayMode;

    @TableField("ReplayEndTime")
    private LocalDateTime ReplayEndTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("StreamType")
    private Integer StreamType;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("UserId")
    private String UserId;

    @TableField("AVType")
    private Integer AVType;

    @TableField("ReqId")
    private Long ReqId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("PlayerId")
    private String PlayerId;

    @TableField("DistributerId")
    private Integer DistributerId;

    @TableField("DataSize")
    private Long DataSize;

    @TableField("ReqBeginTime")
    private LocalDateTime ReqBeginTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
