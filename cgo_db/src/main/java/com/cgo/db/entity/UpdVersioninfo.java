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
@TableName("upd_VersionInfo")
public class UpdVersioninfo extends Model<UpdVersioninfo> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("VersionDesp")
    private String VersionDesp;

    @TableField("HdVersionNo")
    private String HdVersionNo;

    @TableField("FileName")
    private String FileName;

    @TableField("ModuleId")
    private Integer ModuleId;

    @TableField("FileSize")
    private Integer FileSize;

    @TableId(value = "VersionId", type = IdType.AUTO)
    private Integer VersionId;

    @TableField("ManufacturerId")
    private String ManufacturerId;

    @TableField("SwVersionNo")
    private String SwVersionNo;

    @TableField("ManufacturerName")
    private String ManufacturerName;

    @TableField("UpgradeFilePath")
    private String UpgradeFilePath;


    @Override
    protected Serializable pkVal() {
        return this.VersionId;
    }

}
