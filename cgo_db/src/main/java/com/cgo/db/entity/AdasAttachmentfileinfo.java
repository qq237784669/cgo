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
@TableName("adas_AttachmentFileInfo")
public class AdasAttachmentfileinfo extends Model<AdasAttachmentfileinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 报警编号
     */
    @TableField("AlarmId")
    private String AlarmId;

    /**
     * 文件名
     */
    @TableField("FileName")
    private String FileName;

    /**
     * 文件类型（0：图片 1：音频 2：视频 3：文本 4：其它）
     */
    @TableField("FileType")
    private Integer FileType;

    /**
     * 文件大小
     */
    @TableField("Size")
    private Integer Size;

    /**
     * 存储目录
     */
    @TableField("StorageRoute")
    private String StorageRoute;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsUploadCompleted")
    private Integer IsUploadCompleted;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableId(value = "FileId", type = IdType.AUTO)
    private Integer FileId;

    @TableField("DistributerId")
    private Integer DistributerId;


    @Override
    protected Serializable pkVal() {
        return this.FileId;
    }

}
