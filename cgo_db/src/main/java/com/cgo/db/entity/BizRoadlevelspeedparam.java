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
@TableName("biz_RoadLevelSpeedParam")
public class BizRoadlevelspeedparam extends Model<BizRoadlevelspeedparam> {

    private static final long serialVersionUID=1L;

    @TableField("IsOpen")
    private Integer IsOpen;

    @TableField("Expy")
    private Integer Expy;

    @TableField("CommonRoad")
    private Integer CommonRoad;

    @TableField("SimNum")
    private String SimNum;

    @TableField("ProvincialRoad")
    private Integer ProvincialRoad;

    @TableField("NationalRoad")
    private Integer NationalRoad;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("CountyRoadFollow")
    private Integer CountyRoadFollow;

    @TableField("MainRoad")
    private Integer MainRoad;

    @TableField("RecNormalSpeed")
    private Integer RecNormalSpeed;

    @TableField("DurationTime")
    private Integer DurationTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
