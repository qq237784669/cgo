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
@TableName("biz_IntoRegionVehicle")
public class BizIntoregionvehicle extends Model<BizIntoregionvehicle> {

    private static final long serialVersionUID=1L;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("Direction")
    private Integer Direction;

    @TableField("StateFlag")
    private Long StateFlag;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InsTime")
    private LocalDateTime InsTime;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed")
    private Double Speed;

    @TableField("PlateNum")
    private String PlateNum;

    @TableField("ADRSpeed")
    private Double ADRSpeed;

    @TableField("ExStateFlag")
    private Long ExStateFlag;

    @TableField("RegionName")
    private String RegionName;

    @TableField("StarCount")
    private Integer StarCount;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("RegionId")
    private Integer RegionId;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("Dots")
    private String Dots;

    @TableField("ColorCode")
    private Integer ColorCode;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
