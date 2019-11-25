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
@TableName("mon_VehicleIllegalAssessInfo")
public class MonVehicleillegalassessinfo extends Model<MonVehicleillegalassessinfo> {

    private static final long serialVersionUID=1L;

    @TableField("OutageVehicles")
    private String OutageVehicles;

    @TableField("NoPhoto")
    private String NoPhoto;

    @TableField("OffRoute")
    private String OffRoute;

    @TableField("ShotTwist")
    private String ShotTwist;

    @TableField("CompanyID")
    private Integer CompanyID;

    @TableField("NoLocateData")
    private String NoLocateData;

    @TableField("Repair")
    private String Repair;

    @TableField("Overcrowding")
    private String Overcrowding;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Online")
    private String Online;

    @TableField("ShotBlock")
    private String ShotBlock;

    @TableField("Time")
    private LocalDateTime Time;

    @TableField("LocusAberrant")
    private String LocusAberrant;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
