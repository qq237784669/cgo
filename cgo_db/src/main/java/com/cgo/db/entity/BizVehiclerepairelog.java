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
@TableName("biz_VehicleRepaireLog")
public class BizVehiclerepairelog extends Model<BizVehiclerepairelog> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("State")
    private Integer State;

    @TableField("CreateBy")
    private String CreateBy;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("Remark")
    private String Remark;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("UpdateBy")
    private String UpdateBy;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
