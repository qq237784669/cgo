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
@TableName("biz_UsingCarMode")
public class BizUsingcarmode extends Model<BizUsingcarmode> {

    private static final long serialVersionUID=1L;

    @TableField("CheckUserId2")
    private String CheckUserId2;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("CheckUserId5")
    private String CheckUserId5;

    @TableField("CheckLevel")
    private Integer CheckLevel;

    @TableField("CreateBy")
    private String CreateBy;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("IsEvaluate")
    private Boolean IsEvaluate;

    @TableField("CheckUserId3")
    private String CheckUserId3;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CheckUserId4")
    private String CheckUserId4;

    @TableField("ModeName")
    private String ModeName;

    @TableField("CheckUserId1")
    private String CheckUserId1;

    @TableField("IsUse")
    private Boolean IsUse;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
