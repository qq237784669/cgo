package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("bas_SendReport")
public class BasSendreport extends Model<BasSendreport> {

    private static final long serialVersionUID=1L;

    @TableField("CombineFlag")
    private String CombineFlag;

    @TableField("ReportCode")
    private String ReportCode;

    @TableField("ReportName")
    private String ReportName;

    @TableField("RowIndex")
    private Integer RowIndex;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("spName")
    private String spName;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
