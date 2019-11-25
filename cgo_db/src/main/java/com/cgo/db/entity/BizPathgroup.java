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
 * 路线类别信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_PathGroup")
public class BizPathgroup extends Model<BizPathgroup> {

    private static final long serialVersionUID=1L;

    /**
     * 路线类别Id
     */
    @TableId(value = "PathGroupId", type = IdType.AUTO)
    private Integer PathGroupId;

    /**
     * 路线类别名称
     */
    @TableField("PathGroupName")
    private String PathGroupName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.PathGroupId;
    }

}
