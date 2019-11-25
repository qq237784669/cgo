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
@TableName("rpt_TrackCountHour")
public class RptTrackcounthour extends Model<RptTrackcounthour> {

    private static final long serialVersionUID=1L;

    @TableField("TrackDay")
    private LocalDateTime TrackDay;

    @TableField("TrackCount")
    private Integer TrackCount;

    @TableField("GeoCode")
    private String GeoCode;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("SafetyCount")
    private Integer SafetyCount;

    @TableField("TrackHour")
    private Integer TrackHour;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
