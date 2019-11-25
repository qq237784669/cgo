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
@TableName("bas_VehicleStandTimeDetail")
public class BasVehiclestandtimedetail extends Model<BasVehiclestandtimedetail> {

    private static final long serialVersionUID=1L;

    @TableField("Under2")
    private Integer Under2;

    @TableField("B9A12")
    private Integer b9a12;

    @TableField("B5A8")
    private Integer b5a8;

    @TableField("AreaId")
    private Integer AreaId;

    @TableField("More24")
    private Integer More24;

    @TableField("B13A24")
    private Integer b13a24;

    @TableField("B2A4")
    private Integer b2a4;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ImportTime")
    private LocalDateTime ImportTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
