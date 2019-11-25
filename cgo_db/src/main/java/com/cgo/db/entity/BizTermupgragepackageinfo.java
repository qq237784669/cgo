package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_TermUpgragePackageInfo")
public class BizTermupgragepackageinfo extends Model<BizTermupgragepackageinfo> {

    private static final long serialVersionUID=1L;

    @TableField("ManufacturerId")
    private String ManufacturerId;

    @TableField("ManufacturerName")
    private String ManufacturerName;

    @TableField("FileName")
    private String FileName;

    @TableField("VersionId")
    private String VersionId;

    @TableField("Id")
    private Integer Id;

    @TableId("Version")
    private String Version;

    @TableField("UpgradeType")
    private Integer UpgradeType;

    @TableField("UpgradeFilePath")
    private String UpgradeFilePath;

    @TableField("Data")
    private byte[] Data;


    @Override
    protected Serializable pkVal() {
        return this.Version;
    }

}
