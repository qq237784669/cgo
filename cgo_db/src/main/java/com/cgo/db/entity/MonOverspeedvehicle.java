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
@TableName("mon_OverSpeedVehicle")
public class MonOverspeedvehicle extends Model<MonOverspeedvehicle> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("OverSpeedNum")
    private Integer OverSpeedNum;

    @TableField("UploadState")
    private String UploadState;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("PlateNum")
    private String PlateNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
