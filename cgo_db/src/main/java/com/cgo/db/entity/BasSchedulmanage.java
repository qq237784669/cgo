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
@TableName("bas_SchedulManage")
public class BasSchedulmanage extends Model<BasSchedulmanage> {

    private static final long serialVersionUID=1L;

    /**
     * 用户
     */
    @TableField("UserName")
    private String UserName;

    /**
     * 开始时间
     */
    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    /**
     * 结束时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 操作人
     */
    @TableField("CreatedBy")
    private String CreatedBy;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private String CreateTime;

    /**
     * 组织id
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 班次id
     */
    @TableField("ShiftId")
    private Integer ShiftId;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("UserId")
    private String UserId;

    @TableField("ShiftTime")
    private String ShiftTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
