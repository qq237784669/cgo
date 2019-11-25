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
@TableName("biz_AuditSignOfMonitor")
public class BizAuditsignofmonitor extends Model<BizAuditsignofmonitor> {

    private static final long serialVersionUID=1L;

    @TableField("YGIsLocation")
    private Boolean YGIsLocation;

    @TableField("SimNum")
    private String SimNum;

    @TableField("YGIsPass")
    private Boolean YGIsPass;

    @TableField("SignTime")
    private LocalDateTime SignTime;

    @TableField("gpsTimeList")
    private String gpsTimeList;

    @TableField("YGIsUploadImg")
    private Boolean YGIsUploadImg;

    @TableField("YGIsCorrectImgPos")
    private Boolean YGIsCorrectImgPos;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
