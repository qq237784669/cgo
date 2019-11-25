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
 * 车辆在线信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleOnline")
public class BizVehicleonline extends Model<BizVehicleonline> {

    private static final long serialVersionUID=1L;

    /**
     * SIM卡号
     */
    @TableId("SimNum")
    private String SimNum;

    /**
     * 上线时间
     */
    @TableField("OnlineTime")
    private LocalDateTime OnlineTime;

    /**
     * 刷新状态时间
     */
    @TableField("LastFreshTime")
    private LocalDateTime LastFreshTime;

    /**
     * 在线状态
     */
    @TableField("IsOnline")
    private Integer IsOnline;

    /**
     * 服务器标识
     */
    @TableField("ServerFlag")
    private Integer ServerFlag;

    /**
     * 服务器IP
     */
    @TableField("ServerIP")
    private String ServerIP;

    /**
     * 接收时间
     */
    @TableField("InsertTime")
    private LocalDateTime InsertTime;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
