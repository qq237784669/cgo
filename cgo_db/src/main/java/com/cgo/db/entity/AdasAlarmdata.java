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
@TableName("adas_AlarmData")
public class AdasAlarmdata extends Model<AdasAlarmdata> {

    private static final long serialVersionUID=1L;

    /**
     * 报警编号
     */
    @TableId("AlarmId")
    private String AlarmId;

    /**
     * 通讯SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 卫星时间
     */
    @TableField("PosTime")
    private LocalDateTime PosTime;

    /**
     * 报警分类(0x64：ADAS,0x65：DSM )
     */
    @TableField("AlarmType")
    private Integer AlarmType;

    /**
     * 接收时间
     */
    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    /**
     * 报警状态(0:无,1:开始标志,2:结束标志)
     */
    @TableField("AlarmState")
    private Integer AlarmState;

    /**
     * 报警类型
     */
    @TableField("AlarmFlag")
    private Long AlarmFlag;

    /**
     * 报警级别(1:一级,2:二级)
     */
    @TableField("AlarmLevel")
    private Integer AlarmLevel;

    /**
     * 前车车速
     */
    @TableField("FrontSpeed")
    private Double FrontSpeed;

    /**
     * 前车/行人距离
     */
    @TableField("FrontDistance")
    private Double FrontDistance;

    /**
     * 偏离类型(1:左侧偏离,2:右侧偏离)
     */
    @TableField("DriftType")
    private Integer DriftType;

    /**
     * 道路标志识别类型(1：限速标志,2：限高标志,3：限重标志)
     */
    @TableField("RoadSignType")
    private Integer RoadSignType;

    /**
     * 道路标志识别数据
     */
    @TableField("RoadSignData")
    private Integer RoadSignData;

    /**
     * 车速
     */
    @TableField("Speed")
    private Double Speed;

    /**
     * 行驶记录仪速度
     */
    @TableField("AdrSpeed")
    private Double AdrSpeed;

    /**
     * 海拔
     */
    @TableField("Altitude")
    private Integer Altitude;

    /**
     * 里程
     */
    @TableField("Mileage")
    private Double Mileage;

    /**
     * 经度
     */
    @TableField("Longitude")
    private Double Longitude;

    /**
     * 纬度
     */
    @TableField("Latitude")
    private Double Latitude;

    /**
     * 报警时间
     */
    @TableField("AlarmTime")
    private LocalDateTime AlarmTime;

    /**
     * 车辆状态
     */
    @TableField("StateFlag")
    private Long StateFlag;

    /**
     * 报警标识号
     */
    @TableField("AlarmFlagNum")
    private String AlarmFlagNum;

    /**
     * 终端ID
     */
    @TableField("TerminalId")
    private String TerminalId;

    /**
     * 标识时间
     */
    @TableField("FlagTime")
    private LocalDateTime FlagTime;

    /**
     * 标识序号
     */
    @TableField("FlagNumber")
    private Integer FlagNumber;

    /**
     * 附件数量
     */
    @TableField("FileCount")
    private Integer FileCount;

    /**
     * 疲劳程度
     */
    @TableField("TiredLevel")
    private Integer TiredLevel;

    /**
     * 附加信息
     */
    @TableField("AdditionData")
    private String AdditionData;

    /**
     * 驾驶员身份证号
     */
    @TableField("DriverId")
    private String DriverId;

    /**
     * 从业资格证号
     */
    @TableField("QualificationNum")
    private String QualificationNum;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Remark")
    private String Remark;

    @TableField("EndAltitude")
    private Integer EndAltitude;

    @TableField("EndLongitude")
    private Double EndLongitude;

    @TableField("EndAlarmTime")
    private LocalDateTime EndAlarmTime;

    @TableField("EndSpeed")
    private Double EndSpeed;

    @TableField("EndLatitude")
    private Double EndLatitude;


    @Override
    protected Serializable pkVal() {
        return this.AlarmId;
    }

}
