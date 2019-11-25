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
@TableName("video_AVDownloadInfo")
public class VideoAvdownloadinfo extends Model<VideoAvdownloadinfo> {

    private static final long serialVersionUID=1L;

    @TableField("StorageType")
    private Integer StorageType;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("IsDel")
    private Integer IsDel;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("StreamType")
    private Integer StreamType;

    @TableField("CreateUserId")
    private String CreateUserId;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("Path")
    private String Path;

    @TableField("TaskName")
    private String TaskName;

    @TableField("AVDataType")
    private Integer AVDataType;

    @TableField("FtpId")
    private Long FtpId;

    @TableField("ExecCondition")
    private Integer ExecCondition;

    @TableField("Status")
    private Integer Status;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Size")
    private Integer Size;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndLongitude")
    private Double EndLongitude;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
