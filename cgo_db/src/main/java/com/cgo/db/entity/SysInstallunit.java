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
@TableName("sys_InstallUnit")
public class SysInstallunit extends Model<SysInstallunit> {

    private static final long serialVersionUID=1L;

    @TableField("UnitName")
    private String UnitName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Contact")
    private String Contact;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ContactNum")
    private String ContactNum;

    @TableField("CreateBy")
    private String CreateBy;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
