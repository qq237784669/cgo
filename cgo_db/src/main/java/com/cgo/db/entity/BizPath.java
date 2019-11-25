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
 * 路线信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_Path")
public class BizPath extends Model<BizPath> {

    private static final long serialVersionUID=1L;

    /**
     * 路线Id
     */
    @TableId(value = "PathId", type = IdType.AUTO)
    private Integer PathId;

    /**
     * 路线名称
     */
    @TableField("PathName")
    private String PathName;

    /**
     * 所属路线类别
     */
    @TableField("PathGroupId")
    private Integer PathGroupId;

    /**
     * 路线点
     */
    @TableField("Dots")
    private String Dots;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AuthFlag")
    private Integer AuthFlag;

    @TableField("OutToDriver")
    private Integer OutToDriver;

    @TableField("OutToPlateForm")
    private Integer OutToPlateForm;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("InToDriver")
    private Integer InToDriver;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("InToPlateForm")
    private Integer InToPlateForm;

    @TableField("UpdateBy")
    private String UpdateBy;


    @Override
    protected Serializable pkVal() {
        return this.PathId;
    }

}
