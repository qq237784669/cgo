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
@TableName("rep_RepairDetailLog")
public class RepRepairdetaillog extends Model<RepRepairdetaillog> {

    private static final long serialVersionUID=1L;

    /**
     * 申请单号
     */
    @TableField("ApplyNum")
    private String ApplyNum;

    /**
     * 车牌号码
     */
    @TableField("PlateNum")
    private String PlateNum;

    /**
     * 车牌颜色
     */
    @TableField("ColorCode")
    private Integer ColorCode;

    /**
     * 车辆IMEI号
     */
    @TableField("IMEINum")
    private String IMEINum;

    /**
     * 通讯卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 操作人（新装/维修时是安装人员，退网时是平台账号）
     */
    @TableField("OperateUser")
    private String OperateUser;

    /**
     * 操作时间
     */
    @TableField("OperateTime")
    private LocalDateTime OperateTime;

    /**
     * 业务类别（0：平台，1：APP）
     */
    @TableField("OperateType")
    private Integer OperateType;

    /**
     * 操作类型
     */
    @TableField("LogTypeId")
    private Integer LogTypeId;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableId(value = "LogId", type = IdType.AUTO)
    private Integer LogId;


    @Override
    protected Serializable pkVal() {
        return this.LogId;
    }

}
