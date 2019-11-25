package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("bas_Operator")
public class BasOperator extends Model<BasOperator> {

    private static final long serialVersionUID=1L;

    @TableField("AccessCode")
    private String AccessCode;

    @TableField("ConnectCall")
    private String ConnectCall;

    @TableField("AUTHORIZECODE2")
    private String authorizecode2;

    @TableField("ConnectFile")
    private String ConnectFile;

    @TableField("UserId")
    private String UserId;

    @TableField("LeadCall")
    private String LeadCall;

    @TableField("CompanyPort")
    private Integer CompanyPort;

    @TableField("ServiceCall")
    private String ServiceCall;

    @TableField("LoginUser")
    private String LoginUser;

    @TableField("OperatorName")
    private String OperatorName;

    @TableField("AUTHORIZECODE1")
    private String authorizecode1;

    @TableField("Password")
    private String Password;

    @TableId(value = "OperatorId", type = IdType.AUTO)
    private Integer OperatorId;

    @TableField("LeadTel")
    private String LeadTel;

    @TableField("ConnectTel")
    private String ConnectTel;

    private String address;

    @TableField("ConnectName")
    private String ConnectName;

    @TableField("CompanyIP")
    private String CompanyIP;

    @TableField("UploadUser")
    private String UploadUser;

    @TableField("LeadName")
    private String LeadName;


    @Override
    protected Serializable pkVal() {
        return this.OperatorId;
    }

}
