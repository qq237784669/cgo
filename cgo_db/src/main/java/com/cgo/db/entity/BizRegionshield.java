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
@TableName("biz_RegionShield")
public class BizRegionshield extends Model<BizRegionshield> {

    private static final long serialVersionUID=1L;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("RegionId")
    private Integer RegionId;

    @TableField("TimeProperty")
    private Integer TimeProperty;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("Remark")
    private String Remark;

    @TableField("Name")
    private String Name;

    @TableField("IsSet")
    private Boolean IsSet;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
