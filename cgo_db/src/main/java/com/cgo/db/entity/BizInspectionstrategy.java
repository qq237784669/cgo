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
@TableName("biz_InspectionStrategy")
public class BizInspectionstrategy extends Model<BizInspectionstrategy> {

    private static final long serialVersionUID=1L;

    /**
     * 巡检名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 巡检类型
     */
    @TableField("Type")
    private Integer Type;

    /**
     * 巡检间隔
     */
    @TableField("Interval")
    private Integer Interval;

    /**
     * 巡检比例
     */
    @TableField("Proportion")
    private Integer Proportion;

    /**
     * 巡检路线
     */
    @TableField("Path")
    private String Path;

    /**
     * 巡检时间
     */
    @TableField("Time")
    private String Time;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableField("CameraChannel")
    private Integer CameraChannel;

    @TableField("IsCancel")
    private Integer IsCancel;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("CreateUserId")
    private String CreateUserId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
