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
 * 地图标注表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("map_POI")
public class MapPoi extends Model<MapPoi> {

    private static final long serialVersionUID=1L;

    /**
     * 标注Id
     */
    @TableId(value = "PoiId", type = IdType.AUTO)
    private Integer PoiId;

    /**
     * 标注名称
     */
    @TableField("PoiName")
    private String PoiName;

    /**
     * 所属标注类别
     */
    @TableField("PoiType")
    private Integer PoiType;

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

    /**
     * 所属组织Id
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.PoiId;
    }

}
