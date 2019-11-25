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
@TableName("video_SpaceWarning")
public class VideoSpacewarning extends Model<VideoSpacewarning> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("FreeSpace")
    private Double FreeSpace;

    @TableField("DriveLetter")
    private String DriveLetter;

    @TableField("UsedSpace")
    private Double UsedSpace;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
