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
@TableName("rpt_adas_AlarmCountDay")
public class RptAdasAlarmcountday extends Model<RptAdasAlarmcountday> {

    private static final long serialVersionUID=1L;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("SafetyCount")
    private Integer SafetyCount;

    @TableField("Dots")
    private String Dots;

    @TableField("TrackDay")
    private LocalDateTime TrackDay;

    @TableField("GeoCode")
    private String GeoCode;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("FlagId")
    private String FlagId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
