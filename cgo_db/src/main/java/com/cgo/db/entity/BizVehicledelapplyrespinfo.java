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
@TableName("biz_VehicleDelApplyRespInfo")
public class BizVehicledelapplyrespinfo extends Model<BizVehicledelapplyrespinfo> {

    private static final long serialVersionUID=1L;

    @TableField("RespTime")
    private LocalDateTime RespTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("ApplyId")
    private Long ApplyId;

    @TableField("RespUserId")
    private String RespUserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
