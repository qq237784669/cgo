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
@TableName("biz_VehicleRealTrip")
public class BizVehiclerealtrip extends Model<BizVehiclerealtrip> {

    private static final long serialVersionUID=1L;

    @TableField("UnloadedLat")
    private Double UnloadedLat;

    @TableField("EndLat")
    private Double EndLat;

    @TableField("SimNum")
    private String SimNum;

    @TableField("BeginLon")
    private Double BeginLon;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("TripEndTime")
    private LocalDateTime TripEndTime;

    @TableField("EndLon")
    private Double EndLon;

    @TableField("TripBeginTime")
    private LocalDateTime TripBeginTime;

    @TableField("UnLoadedLon")
    private Double UnLoadedLon;

    @TableField("UnloadedEnd")
    private LocalDateTime UnloadedEnd;

    @TableField("IsAlarm")
    private Boolean IsAlarm;

    @TableField("UnloadedBegin")
    private LocalDateTime UnloadedBegin;

    @TableField("BeginLat")
    private Double BeginLat;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
