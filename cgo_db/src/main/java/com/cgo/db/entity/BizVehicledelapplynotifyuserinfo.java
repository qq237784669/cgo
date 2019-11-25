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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_VehicleDelApplyNotifyUserInfo")
public class BizVehicledelapplynotifyuserinfo extends Model<BizVehicledelapplynotifyuserinfo> {

    private static final long serialVersionUID=1L;

    @TableField("NotifyUser")
    private String NotifyUser;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("NotifyUserType")
    private Integer NotifyUserType;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("ApplyId")
    private Long ApplyId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
