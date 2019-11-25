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
@TableName("biz_RealSpeedData")
public class BizRealspeeddata extends Model<BizRealspeeddata> {

    private static final long serialVersionUID=1L;

    @TableField("RotationalSpeed")
    private Integer RotationalSpeed;

    @TableField("DiffADRSpeed")
    private Double DiffADRSpeed;

    @TableField("ADRSpeed")
    private Integer ADRSpeed;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("DiffSpeed")
    private Double DiffSpeed;

    @TableField("Lat")
    private Double Lat;

    @TableField("Speed")
    private Integer Speed;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("Lng")
    private Double Lng;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField("Status")
    private Integer Status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
