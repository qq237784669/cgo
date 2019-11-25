package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("bas_PlatformUpgradeRecord")
public class BasPlatformupgraderecord extends Model<BasPlatformupgraderecord> {

    private static final long serialVersionUID=1L;

    /**
     * 平台升级记录Id
     */
    @TableId(value = "RecordId", type = IdType.AUTO)
    private Integer RecordId;

    /**
     * 平台名称
     */
    @TableField("PlatformName")
    private String PlatformName;

    /**
     * 升级时间
     */
    @TableField("UpgradeTime")
    private LocalDateTime UpgradeTime;

    /**
     * 升级内容(每一项升级内容用'|'号分开)
     */
    @TableField("UpgradeContent")
    private String UpgradeContent;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("Version")
    private String Version;


    @Override
    protected Serializable pkVal() {
        return this.RecordId;
    }

}
