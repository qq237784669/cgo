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
@TableName("biz_905OperationData")
public class Biz905operationdata extends Model<Biz905operationdata> {

    private static final long serialVersionUID=1L;

    @TableField("AppraiseID")
    private Integer AppraiseID;

    @TableField("EAlarmFlag")
    private Integer EAlarmFlag;

    @TableField("HGpsTime")
    private LocalDateTime HGpsTime;

    @TableField("Price")
    private String Price;

    @TableField("EDirection")
    private Integer EDirection;

    @TableField("HStateFlag")
    private Integer HStateFlag;

    @TableField("Mileage")
    private String Mileage;

    @TableField("ELon")
    private Float ELon;

    @TableField("HSpeed")
    private Float HSpeed;

    @TableField("WorkLicenseId")
    private String WorkLicenseId;

    @TableField("EStateFlag")
    private Integer EStateFlag;

    @TableField("HLat")
    private Float HLat;

    @TableField("ChargeType")
    private Boolean ChargeType;

    @TableField("UpTime")
    private LocalDateTime UpTime;

    @TableField("EGpsTime")
    private LocalDateTime EGpsTime;

    @TableField("HAlarmFlag")
    private Integer HAlarmFlag;

    @TableField("SimNum")
    private String SimNum;

    @TableField("AppriseOptions")
    private Integer AppriseOptions;

    @TableField("MileageN")
    private String MileageN;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("HDirection")
    private Integer HDirection;

    @TableField("CallOrderID")
    private Integer CallOrderID;

    @TableField("ESpeed")
    private Float ESpeed;

    @TableField("HLon")
    private Float HLon;

    @TableField("DownTime")
    private LocalDateTime DownTime;

    @TableField("ELat")
    private Float ELat;

    @TableField("OperationID")
    private Integer OperationID;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
