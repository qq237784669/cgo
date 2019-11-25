package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_PlatPathSpeedAlarmConfig")
public class BizPlatpathspeedalarmconfig extends Model<BizPlatpathspeedalarmconfig> {

    private static final long serialVersionUID=1L;

    @TableId("PathId")
    private Integer PathId;

    @TableField("PathSectionWidth")
    private Integer PathSectionWidth;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("PathSectionId")
    private Integer PathSectionId;

    @TableField("LimitSpeed")
    private Integer LimitSpeed;

    @TableField("PathParamId")
    private Integer PathParamId;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.PathId;
    }

}
