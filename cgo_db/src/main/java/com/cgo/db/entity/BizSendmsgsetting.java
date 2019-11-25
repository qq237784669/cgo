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
@TableName("biz_SendMsgSetting")
public class BizSendmsgsetting extends Model<BizSendmsgsetting> {

    private static final long serialVersionUID=1L;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("EnableFlag")
    private Boolean EnableFlag;

    @TableField("UpdateUserId")
    private String UpdateUserId;

    @TableField("SendNumber")
    private Integer SendNumber;

    @TableField("ConfigName")
    private String ConfigName;

    @TableField("SimNums")
    private String SimNums;

    @TableField("MsgContent")
    private String MsgContent;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SendInterval")
    private Integer SendInterval;

    @TableField("OperateTypeCodes")
    private String OperateTypeCodes;

    @TableField("strategyFlag")
    private Integer strategyFlag;

    @TableField("SendTime")
    private String SendTime;

    @TableField("StrategyName")
    private Integer StrategyName;

    @TableField("IsIgnoreStopVehicle")
    private Boolean IsIgnoreStopVehicle;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
