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
 * 组织信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_Org")
public class BasOrg extends Model<BasOrg> {

    private static final long serialVersionUID=1L;

    /**
     * 组织Id
     */
    @TableId(value = "OrgId", type = IdType.AUTO)
    private Integer OrgId;

    /**
     * 组织名称
     */
    @TableField("OrgName")
    private String OrgName;

    /**
     * 组织类别
     */
    @TableField("OrgType")
    private Integer OrgType;

    /**
     * 搜索代码（第一级ID,第二级ID,...父级ID,自身组织ID,）
     */
    @TableField("SearchCode")
    private String SearchCode;

    /**
     * 父级Id
     */
    @TableField("ParentId")
    private Integer ParentId;

    /**
     * 联系人
     */
    @TableField("Contact")
    private String Contact;

    /**
     * 联系电话
     */
    @TableField("Telephone")
    private String Telephone;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("MaxCarNum2G")
    private Integer MaxCarNum2G;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("RoadID")
    private String RoadID;

    @TableField("ContactInfo")
    private String ContactInfo;

    @TableField("OrgAddr")
    private String OrgAddr;

    @TableField("IssuedBy")
    private String IssuedBy;

    @TableField("ContactAdress")
    private String ContactAdress;

    @TableField("CanHaveCars")
    private Integer CanHaveCars;

    @TableField("OrgCode")
    private String OrgCode;

    @TableField("Region")
    private String Region;

    @TableField("MaxCarNum4G")
    private Integer MaxCarNum4G;

    @TableField("HomeAddress")
    private String HomeAddress;

    @TableField("IssuingAgency")
    private String IssuingAgency;

    @TableField("OwnerSimNum")
    private String OwnerSimNum;

    @TableField("MaxCarNumADAS")
    private Integer MaxCarNumADAS;

    @TableField("VehicleTotal")
    private String VehicleTotal;

    @TableField("DivisonCode")
    private Integer DivisonCode;

    @TableField("MaxCarNum")
    private Integer MaxCarNum;

    @TableField("Sex")
    private Integer Sex;

    @TableField("PersonId")
    private String PersonId;

    @TableField("RoadTransportID")
    private String RoadTransportID;

    @TableField("CustomerDesc")
    private String CustomerDesc;

    @TableField("CEOName")
    private String CEOName;

    @TableField("OwnerRemark")
    private String OwnerRemark;

    @TableField("IsVehicleAutoSetOrgWhenDel")
    private Boolean IsVehicleAutoSetOrgWhenDel;

    @TableField("OperateScope")
    private String OperateScope;


    @Override
    protected Serializable pkVal() {
        return this.OrgId;
    }

}
