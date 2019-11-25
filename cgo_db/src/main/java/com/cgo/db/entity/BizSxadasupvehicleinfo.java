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
@TableName("biz_SxAdasUpVehicleinfo")
public class BizSxadasupvehicleinfo extends Model<BizSxadasupvehicleinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆状态 1：车辆上报 2:车辆注销
     */
    @TableField("VehicleReportState")
    private Integer VehicleReportState;

    /**
     * 终端状态 1：终端上报 2:终端注销
     */
    @TableField("TerminalReportState")
    private Integer TerminalReportState;

    private Integer vehicleId;

    @TableField("VehicleReprotTime")
    private LocalDateTime VehicleReprotTime;

    @TableField("TerminalReprotTime")
    private LocalDateTime TerminalReprotTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
