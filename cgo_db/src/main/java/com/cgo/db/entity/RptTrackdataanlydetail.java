package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("rpt_TrackDataAnlyDetail")
public class RptTrackdataanlydetail extends Model<RptTrackdataanlydetail> {

    private static final long serialVersionUID=1L;

    /**
     * 0：轨迹漂移，1：轨迹不完整，2：轨迹完整
     */
    @TableField("DataMark")
    private Integer DataMark;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("Mileage")
    private Double Mileage;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("Id")
    private Integer Id;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("BeginLatitude")
    private Double BeginLatitude;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
