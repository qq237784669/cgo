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
@TableName("biz_DriverInfoByParam")
public class BizDriverinfobyparam extends Model<BizDriverinfobyparam> {

    private static final long serialVersionUID=1L;

    @TableField("OrgName")
    private String OrgName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("CertificateValidityTime")
    private LocalDateTime CertificateValidityTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("DriverId")
    private String DriverId;

    @TableField("DriverType")
    private Integer DriverType;

    @TableField("DriverName")
    private String DriverName;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("AgencyName")
    private String AgencyName;

    @TableField("WorkLicenseId")
    private String WorkLicenseId;

    @TableField("DriverPhotosURL")
    private String DriverPhotosURL;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
