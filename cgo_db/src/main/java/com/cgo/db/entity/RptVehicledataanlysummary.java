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
@TableName("rpt_VehicleDataAnlySummary")
public class RptVehicledataanlysummary extends Model<RptVehicledataanlysummary> {

    private static final long serialVersionUID=1L;

    /**
     * 超速报警（普通和夜间）
     */
    @TableField("Speeding")
    private Integer Speeding;

    /**
     * 疲劳驾驶
     */
    @TableField("Tired")
    private Integer Tired;

    /**
     * 2-5点禁行
     */
    @TableField("BanDriving")
    private Integer BanDriving;

    /**
     * 超载
     */
    @TableField("OverLoad")
    private Integer OverLoad;

    /**
     * 终端异常
     */
    @TableField("TerminalError")
    private Integer TerminalError;

    /**
     * 数据异常（不在线、漂移、轨迹不合格、轨迹不完整）
     */
    @TableField("DataError")
    private Integer DataError;

    /**
     * 是否在线(0否，1：是)，超过七天未上线
     */
    @TableField("IsOnLine")
    private Integer IsOnLine;

    /**
     * 漂移次数
     */
    @TableField("DriftCount")
    private Integer DriftCount;

    /**
     * 完整轨迹次数
     */
    @TableField("CompleteCount")
    private Integer CompleteCount;

    /**
     * 完整总里程
     */
    @TableField("ComplteMileage")
    private Double ComplteMileage;

    /**
     * 不完整次数
     */
    @TableField("UnCompleteCount")
    private Integer UnCompleteCount;

    /**
     * 不完整里程总数
     */
    @TableField("UnCompleteMileage")
    private Double UnCompleteMileage;

    /**
     * 轨迹总数
     */
    @TableField("TrackTotal")
    private Integer TrackTotal;

    /**
     * 合格轨迹数
     */
    @TableField("QualifiedDataCount")
    private Integer QualifiedDataCount;

    /**
     * 不合格轨迹数
     */
    @TableField("UnqualifiedDataCount")
    private Integer UnqualifiedDataCount;

    /**
     * 不按规定线路行驶和不按站点停靠
     */
    @TableField("OutRoute")
    private Integer OutRoute;

    /**
     * 证照是否过期（0：否，1：是）
     */
    @TableField("IsOverdue")
    private Integer IsOverdue;

    /**
     * 企业道路运输经营许可证是否过期
     */
    @TableField("IsOverdueOfCompany")
    private Integer IsOverdueOfCompany;

    /**
     * 车辆道路运输证是否过期
     */
    @TableField("IsOverdueOfVehicle")
    private Integer IsOverdueOfVehicle;

    /**
     * 驾驶员违规行为（抽烟、打电话等）
     */
    @TableField("DriverIllegal")
    private Integer DriverIllegal;

    /**
     * 车辆违法违规行为（安全锤、灭火器）
     */
    @TableField("VehicleIllegal")
    private Integer VehicleIllegal;

    /**
     * 其他违法违规行为
     */
    @TableField("OtherIllegal")
    private Integer OtherIllegal;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SimNum")
    private String SimNum;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
