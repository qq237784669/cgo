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
@TableName("biz_MobOnLineUser")
public class BizMobonlineuser extends Model<BizMobonlineuser> {

    private static final long serialVersionUID=1L;

    @TableField("MobileOS")
    private Integer MobileOS;

    @TableField("UserId")
    private String UserId;

    @TableField("UserType")
    private String UserType;

    @TableField("BDTokenId")
    private String BDTokenId;

    @TableField("IMEI")
    private String imei;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("BDChannelId")
    private String BDChannelId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
