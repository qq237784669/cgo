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
@TableName("rpt_ContainerHistoryPosition")
public class RptContainerhistoryposition extends Model<RptContainerhistoryposition> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("Latitude")
    private Double Latitude;

    @TableField("Province")
    private Integer Province;

    @TableField("City")
    private Integer City;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
