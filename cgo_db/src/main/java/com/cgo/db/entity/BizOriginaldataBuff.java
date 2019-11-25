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
 * 透传数据_缓存表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_OriginalData_Buff")
public class BizOriginaldataBuff extends Model<BizOriginaldataBuff> {

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
     * 设备类型Id
     */
    @TableField("DeviceId")
    private Integer DeviceId;

    /**
     * 卫星时间
     */
    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    /**
     * 接收时间
     */
    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    /**
     * 原始数据包
     */
    @TableField("OriginalData")
    private String OriginalData;

    /**
     * 插入时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 删除时间
     */
    @TableField("DeleteTime")
    private LocalDateTime DeleteTime;

    @TableField("OrderId")
    private Integer OrderId;

    @TableField("WorkId")
    private Integer WorkId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
