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
@TableName("biz_809PlatformLinkLog")
public class Biz809platformlinklog extends Model<Biz809platformlinklog> {

    private static final long serialVersionUID=1L;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableField("CompanyId")
    private Integer CompanyId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ServerPort")
    private Integer ServerPort;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("LinkType")
    private Integer LinkType;

    @TableField("ServerIP")
    private String ServerIP;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
