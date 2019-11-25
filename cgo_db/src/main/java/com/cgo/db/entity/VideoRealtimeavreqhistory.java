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
@TableName("video_RealTimeAVReqHistory")
public class VideoRealtimeavreqhistory extends Model<VideoRealtimeavreqhistory> {

    private static final long serialVersionUID=1L;

    @TableField("DistributerId")
    private Integer DistributerId;

    @TableField("DataSize")
    private Long DataSize;

    @TableField("PlayerId")
    private String PlayerId;

    @TableField("ReqEndTime")
    private LocalDateTime ReqEndTime;

    @TableField("ReqId")
    private Long ReqId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("AVType")
    private Integer AVType;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("UserId")
    private String UserId;

    @TableField("ReqBeginTime")
    private LocalDateTime ReqBeginTime;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
