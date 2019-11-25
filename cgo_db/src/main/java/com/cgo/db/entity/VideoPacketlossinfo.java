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
@TableName("video_PacketLossInfo")
public class VideoPacketlossinfo extends Model<VideoPacketlossinfo> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ChannelId")
    private Integer ChannelId;

    @TableField("PacketLoss")
    private Integer PacketLoss;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
