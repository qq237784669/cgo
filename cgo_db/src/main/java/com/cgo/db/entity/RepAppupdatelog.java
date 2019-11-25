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
@TableName("rep_AppUpdateLog")
public class RepAppupdatelog extends Model<RepAppupdatelog> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableField("PrevAppVersionName")
    private String PrevAppVersionName;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("mobAddress")
    private String mobAddress;

    @TableField("AppUpdateDigest")
    private String AppUpdateDigest;

    @TableField("UserId")
    private String UserId;

    @TableField("UpdateStatus")
    private Integer UpdateStatus;

    @TableField("DoneTime")
    private LocalDateTime DoneTime;

    @TableField("mobMODEL")
    private String mobMODEL;

    @TableField("mobLatitude")
    private Double mobLatitude;

    @TableField("UpdateAppVersionCode")
    private Integer UpdateAppVersionCode;

    @TableField("mobLongitude")
    private Double mobLongitude;

    @TableField("MobileOs")
    private Integer MobileOs;

    @TableField("PrevAppVersionCode")
    private Integer PrevAppVersionCode;

    @TableField("CustomerCode")
    private String CustomerCode;

    @TableField("mobMANUFACTURER")
    private String mobMANUFACTURER;

    @TableField("mobSystemVersion")
    private String mobSystemVersion;

    @TableField("UpdateAppVersionName")
    private String UpdateAppVersionName;

    @TableField("UserType")
    private String UserType;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("IMEI")
    private String imei;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
