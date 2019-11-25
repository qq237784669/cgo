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
@TableName("video_RealTimeAV809ReqHistory")
public class VideoRealtimeav809reqhistory extends Model<VideoRealtimeav809reqhistory> {

    private static final long serialVersionUID=1L;

    @TableField("GovId")
    private String GovId;

    @TableField("PlateColor")
    private Integer PlateColor;

    @TableField("AuthOrizeCode")
    private String AuthOrizeCode;

    @TableField("HistoryId")
    private Long HistoryId;

    @TableField("GNSSData")
    private String GNSSData;

    @TableField("PlayerId")
    private String PlayerId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("ReqId")
    private Long ReqId;

    @TableField("PlateNum")
    private String PlateNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
