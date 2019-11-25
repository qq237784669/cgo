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
 * 区域(围栏)类别信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_RegionGroup")
public class BizRegiongroup extends Model<BizRegiongroup> {

    private static final long serialVersionUID=1L;

    /**
     * 区域类别Id
     */
    @TableId(value = "RegionGroupId", type = IdType.AUTO)
    private Integer RegionGroupId;

    /**
     * 区域类别名称
     */
    @TableField("RegionGroupName")
    private String RegionGroupName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;


    @Override
    protected Serializable pkVal() {
        return this.RegionGroupId;
    }

}
