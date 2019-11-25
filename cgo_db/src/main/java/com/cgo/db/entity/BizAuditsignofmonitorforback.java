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
@TableName("biz_AuditSignOfMonitorForBack")
public class BizAuditsignofmonitorforback extends Model<BizAuditsignofmonitorforback> {

    private static final long serialVersionUID=1L;

    @TableField("YGIsPass")
    private Boolean YGIsPass;

    @TableField("YGIsUploadImg")
    private Boolean YGIsUploadImg;

    @TableField("YGSignTime")
    private LocalDateTime YGSignTime;

    @TableField("YGgpsTimeList")
    private String YGgpsTimeList;

    @TableField("YGUserId")
    private String YGUserId;

    @TableField("YGNotPassReason")
    private String YGNotPassReason;

    @TableField("YGIsCorrectImgPos")
    private Boolean YGIsCorrectImgPos;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("YGIsLocation")
    private Boolean YGIsLocation;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
