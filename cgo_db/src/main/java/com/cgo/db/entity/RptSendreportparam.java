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
@TableName("rpt_SendReportParam")
public class RptSendreportparam extends Model<RptSendreportparam> {

    private static final long serialVersionUID=1L;

    @TableId("ContactId")
    private Integer ContactId;

    @TableField("ColumnTexts")
    private String ColumnTexts;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("ReportCode")
    private String ReportCode;

    @TableField("ColumnFields")
    private String ColumnFields;


    @Override
    protected Serializable pkVal() {
        return this.ContactId;
    }

}
