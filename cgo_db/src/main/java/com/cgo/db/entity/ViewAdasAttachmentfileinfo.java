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
@TableName("View_adas_AttachmentFileInfo")
public class ViewAdasAttachmentfileinfo extends Model<ViewAdasAttachmentfileinfo> {

    private static final long serialVersionUID=1L;

    @TableField("FileName")
    private String FileName;

    @TableField("IsUploadCompleted")
    private Integer IsUploadCompleted;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("StorageRoute")
    private String StorageRoute;

    @TableField("FileId")
    private Integer FileId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("FileType")
    private Integer FileType;

    @TableField("DistributerId")
    private Integer DistributerId;

    @TableField("Size")
    private Integer Size;

    @TableField("AlarmId")
    private String AlarmId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
