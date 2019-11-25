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
@TableName("biz_AuditSignForBack")
public class BizAuditsignforback extends Model<BizAuditsignforback> {

    private static final long serialVersionUID=1L;

    @TableField("MoIsPass")
    private Boolean MoIsPass;

    @TableField("EnNotPassReason")
    private String EnNotPassReason;

    @TableField("EnIsCorrectImgPos")
    private Boolean EnIsCorrectImgPos;

    @TableField("MoIsLocation")
    private Boolean MoIsLocation;

    @TableField("EnUserId")
    private String EnUserId;

    @TableField("MoUserId")
    private String MoUserId;

    @TableField("MoNotPassReason")
    private String MoNotPassReason;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("MoIsCorrectImgPos")
    private Boolean MoIsCorrectImgPos;

    @TableField("EnIsUploadImg")
    private Boolean EnIsUploadImg;

    @TableField("EnSignTime")
    private LocalDateTime EnSignTime;

    @TableField("EngpsTimeList")
    private String EngpsTimeList;

    @TableField("MogpsTimeList")
    private String MogpsTimeList;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("EnIsPass")
    private Boolean EnIsPass;

    @TableField("MoIsUploadImg")
    private Boolean MoIsUploadImg;

    @TableField("EnIsLocation")
    private Boolean EnIsLocation;

    @TableField("MoSignTime")
    private LocalDateTime MoSignTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
