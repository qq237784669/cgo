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
 * 区域(围栏)信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_Region")
public class BizRegion extends Model<BizRegion> {

    private static final long serialVersionUID=1L;

    /**
     * 区域Id
     */
    @TableId(value = "RegionId", type = IdType.AUTO)
    private Integer RegionId;

    /**
     * 区域类别Id
     */
    @TableField("RegionGroupId")
    private Integer RegionGroupId;

    /**
     * 区域名称
     */
    @TableField("RegionName")
    private String RegionName;

    /**
     * 区域标识(1：圆型区域；2：矩形区域；3：多边形区域)
     */
    @TableField("RegionType")
    private Integer RegionType;

    /**
     * 区域点
     */
    @TableField("Dots")
    private String Dots;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("InToDriver")
    private Integer InToDriver;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("RegionProperty")
    private Long RegionProperty;

    @TableField("OutToPlateForm")
    private Integer OutToPlateForm;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("UpdateBy")
    private String UpdateBy;

    @TableField("InToPlateForm")
    private Integer InToPlateForm;

    @TableField("OutToDriver")
    private Integer OutToDriver;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("SpeedingDuration")
    private Integer SpeedingDuration;

    @TableField("AuthFlag")
    private Integer AuthFlag;


    @Override
    protected Serializable pkVal() {
        return this.RegionId;
    }

}
