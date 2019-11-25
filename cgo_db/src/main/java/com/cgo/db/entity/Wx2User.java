package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("Wx2_User")
public class Wx2User extends Model<Wx2User> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Province")
    private String Province;

    @TableId("OpenId")
    private String OpenId;

    @TableField("Sex")
    private Integer Sex;

    @TableField("SubscribeTime")
    private LocalDateTime SubscribeTime;

    @TableField("NickName")
    private String NickName;

    @TableField("HeadImgUrl")
    private String HeadImgUrl;

    @TableField("Country")
    private String Country;

    @TableField("GroupID")
    private Integer GroupID;

    @TableField("City")
    private String City;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Lang")
    private String Lang;

    @TableField("Privilege")
    private String Privilege;

    @TableField("UnionID")
    private String UnionID;

    @TableField("RemarkName")
    private String RemarkName;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.OpenId;
    }

}
