package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("rpt_TrackCountHour_bak_190315")
public class RptTrackcounthourBak190315 extends Model<RptTrackcounthourBak190315> {

    private static final long serialVersionUID=1L;

    @TableField("TrackCount")
    private Integer TrackCount;

    @TableField("TrackDay")
    private LocalDateTime TrackDay;

    @TableField("TrackHour")
    private Integer TrackHour;

    @TableField("Id")
    private Integer Id;

    @TableField("SafetyCount")
    private Integer SafetyCount;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("GeoCode")
    private String GeoCode;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
