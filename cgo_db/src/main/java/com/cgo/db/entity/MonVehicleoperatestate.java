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
@TableName("mon_VehicleOperateState")
public class MonVehicleoperatestate extends Model<MonVehicleoperatestate> {

    private static final long serialVersionUID=1L;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("RequestTime")
    private LocalDateTime RequestTime;

    @TableField("StateCode")
    private Integer StateCode;

    @TableField("PlateNum")
    private String PlateNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
