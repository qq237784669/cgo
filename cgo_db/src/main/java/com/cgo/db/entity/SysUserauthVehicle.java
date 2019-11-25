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
 * 用户车辆权限表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_UserAuth_Vehicle")
public class SysUserauthVehicle extends Model<SysUserauthVehicle> {

    private static final long serialVersionUID=1L;

    /**
     * 用户账号
     */
    @TableId("UserId")
    private String UserId;

    /**
     * 车辆Id
     */
    @TableField("VehicleId")
    private Integer VehicleId;

    /**
     * Id
     */
    @TableField("Id")
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
