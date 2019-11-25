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
@TableName("biz_VehicleDelApplyLog")
public class BizVehicledelapplylog extends Model<BizVehicledelapplylog> {

    private static final long serialVersionUID=1L;

    @TableField("ApplyRemark")
    private String ApplyRemark;

    @TableField("IsElecSigned")
    private Boolean IsElecSigned;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsBeDeled")
    private Boolean IsBeDeled;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("ApplyTime")
    private LocalDateTime ApplyTime;

    @TableField("ApplyUserId")
    private String ApplyUserId;

    @TableField("AttachmentPath")
    private String AttachmentPath;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
