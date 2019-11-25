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
@TableName("Sys_ExtServiceInfo")
public class SysExtserviceinfo extends Model<SysExtserviceinfo> {

    private static final long serialVersionUID=1L;

    @TableField("Desp")
    private String Desp;

    @TableField("Id")
    private Integer Id;

    @TableId("ServiceId")
    private String ServiceId;

    @TableField("ServiceType")
    private String ServiceType;


    @Override
    protected Serializable pkVal() {
        return this.ServiceId;
    }

}
