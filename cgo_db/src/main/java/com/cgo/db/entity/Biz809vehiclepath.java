package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_809VehiclePath")
public class Biz809vehiclepath extends Model<Biz809vehiclepath> {

    private static final long serialVersionUID=1L;

    @TableField("AuditStatus")
    private Integer AuditStatus;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("LIDCardNo")
    private String LIDCardNo;

    @TableField("LIDCardID")
    private Long LIDCardID;

    @TableField("SimNum")
    private String SimNum;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("HasReport")
    private Boolean HasReport;

    @TableField("PathId")
    private Integer PathId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
