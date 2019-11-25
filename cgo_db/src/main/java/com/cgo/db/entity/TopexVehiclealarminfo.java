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
@TableName("topEx_VehicleAlarmInfo")
public class TopexVehiclealarminfo extends Model<TopexVehiclealarminfo> {

    private static final long serialVersionUID=1L;

    @TableField("EndStateFlag")
    private Long EndStateFlag;

    @TableField("EndMileage")
    private Double EndMileage;

    @TableField("BeginStateFlag")
    private Long BeginStateFlag;

    @TableField("Describe")
    private String Describe;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("MaxSpeed")
    private Double MaxSpeed;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndDirection")
    private Integer EndDirection;

    @TableId(value = "Seq", type = IdType.AUTO)
    private Integer Seq;

    @TableField("BeginAltitude")
    private Integer BeginAltitude;

    @TableField("EndLatitude")
    private Double EndLatitude;

    @TableField("BeginMileage")
    private Double BeginMileage;

    @TableField("EndGpsTime")
    private LocalDateTime EndGpsTime;

    @TableField("Remark")
    private String Remark;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("BeginGpsTime")
    private LocalDateTime BeginGpsTime;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("IsReport")
    private Boolean IsReport;

    @TableField("FalseNum")
    private Integer FalseNum;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("BeginDirection")
    private Integer BeginDirection;

    @TableField("BeginLatitude")
    private Double BeginLatitude;

    @TableField("CheckBy")
    private String CheckBy;

    @TableField("BeginSpeed")
    private Double BeginSpeed;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("IsFalse")
    private Boolean IsFalse;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("BeginLongitude")
    private Double BeginLongitude;

    @TableField("Id")
    private String Id;

    @TableField("NeedSend")
    private Boolean NeedSend;

    @TableField("SN")
    private String sn;


    @Override
    protected Serializable pkVal() {
        return this.Seq;
    }

}
