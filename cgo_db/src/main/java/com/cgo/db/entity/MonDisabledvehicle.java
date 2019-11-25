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
@TableName("mon_DisabledVehicle")
public class MonDisabledvehicle extends Model<MonDisabledvehicle> {

    private static final long serialVersionUID=1L;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("DisabledTime")
    private LocalDateTime DisabledTime;

    @TableField("DisabledReasonId")
    private Integer DisabledReasonId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UploadState")
    private String UploadState;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("DisabledEndTime")
    private LocalDateTime DisabledEndTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
