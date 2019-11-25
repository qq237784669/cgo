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
@TableName("biz_809SendLocationReq")
public class Biz809sendlocationreq extends Model<Biz809sendlocationreq> {

    private static final long serialVersionUID=1L;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Progress")
    private Double Progress;

    @TableField("GovId")
    private String GovId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Status")
    private Integer Status;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SimNumList")
    private String SimNumList;

    @TableField("ReportType")
    private Integer ReportType;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("EndTime")
    private LocalDateTime EndTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
