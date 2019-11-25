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
@TableName("biz_PlatRegionBroadcastConfig")
public class BizPlatregionbroadcastconfig extends Model<BizPlatregionbroadcastconfig> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ExitRegionMsg")
    private String ExitRegionMsg;

    @TableField("EnterRegionMsg")
    private String EnterRegionMsg;

    @TableField("Interval")
    private Integer Interval;

    @TableField("Times")
    private Integer Times;

    @TableField("RegionParamId")
    private Integer RegionParamId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
