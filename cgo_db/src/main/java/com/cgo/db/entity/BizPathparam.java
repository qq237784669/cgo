package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_PathParam")
public class BizPathparam extends Model<BizPathparam> {

    private static final long serialVersionUID=1L;

    @TableField("PathId")
    private Integer PathId;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("PathProperty")
    private Long PathProperty;

    @TableField("PathCategory")
    private Integer PathCategory;

    @TableField("PathParamId")
    private Integer PathParamId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("TimeProperty")
    private Long TimeProperty;

    @TableField("PathParamName")
    private String PathParamName;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableField("IsSet")
    private Boolean IsSet;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
