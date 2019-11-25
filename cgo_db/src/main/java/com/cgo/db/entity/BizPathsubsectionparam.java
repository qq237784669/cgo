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
@TableName("biz_PathSubSectionParam")
public class BizPathsubsectionparam extends Model<BizPathsubsectionparam> {

    private static final long serialVersionUID=1L;

    @TableField("SubSectionId")
    private Integer SubSectionId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("PathParamId")
    private Integer PathParamId;

    @TableField("PathSectionWidth")
    private Integer PathSectionWidth;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
