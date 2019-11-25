package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_Intersection")
public class BizIntersection extends Model<BizIntersection> {

    private static final long serialVersionUID=1L;

    @TableField("Name")
    private String Name;

    @TableField("Speed2")
    private Double Speed2;

    @TableField("Speed1")
    private Double Speed1;

    @TableField("Lat2")
    private Double Lat2;

    @TableField("Lat1")
    private Double Lat1;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("Direction")
    private Integer Direction;

    @TableField("Lon2")
    private Double Lon2;

    @TableField("Lon1")
    private Double Lon1;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
