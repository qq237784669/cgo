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
@TableName("rpt_DelUser")
public class RptDeluser extends Model<RptDeluser> {

    private static final long serialVersionUID=1L;

    @TableField("Tel")
    private String Tel;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("DelTime")
    private LocalDateTime DelTime;

    @TableField("UserName")
    private String UserName;

    @TableId("UserId")
    private String UserId;

    @TableField("DelBy")
    private String DelBy;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
