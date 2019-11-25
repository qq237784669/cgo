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
@TableName("sys_OwnerInfo")
public class SysOwnerinfo extends Model<SysOwnerinfo> {

    private static final long serialVersionUID=1L;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Remark")
    private String Remark;

    @TableId("RoadTransportID")
    private String RoadTransportID;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("OwnerTel")
    private String OwnerTel;

    @TableField("OwnerId")
    private Integer OwnerId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.RoadTransportID;
    }

}
