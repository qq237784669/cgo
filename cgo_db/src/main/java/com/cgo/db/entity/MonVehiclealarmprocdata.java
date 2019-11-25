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
@TableName("mon_VehicleAlarmProcData")
public class MonVehiclealarmprocdata extends Model<MonVehiclealarmprocdata> {

    private static final long serialVersionUID=1L;

    @TableField("ColorCode")
    private Integer ColorCode;

    @TableField("UploadState")
    private String UploadState;

    @TableField("ReleaseTime")
    private LocalDateTime ReleaseTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ProResultCode")
    private Integer ProResultCode;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("AlarmTime")
    private LocalDateTime AlarmTime;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("PlateNum")
    private String PlateNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
