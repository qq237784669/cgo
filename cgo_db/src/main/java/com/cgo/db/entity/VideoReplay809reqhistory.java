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
@TableName("video_Replay809ReqHistory")
public class VideoReplay809reqhistory extends Model<VideoReplay809reqhistory> {

    private static final long serialVersionUID=1L;

    @TableField("ReqId")
    private Long ReqId;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("AuthOrizeCode")
    private String AuthOrizeCode;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("GovId")
    private String GovId;

    @TableField("PlateColor")
    private Integer PlateColor;

    @TableField("HistoryId")
    private Long HistoryId;

    @TableField("PlayerId")
    private String PlayerId;

    @TableField("GNSSData")
    private String GNSSData;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
