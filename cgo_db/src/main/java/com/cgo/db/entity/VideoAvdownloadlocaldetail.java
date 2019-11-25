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
@TableName("video_AVDownloadLocalDetail")
public class VideoAvdownloadlocaldetail extends Model<VideoAvdownloadlocaldetail> {

    private static final long serialVersionUID=1L;

    @TableField("StartTime")
    private LocalDateTime StartTime;

    @TableField("Status")
    private Long Status;

    @TableField("UserId")
    private String UserId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("LocalPath")
    private String LocalPath;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("TaskId")
    private Long TaskId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
