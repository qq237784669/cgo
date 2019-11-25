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
@TableName("biz_809PlatformReportReq")
public class Biz809platformreportreq extends Model<Biz809platformreportreq> {

    private static final long serialVersionUID=1L;

    @TableField("GovId")
    private String GovId;

    @TableField("ReceiveTime")
    private LocalDateTime ReceiveTime;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("ReportType")
    private Integer ReportType;

    @TableField("InfoContent")
    private String InfoContent;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("ReportId")
    private String ReportId;

    @TableField("OrderId")
    private Long OrderId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UniqueId")
    private String UniqueId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
