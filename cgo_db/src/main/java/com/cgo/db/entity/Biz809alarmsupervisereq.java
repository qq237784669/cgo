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
@TableName("biz_809AlarmSuperviseReq")
public class Biz809alarmsupervisereq extends Model<Biz809alarmsupervisereq> {

    private static final long serialVersionUID=1L;

    @TableField("DataType")
    private Integer DataType;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableField("SupervisorSimNum")
    private String SupervisorSimNum;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SupervisionEndTime")
    private LocalDateTime SupervisionEndTime;

    @TableField("ReceiveTime")
    private LocalDateTime ReceiveTime;

    @TableField("OrderId")
    private Long OrderId;

    @TableField("SupervisionId")
    private Integer SupervisionId;

    @TableField("PlatformId")
    private String PlatformId;

    @TableField("AlarmSrc")
    private Integer AlarmSrc;

    @TableField("Supervisor")
    private String Supervisor;

    @TableField("SupervisorEmail")
    private String SupervisorEmail;

    @TableField("SupervisionLevel")
    private Integer SupervisionLevel;

    @TableField("UniqueId")
    private String UniqueId;

    @TableField("MsgSN")
    private Long MsgSN;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("PlatformAlarmFlag")
    private Long PlatformAlarmFlag;

    @TableField("AlarmTime")
    private LocalDateTime AlarmTime;

    @TableField("GovId")
    private String GovId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
