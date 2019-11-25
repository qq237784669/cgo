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
@TableName("biz_SxAdasUpDriveverLog")
public class BizSxadasupdriveverlog extends Model<BizSxadasupdriveverlog> {

    private static final long serialVersionUID=1L;

    /**
     * 驾驶员ID
     */
    private String id;

    /**
     * 身份证编号
     */
    private String idCard;

    /**
     * 从业资格证号
     */
    @TableField("Licence")
    private String Licence;

    /**
     * 发证机构
     */
    private String orgName;

    /**
     * 正面照片
     */
    private String headImg;

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

    private String vehicleNo;

    private String platformId;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    private String driverName;

    @TableField("Reason")
    private String Reason;

    private Integer vehicleId;

    @TableId(value = "sId", type = IdType.AUTO)
    private Integer sId;

    private Integer owersId;

    private String mobile;

    private String drivingLicense;

    private String sign;


    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

}
