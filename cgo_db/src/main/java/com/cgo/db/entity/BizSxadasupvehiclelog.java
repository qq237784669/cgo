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
@TableName("biz_SxAdasUpVehicleLog")
public class BizSxadasupvehiclelog extends Model<BizSxadasupvehiclelog> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆类型：对于车辆表-VehicleTypeCode
     */
    private Integer vehicleType;

    /**
     * 运输行业类型 对应车辆表 -TransTypeCode
     */
    private String transType;

    /**
     * 车籍地 : 对应车辆表homecity
     */
    private Integer vehicleNationality;

    /**
     *  业户ID
     */
    private Integer owersId;

    /**
     * 车辆道路运输证号--RoadTransPortId
     */
    private String rtpn;

    /**
     * 车型号：BrandModel
     */
    private String vehicleMode;

    /**
     * 准牵引车总质量
     */
    private String tractiion;

    /**
     * 挂车车牌号
     */
    private String trailerNo;

    /**
     *  核定吨位
     */
    private String approvedTonnage;

    /**
     * 危险品货物分类
     */
    private String dgType;

    /**
     * 货物品名
     */
    private String cargoName;

    /**
     * 货物吨位
     */
    private String cargoTonnage;

    /**
     * 运输出发地
     */
    private String transportOrign;

    /**
     *  运输目的地
     */
    private String transportDes;

    /**
     * 运输开始时间
     */
    private LocalDateTime transportBeginTime;

    /**
     * 运输结束时间
     */
    private LocalDateTime transportEndTime;

    /**
     *  经营区域
     */
    private Integer bussinessArea;

    /**
     * 班线类型
     */
    private Integer banlineType;

    /**
     * 核定座位
     */
    private Integer approvedSeats;

    /**
     * 始发地
     */
    private String origin;

    /**
     * 始发站
     */
    private String destinationSt;

    /**
     * 讫发站
     */
    private String desSt;

    /**
     * 平台唯一编码
     */
    private String platformId;

    /**
     * 签名
     */
    private String sign;

    /**
     * 上报时间
     */
    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    /**
     * 上报类型： 1：车辆上报 2：车辆注销 
     */
    @TableField("ReportType")
    private Integer ReportType;

    /**
     * 上报状态： 1：成功 2：失败
     */
    @TableField("ReportState")
    private Integer ReportState;

    /**
     * 失败的原因
     */
    @TableField("Reason")
    private String Reason;

    private String vehicleNo;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer vehicleColor;

    private String destination;

    private Integer vehicleId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
