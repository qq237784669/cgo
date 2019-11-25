package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_PlatRegionSpeedAlarmConfig")
public class BizPlatregionspeedalarmconfig extends Model<BizPlatregionspeedalarmconfig> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId("RegionId")
    private Integer RegionId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsSet")
    private Integer IsSet;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("RegionParamId")
    private Integer RegionParamId;


    @Override
    protected Serializable pkVal() {
        return this.RegionId;
    }

}
