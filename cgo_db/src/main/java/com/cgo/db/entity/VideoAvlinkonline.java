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
@TableName("video_AVLinkOnline")
public class VideoAvlinkonline extends Model<VideoAvlinkonline> {

    private static final long serialVersionUID=1L;

    @TableField("StreamType")
    private Integer StreamType;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("DistributerId")
    private Long DistributerId;

    @TableId(value = "ReqId", type = IdType.AUTO)
    private Long ReqId;

    @TableField("AVType")
    private Integer AVType;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;


    @Override
    protected Serializable pkVal() {
        return this.ReqId;
    }

}
