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
@TableName("biz_SxAdasUpGuardsLog")
public class BizSxadasupguardslog extends Model<BizSxadasupguardslog> {

    private static final long serialVersionUID=1L;

    /**
     * 押运员ID
     */
    private String id;

    /**
     * 押运员名称
     */
    private String name;

    /**
     * 从业资格证
     */
    private String licence;

    /**
     * 车牌号码
     */
    private String vehicleNo;

    /**
     * 车辆id
     */
    private Integer vehicleId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 组织id
     */
    private Integer owersId;

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

    /**
     * 上报失败原因
     */
    @TableField("Reason")
    private String Reason;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    private String sign;

    @TableId(value = "sId", type = IdType.AUTO)
    private Integer sId;

    private String platformId;


    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

}
