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
@TableName("rpt_DelUsingCarMode")
public class RptDelusingcarmode extends Model<RptDelusingcarmode> {

    private static final long serialVersionUID=1L;

    @TableField("IsUse")
    private Boolean IsUse;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("CheckUserId2")
    private String CheckUserId2;

    @TableField("CheckUserId5")
    private String CheckUserId5;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("CheckLevel")
    private Integer CheckLevel;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CheckUserId3")
    private String CheckUserId3;

    @TableId("Id")
    private Integer Id;

    @TableField("IsEvaluate")
    private Boolean IsEvaluate;

    @TableField("ModeName")
    private String ModeName;

    @TableField("CheckUserId4")
    private String CheckUserId4;

    @TableField("CheckUserId1")
    private String CheckUserId1;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
