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
@TableName("biz_TermUpgrageLog")
public class BizTermupgragelog extends Model<BizTermupgragelog> {

    private static final long serialVersionUID=1L;

    @TableField("Version")
    private String Version;

    @TableField("OffSet")
    private Integer OffSet;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Remark")
    private String Remark;

    @TableField("State")
    private Integer State;

    @TableField("Process")
    private Integer Process;

    @TableField("SimNum")
    private String SimNum;

    @TableField("UpgradeType")
    private Integer UpgradeType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
