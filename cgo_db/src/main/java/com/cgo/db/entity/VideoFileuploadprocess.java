package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("video_FileUploadProcess")
public class VideoFileuploadprocess extends Model<VideoFileuploadprocess> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Process")
    private Double Process;

    @TableField("TaskId")
    private Long TaskId;

    @TableId("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Id")
    private Long Id;

    @TableField("CurrentSize")
    private Integer CurrentSize;

    @TableField("FileName")
    private String FileName;


    @Override
    protected Serializable pkVal() {
        return this.UpdateTime;
    }

}
