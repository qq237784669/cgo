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
@TableName("biz_CQYGAssessDetail")
public class BizCqygassessdetail extends Model<BizCqygassessdetail> {

    private static final long serialVersionUID=1L;

    @TableField("vehicleId")
    private Integer vehicleId;

    @TableField("handleAttachment")
    private String handleAttachment;

    @TableField("shiftTimes")
    private Integer shiftTimes;

    @TableField("handleDate")
    private LocalDateTime handleDate;

    @TableField("plateColorCode")
    private String plateColorCode;

    @TableField("userID")
    private String userID;

    @TableField("assessBatch")
    private String assessBatch;

    @TableField("handleDesc")
    private String handleDesc;

    @TableField("onlineTime")
    private Integer onlineTime;

    @TableField("ownerName")
    private String ownerName;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("isHandle")
    private Integer isHandle;

    @TableField("vehicleNo")
    private String vehicleNo;

    @TableField("orbitRate")
    private Double orbitRate;

    @TableField("dataRate")
    private Double dataRate;

    @TableField("failReason")
    private String failReason;

    @TableField("ownerId")
    private Integer ownerId;

    private LocalDateTime updatetime;

    @TableField("isFail")
    private Integer isFail;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
