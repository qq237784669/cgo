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
@TableName("biz_AuditSignForStop")
public class BizAuditsignforstop extends Model<BizAuditsignforstop> {

    private static final long serialVersionUID=1L;

    @TableField("EnCheckState")
    private Integer EnCheckState;

    @TableField("AreaCheckState")
    private Integer AreaCheckState;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("AreaCheckTime")
    private LocalDateTime AreaCheckTime;

    @TableField("Id")
    private Integer Id;

    @TableField("EnCheckTime")
    private LocalDateTime EnCheckTime;

    @TableField("EnCheckUserId")
    private String EnCheckUserId;

    @TableField("AreaCheckUserId")
    private String AreaCheckUserId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
