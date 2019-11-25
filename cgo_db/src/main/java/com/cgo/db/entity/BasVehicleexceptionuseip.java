package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("bas_VehicleExceptionUseIP")
public class BasVehicleexceptionuseip extends Model<BasVehicleexceptionuseip> {

    private static final long serialVersionUID=1L;

    @TableId("VehicleId")
    private Integer VehicleId;

    @TableField("IsIPDownVideo")
    private Integer IsIPDownVideo;

    @TableField("IsIPRealVideo")
    private Integer IsIPRealVideo;

    @TableField("IsIPDownAttach")
    private Integer IsIPDownAttach;

    @TableField("IsIPReplayVideo")
    private Integer IsIPReplayVideo;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
