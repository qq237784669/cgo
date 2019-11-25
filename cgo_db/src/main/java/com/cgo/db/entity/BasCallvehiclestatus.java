package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("bas_CallVehicleStatus")
public class BasCallvehiclestatus extends Model<BasCallvehiclestatus> {

    private static final long serialVersionUID=1L;

    /**
     * sim卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 卫星定位时间
     */
    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    /**
     * 空重车状态 1为重车0 为空车
     */
    @TableField("EmptyVehicleStatus")
    private Integer EmptyVehicleStatus;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
