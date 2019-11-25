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
@TableName("adas_AttachUploadCompletedInfo")
public class AdasAttachuploadcompletedinfo extends Model<AdasAttachuploadcompletedinfo> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("FileName")
    private String FileName;

    @TableField("FileLength")
    private Integer FileLength;

    @TableField("NeedSupplementaryCount")
    private Integer NeedSupplementaryCount;

    @TableField("SimNum")
    private String SimNum;

    @TableField("FileType")
    private Integer FileType;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
