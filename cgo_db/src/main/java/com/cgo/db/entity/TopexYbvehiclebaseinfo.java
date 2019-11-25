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
@TableName("topEx_YBVehicleBaseInfo")
public class TopexYbvehiclebaseinfo extends Model<TopexYbvehiclebaseinfo> {

    private static final long serialVersionUID=1L;

    private String cphm;

    @TableField("START_LAT")
    private Double startLat;

    private String clzt;

    private String dwid;

    @TableField("START_MILE")
    private Double startMile;

    private String xian;

    private String hylb;

    @TableField("START_TIME")
    private LocalDateTime startTime;

    @TableField("START_LON")
    private Double startLon;

    private String sheng;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private String cpys;

    private String cjh;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    private String shi;

    private String clid;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
