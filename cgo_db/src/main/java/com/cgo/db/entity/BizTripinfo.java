package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_TripInfo")
public class BizTripinfo extends Model<BizTripinfo> {

    private static final long serialVersionUID=1L;

    @TableField("StartRegionId")
    private Integer StartRegionId;

    @TableField("ViaLandRegionId1")
    private Integer ViaLandRegionId1;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("ViaRegionIds")
    private String ViaRegionIds;

    @TableId(value = "TripId", type = IdType.AUTO)
    private Integer TripId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("EndRegionId")
    private Integer EndRegionId;

    @TableField("TripName")
    private String TripName;

    @TableField("ViaLandRegionId2")
    private Integer ViaLandRegionId2;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("TripGroupId")
    private Integer TripGroupId;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.TripId;
    }

}
