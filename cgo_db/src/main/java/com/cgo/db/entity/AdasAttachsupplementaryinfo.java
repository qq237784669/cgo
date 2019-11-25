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
@TableName("adas_AttachSupplementaryInfo")
public class AdasAttachsupplementaryinfo extends Model<AdasAttachsupplementaryinfo> {

    private static final long serialVersionUID=1L;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("FileName")
    private String FileName;

    @TableField("OffsetIndex")
    private Integer OffsetIndex;

    @TableField("SimNum")
    private String SimNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("FileId")
    private Integer FileId;

    @TableField("DataCount")
    private Integer DataCount;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
