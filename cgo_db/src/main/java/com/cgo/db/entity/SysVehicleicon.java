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
@TableName("sys_VehicleIcon")
public class SysVehicleicon extends Model<SysVehicleicon> {

    private static final long serialVersionUID=1L;

    private String offline;

    private String accoffNormal;

    @TableId("IconType")
    private String IconType;

    private String driveFull;

    private String speed0Alarm;

    private String driveAlarm;

    private String speed0Normal;

    private String accoffFull;

    private String gpsinvalidAlarm;

    private String speed0Operateoff;

    private String speed0Full;

    private String gpsinvalidNormal;

    private String gpsinvalidOperateoff;

    @TableField("IconOrder")
    private Integer IconOrder;

    private String accoffAlarm;

    private String gpsinvalidFull;

    @TableField("IconName")
    private String IconName;

    private String driveOperateoff;

    private String driveNormal;

    private String accoffOperateoff;


    @Override
    protected Serializable pkVal() {
        return this.IconType;
    }

}
