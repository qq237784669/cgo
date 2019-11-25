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
@TableName("biz_809OnlineLog")
public class Biz809onlinelog extends Model<Biz809onlinelog> {

    private static final long serialVersionUID=1L;

    /**
     * 政府编号 GovId 等于 IP:Port
     */
    @TableField("GovId")
    private String GovId;

    /**
     * 通道类型 1：主链路 2：从链路
     */
    @TableField("ChannelType")
    private Integer ChannelType;

    @TableField("Remark")
    private String Remark;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableId("Id")
    private String Id;

    @TableField("UserId")
    private Integer UserId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
