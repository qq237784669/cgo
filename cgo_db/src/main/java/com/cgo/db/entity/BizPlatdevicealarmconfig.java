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
@TableName("biz_PlatDeviceAlarmConfig")
public class BizPlatdevicealarmconfig extends Model<BizPlatdevicealarmconfig> {

    private static final long serialVersionUID=1L;

    @TableField("MinValue")
    private Double MinValue;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("DeviceId")
    private Integer DeviceId;

    @TableField("MaxValue")
    private Double MaxValue;

    @TableField("SimNum")
    private String SimNum;

    @TableField("DeviceType")
    private Integer DeviceType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
