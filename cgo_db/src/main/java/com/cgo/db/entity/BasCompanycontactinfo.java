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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_CompanyContactInfo")
public class BasCompanycontactinfo extends Model<BasCompanycontactinfo> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableField("AlarmFlag1")
    private String AlarmFlag1;

    @TableField("Sign4")
    private Integer Sign4;

    @TableField("ContactName")
    private String ContactName;

    @TableField("Position")
    private Boolean Position;

    @TableField("EmailAddress")
    private String EmailAddress;

    @TableField("Telephone")
    private String Telephone;

    @TableField("IsDropNotice")
    private Integer IsDropNotice;

    @TableField("Speed")
    private String Speed;

    @TableId(value = "ContactId", type = IdType.AUTO)
    private Integer ContactId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Sign2")
    private Integer Sign2;

    @TableField("SpanTime")
    private Integer SpanTime;

    @TableField("AlarmFlag2")
    private String AlarmFlag2;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("Sign3")
    private Integer Sign3;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("Sign1")
    private Integer Sign1;

    @TableField("Address")
    private String Address;

    @TableField("SendNullTable")
    private Boolean SendNullTable;

    @TableField("SpeedRate")
    private String SpeedRate;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("OfflineTime")
    private Integer OfflineTime;

    @TableField("NoticeTime")
    private String NoticeTime;

    @TableField("AccState")
    private Integer AccState;


    @Override
    protected Serializable pkVal() {
        return this.ContactId;
    }

}
