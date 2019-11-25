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
@TableName("rpt_ContainerCurrentPosition")
public class RptContainercurrentposition extends Model<RptContainercurrentposition> {

    private static final long serialVersionUID=1L;

    /**
     * 省份  对应bas_AdministrativeRegion中的DivisonCode    DivisonLevel为1省级
     */
    @TableField("Province")
    private Integer Province;

    /**
     * 城市  对应bas_AdministrativeRegion中的DivisonCode  DivisonLevel为2市级
     */
    @TableField("City")
    private Integer City;

    /**
     * 经度
     */
    @TableField("Longitude")
    private Double Longitude;

    /**
     * 纬度
     */
    @TableField("Latitude")
    private Double Latitude;

    @TableField("SimNum")
    private String SimNum;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
