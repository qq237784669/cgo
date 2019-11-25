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
@TableName("biz_TermUpgrageManager")
public class BizTermupgragemanager extends Model<BizTermupgragemanager> {

    private static final long serialVersionUID=1L;

    @TableField("Version")
    private String Version;

    @TableField("Remark")
    private String Remark;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("OperatorCode")
    private Integer OperatorCode;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("OffSet")
    private Integer OffSet;

    @TableField("State")
    private Integer State;

    @TableId("SimNum")
    private String SimNum;

    @TableField("UpgradeType")
    private Integer UpgradeType;

    @TableField("Process")
    private Integer Process;

    @TableField("PackageSize")
    private Integer PackageSize;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
