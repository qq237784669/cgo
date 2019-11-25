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
@TableName("rep_AppVersion")
public class RepAppversion extends Model<RepAppversion> {

    private static final long serialVersionUID=1L;

    @TableField("VersionName")
    private String VersionName;

    @TableField("Remark")
    private String Remark;

    @TableField("UpdateTimes")
    private Integer UpdateTimes;

    @TableField("VersionType")
    private String VersionType;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("VersionCode")
    private Integer VersionCode;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("DownloadNetPath")
    private String DownloadNetPath;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
