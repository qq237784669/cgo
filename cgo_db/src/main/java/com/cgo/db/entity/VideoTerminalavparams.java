package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("video_TerminalAVParams")
public class VideoTerminalavparams extends Model<VideoTerminalavparams> {

    private static final long serialVersionUID=1L;

    /**
     * 音频编码
     */
    @TableField("AudioCode")
    private Integer AudioCode;

    /**
     * 音频编码码率
     */
    @TableField("AudioCodeRate")
    private String AudioCodeRate;

    /**
     * 对讲通道号
     */
    @TableField("TalkbackCh")
    private Integer TalkbackCh;

    /**
     * 是否为海思编码
     */
    @TableField("IsHaisiCode")
    private Integer IsHaisiCode;

    /**
     * 对讲音频编码
     */
    @TableField("TalkbackAudioCode")
    private Integer TalkbackAudioCode;

    /**
     * 对讲音频码率
     */
    @TableField("TalkbackCodeRate")
    private String TalkbackCodeRate;

    @TableField("MaxAudioChNo")
    private Integer MaxAudioChNo;

    @TableId("TerminalTypeId")
    private Integer TerminalTypeId;

    @TableField("TalkAudioMultiple")
    private Double TalkAudioMultiple;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.TerminalTypeId;
    }

}
