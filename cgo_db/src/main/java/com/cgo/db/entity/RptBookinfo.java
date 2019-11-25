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
@TableName("rpt_bookInfo")
public class RptBookinfo extends Model<RptBookinfo> {

    private static final long serialVersionUID=1L;

    private String destination;

    @TableField("endDate")
    private LocalDateTime endDate;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("orderNumber")
    private String orderNumber;

    @TableField("Company")
    private String Company;

    @TableField("plateColor")
    private String plateColor;

    @TableField("startDate")
    private LocalDateTime startDate;

    @TableField("licensePlate")
    private String licensePlate;

    @TableField("startingPlace")
    private String startingPlace;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("driverAssistant")
    private String driverAssistant;

    @TableField("peopleCount")
    private Integer peopleCount;

    @TableField("Remark")
    private String Remark;

    private String driver;

    private String pathway;

    private String type;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
