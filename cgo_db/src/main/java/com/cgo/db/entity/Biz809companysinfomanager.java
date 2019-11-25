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
@TableName("biz_809CompanysInfoManager")
public class Biz809companysinfomanager extends Model<Biz809companysinfomanager> {

    private static final long serialVersionUID=1L;

    @TableField("Password")
    private String Password;

    @TableField("PlatformId")
    private String PlatformId;

    @TableField("CompanyIP")
    private String CompanyIP;

    @TableField("CompanyName")
    private String CompanyName;

    @TableField("CompanyPort")
    private Integer CompanyPort;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AccessCode")
    private String AccessCode;

    @TableField("AssociateUser")
    private String AssociateUser;

    @TableField("UserId")
    private String UserId;

    @TableId(value = "CompanyId", type = IdType.AUTO)
    private Integer CompanyId;


    @Override
    protected Serializable pkVal() {
        return this.CompanyId;
    }

}
