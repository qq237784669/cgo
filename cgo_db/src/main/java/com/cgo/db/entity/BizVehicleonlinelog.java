package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * 车辆上下线日志表 上线一条记录时间只填上线时间字段 下线一条记录时间只填下线时间字段
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleOnlineLog")
public class BizVehicleonlinelog extends Model<BizVehicleonlinelog> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 上线时间
     */
    @TableField("OccurTime")
    private LocalDateTime OccurTime;

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
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Flag")
    private Integer Flag;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
