package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("rep_InstallOrRepairLog")
public class RepInstallorrepairlog extends Model<RepInstallorrepairlog> {

    private static final long serialVersionUID=1L;

    /**
     * 申请单号
     */
    @TableId("ApplyNum")
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
     * 审核标志（0：未审核 1：已审核）
     */
    @TableField("CheckState")
    private Integer CheckState;

    /**
     * 任务状态（0：申请待审核1：申请审核未通过2：已安排3：已完成4：任务取消5：任务过期）
     */
    @TableField("ApplyState")
    private Integer ApplyState;

    /**
     * 所属组织（作为装车完成审核时的参考分组）
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * 终端类型
     */
    @TableField("TerminalTypeId")
    private Integer TerminalTypeId;

    /**
     * 摄像头（1：1路，2：2路，4：3路，8：4路依次类推，总共8路）
     */
    @TableField("CameraNum")
    private Integer CameraNum;

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
     * 车辆型号
     */
    @TableField("BrandModel")
    private String BrandModel;

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
     * 新装/维修内容
     */
    @TableField("Content")
    private String Content;

    /**
     * 新装/维修地点
     */
    @TableField("Place")
    private String Place;

    /**
     * 新装/维修时间
     */
    @TableField("WorkTime")
    private LocalDateTime WorkTime;

    /**
     * 业务类型(0：新装，1：维修)
     */
    @TableField("WorkType")
    private Integer WorkType;

    /**
     * 车辆停留时间(单位：分钟)
     */
    @TableField("StopTime")
    private Integer StopTime;

    /**
     * 司机姓名
     */
    @TableField("DriverName")
    private String DriverName;

    /**
     * 司机电话
     */
    @TableField("DriverTel")
    private String DriverTel;

    /**
     * 申请时间
     */
    @TableField("ApplyTime")
    private LocalDateTime ApplyTime;

    /**
     * 申请人
     */
    @TableField("ApplyUser")
    private String ApplyUser;

    /**
     * 审核时间
     */
    @TableField("CheckTime")
    private LocalDateTime CheckTime;

    /**
     * 审核人
     */
    @TableField("CheckUser")
    private String CheckUser;

    /**
     * 安装人
     */
    @TableField("InstallerId")
    private String InstallerId;

    /**
     * 安装开始时间
     */
    @TableField("InsBeginTime")
    private LocalDateTime InsBeginTime;

    /**
     * 安装结束时间
     */
    @TableField("InsEndTime")
    private LocalDateTime InsEndTime;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("DispatchOfficer")
    private String DispatchOfficer;

    @TableField("DispatchTime")
    private LocalDateTime DispatchTime;


    @Override
    protected Serializable pkVal() {
        return this.ApplyNum;
    }

}
