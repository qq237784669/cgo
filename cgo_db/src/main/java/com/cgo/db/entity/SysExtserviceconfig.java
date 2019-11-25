package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_ExtServiceConfig")
public class SysExtserviceconfig extends Model<SysExtserviceconfig> {

    private static final long serialVersionUID=1L;

    @TableField("GovPort")
    private Integer GovPort;

    @TableField("Remark")
    private String Remark;

    @TableField("ServiceId")
    private String ServiceId;

    @TableField("IC1")
    private Integer ic1;

    @TableField("ParamType")
    private String ParamType;

    @TableField("AccessCode")
    private Integer AccessCode;

    @TableField("IsFiterUserId")
    private Boolean IsFiterUserId;

    @TableField("ParamContent")
    private String ParamContent;

    @TableId("GovId")
    private String GovId;

    @TableField("CompanyInnerPort")
    private Integer CompanyInnerPort;

    @TableField("M1")
    private Integer m1;

    @TableField("IsOpen")
    private Boolean IsOpen;

    @TableField("LoginUserId")
    private String LoginUserId;

    @TableField("IA1")
    private Integer ia1;

    @TableField("CompanyIP")
    private String CompanyIP;

    @TableField("Key")
    private Integer Key;

    @TableField("FiterUserId")
    private String FiterUserId;

    @TableField("CompanyPort")
    private Integer CompanyPort;

    @TableField("IsEncrypt")
    private Boolean IsEncrypt;

    @TableField("GovIP")
    private String GovIP;

    @TableField("LoginPwd")
    private String LoginPwd;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Desp")
    private String Desp;


    @Override
    protected Serializable pkVal() {
        return this.GovId;
    }

}
