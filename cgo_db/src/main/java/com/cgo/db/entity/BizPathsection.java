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
 * 路段信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_PathSection")
public class BizPathsection extends Model<BizPathsection> {

    private static final long serialVersionUID=1L;

    /**
     * 路段Id
     */
    @TableId(value = "PathSectionId", type = IdType.AUTO)
    private Integer PathSectionId;

    /**
     * 路段名称
     */
    @TableField("PathSectionName")
    private String PathSectionName;

    /**
     * 路段宽度
     */
    @TableField("SectionWidth")
    private Integer SectionWidth;

    /**
     * 所属路线Id
     */
    @TableField("PathId")
    private Integer PathId;

    /**
     * 路段点
     */
    @TableField("Dots")
    private String Dots;

    @TableField("RoadLevl")
    private Integer RoadLevl;

    @TableField("MaxDuration")
    private Integer MaxDuration;

    @TableField("SpeedingDuration")
    private Integer SpeedingDuration;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("NightHighSpeed")
    private Integer NightHighSpeed;

    @TableField("MinDuration")
    private Integer MinDuration;


    @Override
    protected Serializable pkVal() {
        return this.PathSectionId;
    }

}
