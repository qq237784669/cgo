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
@TableName("biz_RegionParam")
public class BizRegionparam extends Model<BizRegionparam> {

    private static final long serialVersionUID=1L;

    @TableField("IsDel")
    private Boolean IsDel;

    @TableField("RegionId")
    private Integer RegionId;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableField("RegionParamName")
    private String RegionParamName;

    @TableField("OutRegionDir")
    private Integer OutRegionDir;

    @TableField("JudgeAfterPlanTime")
    private LocalDateTime JudgeAfterPlanTime;

    @TableField("IsSet")
    private Boolean IsSet;

    @TableField("RegionCategory")
    private Integer RegionCategory;

    @TableField("RegionProperty")
    private Long RegionProperty;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("TimeProperty")
    private Long TimeProperty;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "RegionParamId", type = IdType.AUTO)
    private Integer RegionParamId;

    @TableField("InRegionDir")
    private Integer InRegionDir;

    @TableField("OrgId")
    private Integer OrgId;


    @Override
    protected Serializable pkVal() {
        return this.RegionParamId;
    }

}
