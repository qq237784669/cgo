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
@TableName("biz_VehicleIllegalLog")
public class BizVehicleillegallog extends Model<BizVehicleillegallog> {

    private static final long serialVersionUID=1L;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("FileName")
    private String FileName;

    @TableId(value = "LogId", type = IdType.AUTO)
    private Integer LogId;

    @TableField("ProMethod")
    private String ProMethod;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("LogTime")
    private LocalDateTime LogTime;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("FileUrl")
    private String FileUrl;

    @TableField("AlarmSituation")
    private String AlarmSituation;

    @TableField("UserId")
    private String UserId;

    @TableField("LogUser")
    private String LogUser;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.LogId;
    }

}
