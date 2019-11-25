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
@TableName("biz_PlatPathAlarmVehicleConfig_fixtmp")
public class BizPlatpathalarmvehicleconfigFixtmp extends Model<BizPlatpathalarmvehicleconfigFixtmp> {

    private static final long serialVersionUID=1L;

    @TableField("updateTime")
    private LocalDateTime updateTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("PathParamId")
    private Integer PathParamId;

    @TableField("PathId")
    private Integer PathId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
