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
@TableName("mon_EnterpriseAssessInfo")
public class MonEnterpriseassessinfo extends Model<MonEnterpriseassessinfo> {

    private static final long serialVersionUID=1L;

    @TableField("WorkComRate")
    private String WorkComRate;

    @TableField("ViolationRate")
    private String ViolationRate;

    @TableField("CompanyID")
    private Integer CompanyID;

    @TableField("ActionItemsComRate")
    private String ActionItemsComRate;

    @TableField("InstallRate")
    private String InstallRate;

    @TableField("CallAnswerRate")
    private String CallAnswerRate;

    @TableField("AlarmHandle")
    private String AlarmHandle;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("OnlineRate")
    private String OnlineRate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
