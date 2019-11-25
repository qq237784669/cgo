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
@TableName("rpt_DelOrg")
public class RptDelorg extends Model<RptDelorg> {

    private static final long serialVersionUID=1L;

    @TableId("OrgId")
    private Integer OrgId;

    @TableField("DelTime")
    private LocalDateTime DelTime;

    @TableField("SearchCode")
    private String SearchCode;

    @TableField("OrgName")
    private String OrgName;

    @TableField("ParentId")
    private Integer ParentId;

    @TableField("DelBy")
    private String DelBy;


    @Override
    protected Serializable pkVal() {
        return this.OrgId;
    }

}
