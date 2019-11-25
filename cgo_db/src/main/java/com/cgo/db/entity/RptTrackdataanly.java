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
@TableName("rpt_TrackDataAnly")
public class RptTrackdataanly extends Model<RptTrackdataanly> {

    private static final long serialVersionUID=1L;

    /**
     * 轨迹漂移次数
     */
    @TableField("TrackDrift")
    private Integer TrackDrift;

    /**
     * 轨迹不完整次数
     */
    @TableField("TrackIncomplete")
    private Integer TrackIncomplete;

    /**
     * 经度不合格条数
     */
    @TableField("UnqualifiedLongitude")
    private Integer UnqualifiedLongitude;

    /**
     * 纬度不合格条数
     */
    @TableField("UnqualifiedLatitude")
    private Integer UnqualifiedLatitude;

    /**
     * 速度不合格条数
     */
    @TableField("UnqualifiedSpeed")
    private Integer UnqualifiedSpeed;

    /**
     * 时间不合格条数
     */
    @TableField("UnqualifiedGpsTime")
    private Integer UnqualifiedGpsTime;

    /**
     * 轨迹总数
     */
    @TableField("TrackTotal")
    private Integer TrackTotal;

    /**
     * 轨迹不合格数(不同企业判断不合格的依据不同)
     */
    @TableField("UnqualifiedDataCount")
    private Integer UnqualifiedDataCount;

    /**
     * 未定位轨迹数
     */
    @TableField("NoLocation")
    private Integer NoLocation;

    /**
     * 轨迹间距大于30s轨迹数
     */
    @TableField("TrackDistanceMore30Sec")
    private Integer TrackDistanceMore30Sec;

    /**
     * 方向不合格数
     */
    @TableField("Direction")
    private Integer Direction;

    @TableField("ValidEndSpeed")
    private Double ValidEndSpeed;

    @TableField("OperateStatuFlag")
    private Integer OperateStatuFlag;

    @TableField("Id")
    private Integer Id;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("EndStateFlag")
    private Long EndStateFlag;

    @TableField("BeginStateFlag")
    private Long BeginStateFlag;

    @TableField("ValidEndLongitude")
    private Double ValidEndLongitude;

    @TableField("ValidEndLatitude")
    private Double ValidEndLatitude;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("ValidBeginLatitude")
    private Double ValidBeginLatitude;

    @TableField("ValidEndStateFlag")
    private Long ValidEndStateFlag;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("ValidBeginStateFlag")
    private Long ValidBeginStateFlag;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("ValidBeginGpsTime")
    private LocalDateTime ValidBeginGpsTime;

    @TableField("ValidEndGpsTime")
    private LocalDateTime ValidEndGpsTime;

    @TableField("ValidEndMileage")
    private Double ValidEndMileage;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("ValidBeginMileage")
    private Double ValidBeginMileage;

    @TableField("Altitude")
    private Integer Altitude;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("ValidBeginSpeed")
    private Double ValidBeginSpeed;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("ValidBeginLongitude")
    private Double ValidBeginLongitude;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
