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
@TableName("biz_SxAdasUpDeviceLog")
public class BizSxadasupdevicelog extends Model<BizSxadasupdevicelog> {

    private static final long serialVersionUID=1L;

    /**
     * 终端ID：对于车辆表-TerminalId
     */
    @TableField("Id")
    private String Id;

    /**
     * 终端手机号
     */
    private String deviceId;

    /**
     * 终端型号
     */
    private String modelType;

    /**
     * SIMMNM
     */
    private String simcode;

    /**
     * 上报类型 1：上报 2：注销
     */
    @TableField("ReportType")
    private Integer ReportType;

    /**
     * 上报状态 1：成功 2：失败
     */
    @TableField("ReportState")
    private Integer ReportState;

    private String producerId;

    private String platformId;

    @TableField("Reason")
    private String Reason;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("ICCID")
    private String iccid;

    private String sign;

    @TableId(value = "SId", type = IdType.AUTO)
    private Integer SId;

    private String vehicleNo;

    private Integer vehicleId;

    private Integer owersId;


    @Override
    protected Serializable pkVal() {
        return this.SId;
    }

}
