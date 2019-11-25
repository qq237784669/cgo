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
@TableName("adas_AttachmentFileInfo_buff")
public class AdasAttachmentfileinfoBuff extends Model<AdasAttachmentfileinfoBuff> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsUploadCompleted")
    private Integer IsUploadCompleted;

    @TableField("FileName")
    private String FileName;

    @TableField("StorageRoute")
    private String StorageRoute;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId(value = "FileId", type = IdType.AUTO)
    private Integer FileId;

    @TableField("DistributerId")
    private Integer DistributerId;

    @TableField("FileType")
    private Integer FileType;

    @TableField("Size")
    private Integer Size;

    @TableField("AlarmId")
    private String AlarmId;


    @Override
    protected Serializable pkVal() {
        return this.FileId;
    }

}
