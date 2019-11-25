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
 * 地图标注类别表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("map_POIType")
public class MapPoitype extends Model<MapPoitype> {

    private static final long serialVersionUID=1L;

    /**
     * 标注类别Id
     */
    @TableId(value = "PoiType", type = IdType.AUTO)
    private Integer PoiType;

    /**
     * 标注类别名称
     */
    @TableField("PoiTypeName")
    private String PoiTypeName;

    /**
     * 兴趣点提示内容
     */
    @TableField("PromptText")
    private String PromptText;

    /**
     * 提示范围
     */
    @TableField("PromptRad")
    private Integer PromptRad;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("IsDown")
    private Boolean IsDown;

    @TableField("CreatedBy")
    private String CreatedBy;

    @TableField("Icon")
    private String Icon;


    @Override
    protected Serializable pkVal() {
        return this.PoiType;
    }

}
