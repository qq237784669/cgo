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
@TableName("biz_AuditSignOfMonitorForStop")
public class BizAuditsignofmonitorforstop extends Model<BizAuditsignofmonitorforstop> {

    private static final long serialVersionUID=1L;

    @TableField("YGCheckState")
    private Integer YGCheckState;

    @TableField("YGCheckUserId")
    private String YGCheckUserId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("YGCheckTime")
    private LocalDateTime YGCheckTime;

    @TableField("VehicleId")
    private Integer VehicleId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
