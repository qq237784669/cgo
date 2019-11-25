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
@TableName("biz_FZCXPlanTaskManage")
public class BizFzcxplantaskmanage extends Model<BizFzcxplantaskmanage> {

    private static final long serialVersionUID=1L;

    /**
     * 计划时间
     */
    @TableField("PlanTime")
    private LocalDateTime PlanTime;

    /**
     * 序号
     */
    @TableField("OrderNum")
    private Integer OrderNum;

    /**
     * 车牌号码，对应导入的牵引车车牌号
     */
    @TableField("PlateNum")
    private String PlateNum;

    /**
     * 槽车车牌号
     */
    @TableField("ExPlateNum")
    private String ExPlateNum;

    /**
     * 驾驶员
     */
    @TableField("DriverName1")
    private String DriverName1;

    /**
     * 押运员
     */
    @TableField("DriverName2")
    private String DriverName2;

    /**
     * 运输目的地
     */
    @TableField("Destination")
    private String Destination;

    /**
     * 接收站
     */
    @TableField("Station")
    private String Station;

    /**
     * 路线
     */
    @TableField("PathName")
    private String PathName;

    /**
     * 任务状态 0:未完成 1:已完成 2:已取消
     */
    @TableField("TaskState")
    private Integer TaskState;

    /**
     * 是否手动编辑
     */
    @TableField("IsManualEdit")
    private Boolean IsManualEdit;

    /**
     * 是否确认
     */
    @TableField("IsComplete")
    private Boolean IsComplete;

    /**
     * 确认人
     */
    @TableField("UserId")
    private String UserId;

    /**
     * 确认时间
     */
    @TableField("CompleteTime")
    private LocalDateTime CompleteTime;

    /**
     * 到达接收站时间
     */
    @TableField("ArriveStationTime")
    private LocalDateTime ArriveStationTime;

    /**
     * 离开接收站时间
     */
    @TableField("LeaveStationTime")
    private LocalDateTime LeaveStationTime;

    /**
     * 离开基地到目的地时间
     */
    @TableField("LeaveBaseTime")
    private LocalDateTime LeaveBaseTime;

    /**
     * 到达目的地时间
     */
    @TableField("ArriveDestinationTime")
    private LocalDateTime ArriveDestinationTime;

    /**
     * 到达基地时间
     */
    @TableField("ArriveBaseTime")
    private LocalDateTime ArriveBaseTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 创建者
     */
    @TableField("CreateBy")
    private String CreateBy;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("AlarmId")
    private String AlarmId;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("BeginAlarmTime")
    private LocalDateTime BeginAlarmTime;

    @TableField("PathId")
    private Integer PathId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
