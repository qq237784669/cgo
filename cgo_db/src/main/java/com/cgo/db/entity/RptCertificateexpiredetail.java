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
@TableName("rpt_CertificateExpireDetail")
public class RptCertificateexpiredetail extends Model<RptCertificateexpiredetail> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆道路运输经营许可证到期时间
     */
    @TableField("VclnumEnd")
    private LocalDateTime VclnumEnd;

    /**
     * 状态（0：正常，1：过期）
     */
    @TableField("VclnumEndState")
    private Integer VclnumEndState;

    /**
     * 企业道路运输经营许可证到期时间
     */
    @TableField("LicenseEndDate")
    private LocalDateTime LicenseEndDate;

    /**
     * 状态（0：正常，1：过期）
     */
    @TableField("LicenseEndDateState")
    private Integer LicenseEndDateState;

    @TableField("PlateNum")
    private String PlateNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SimNum")
    private String SimNum;

    @TableField("OrgName")
    private String OrgName;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
