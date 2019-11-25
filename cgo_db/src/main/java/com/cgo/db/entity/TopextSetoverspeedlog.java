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
@TableName("TopExt_SetOverSpeedLog")
public class TopextSetoverspeedlog extends Model<TopextSetoverspeedlog> {

    private static final long serialVersionUID=1L;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("Duration")
    private Integer Duration;

    @TableField("RoadLevel")
    private Integer RoadLevel;

    @TableField("Speed")
    private Double Speed;

    @TableField("RecTime")
    private LocalDateTime RecTime;

    @TableField("MaxSpeed")
    private Double MaxSpeed;

    @TableField("Lon")
    private Double Lon;

    @TableField("RoadName")
    private String RoadName;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Lat")
    private Double Lat;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
