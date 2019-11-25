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
@TableName("rep_AppRepairLog")
public class RepApprepairlog extends Model<RepApprepairlog> {

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
     * IMEI卡号
     */
    @TableField("IMEINum")
    private String IMEINum;

    /**
     * 通讯卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 真实SIM卡号
     */
    @TableField("RealSimNum")
    private String RealSimNum;

    /**
     * 登记类型(1-车辆注册，2-终端维护，4-报废，8-报停，16-转网，32不发班)
     */
    @TableField("LogType")
    private Integer LogType;

    /**
     * 审核标志（0：未审核，1：已审核）
     */
    @TableField("CheckMark")
    private Integer CheckMark;

    /**
     * 审核状态(0：待审核，1：审核通过，2：审核不通过)
     */
    @TableField("CheckState")
    private Integer CheckState;

    /**
     * 处理状态(0：进行中1：已上线，2：已完成 )
     */
    @TableField("ProState")
    private Integer ProState;

    /**
     * 所属组织
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 业户名称
     */
    @TableField("CorpName")
    private String CorpName;

    /**
     * 业户联系人
     */
    @TableField("CorpContact")
    private String CorpContact;

    /**
     * 业户联系电话
     */
    @TableField("CorpTel")
    private String CorpTel;

    /**
     * 车辆类型
     */
    @TableField("VehicleTypeCode")
    private Integer VehicleTypeCode;

    /**
     * 车辆品牌
     */
    @TableField("VehicleModel")
    private String VehicleModel;

    /**
     * 车架号
     */
    @TableField("FrameNo")
    private String FrameNo;

    /**
     * 座位/吨位
     */
    @TableField("Tonnage")
    private Double Tonnage;

    /**
     * 是否初次入网(初次入网、转网接入)
     */
    @TableField("IsFirstNet")
    private String IsFirstNet;

    /**
     * 原平台名称
     */
    @TableField("OldPlatform")
    private String OldPlatform;

    /**
     * 终端类型
     */
    @TableField("TerminalTypeId")
    private Integer TerminalTypeId;

    /**
     * 终端型号
     */
    @TableField("TerminalModel")
    private String TerminalModel;

    /**
     * 终端厂家编号
     */
    @TableField("FactoryNum")
    private String FactoryNum;

    /**
     * 摄像头(1：1路,2：2路,4：3路,8：4路,依次类推)
     */
    @TableField("CameraNum")
    private Integer CameraNum;

    /**
     * 安装方式(0：前装，1：后装)
     */
    @TableField("InstallType")
    private Integer InstallType;

    /**
     * 入网日期/维修日期/退网日期
     */
    @TableField("LogTime")
    private LocalDateTime LogTime;

    /**
     * 申请日期（新装/维修时是申请单对应的时间，退网时是退网的操作时间）
     */
    @TableField("ApplyTime")
    private LocalDateTime ApplyTime;

    /**
     * 完成时间（新装/维修时是完成确认时间，退网时是退网的操作时间）
     */
    @TableField("CompleteTime")
    private LocalDateTime CompleteTime;

    /**
     * 业务类别（1维护终端，2更换SIM卡号，4更换车辆终端）
     */
    @TableField("OperateType")
    private Integer OperateType;

    /**
     * 原SIM卡号
     */
    @TableField("OldSimNum")
    private String OldSimNum;

    /**
     * 原车载终端类型
     */
    @TableField("OldTerminalTypeId")
    private Integer OldTerminalTypeId;

    /**
     * 原终端型号
     */
    @TableField("OldTerminalModel")
    private String OldTerminalModel;

    /**
     * 原终端型号
     */
    @TableField("OldFactoryNum")
    private String OldFactoryNum;

    /**
     * 维护人员(新装/维修时是安装人员，退网时是平台账号)
     */
    @TableField("RepairUser")
    private String RepairUser;

    /**
     * 是否成功修复(0:失败，1：成功)
     */
    @TableField("IsSuccess")
    private Integer IsSuccess;

    /**
     * 修复描述
     */
    @TableField("LogDetail")
    private String LogDetail;

    /**
     * 更换零部件描述
     */
    @TableField("EquipDetail")
    private String EquipDetail;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 操作/审核账号（平台账号）
     */
    @TableField("CheckUser")
    private String CheckUser;

    /**
     * 最后更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("FeedbackQuestion")
    private String FeedbackQuestion;

    @TableField("BrandModel")
    private String BrandModel;

    @TableId(value = "LogId", type = IdType.AUTO)
    private Integer LogId;

    @TableField("ProcessModeCode")
    private Integer ProcessModeCode;

    @TableField("FeedbackContent")
    private String FeedbackContent;

    @TableField("FaultTypeCode")
    private Integer FaultTypeCode;


    @Override
    protected Serializable pkVal() {
        return this.LogId;
    }

}
