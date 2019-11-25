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
@TableName("video_AVResourceListQueryInfo")
public class VideoAvresourcelistqueryinfo extends Model<VideoAvresourcelistqueryinfo> {

    private static final long serialVersionUID=1L;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("UserId")
    private String UserId;

    @TableField("AVType")
    private Integer AVType;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("Size")
    private Long Size;

    @TableField("StorageType")
    private Integer StorageType;

    @TableField("Id")
    private Long Id;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("OrderId")
    private Long OrderId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("StreamType")
    private Integer StreamType;

    @TableField("EndTime")
    private LocalDateTime EndTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
