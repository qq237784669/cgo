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
@TableName("sys_PlatformBranchOwnerInfo")
public class SysPlatformbranchownerinfo extends Model<SysPlatformbranchownerinfo> {

    private static final long serialVersionUID=1L;

    @TableField("OwnerId")
    private Integer OwnerId;

    @TableField("Remark")
    private String Remark;

    @TableId("RoadTransportID")
    private String RoadTransportID;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("OperatorId")
    private Integer OperatorId;

    @TableField("CompManager")
    private String CompManager;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Tel")
    private String Tel;


    @Override
    protected Serializable pkVal() {
        return this.RoadTransportID;
    }

}
