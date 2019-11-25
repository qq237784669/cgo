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
@TableName("biz_VehicleVideoAlarmConfig")
public class BizVehiclevideoalarmconfig extends Model<BizVehiclevideoalarmconfig> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("TTSMsgContent")
    private String TTSMsgContent;

    @TableField("IsShowAlarmPopupForm")
    private Boolean IsShowAlarmPopupForm;

    @TableField("OwnerRemindSeconds")
    private Integer OwnerRemindSeconds;

    @TableField("BeforeAlarmSeconds")
    private Integer BeforeAlarmSeconds;

    @TableField("CorpChargerRemindSeconds")
    private Integer CorpChargerRemindSeconds;

    @TableField("VideoChannel")
    private Integer VideoChannel;

    @TableField("SMSContent")
    private String SMSContent;

    @TableField("IsEnableAlarmSound")
    private Boolean IsEnableAlarmSound;

    @TableField("CaptureChannel")
    private Integer CaptureChannel;

    @TableField("SMSObject")
    private Integer SMSObject;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("AfterAlarmSeconds")
    private Integer AfterAlarmSeconds;

    @TableField("IsEnableIntercom")
    private Boolean IsEnableIntercom;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("VideoRecordChannel")
    private Integer VideoRecordChannel;

    @TableField("OrgChargerRemindSeconds")
    private Integer OrgChargerRemindSeconds;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
