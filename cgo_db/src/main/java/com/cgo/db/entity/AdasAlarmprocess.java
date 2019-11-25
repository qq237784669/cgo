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
@TableName("adas_AlarmProcess")
public class AdasAlarmprocess extends Model<AdasAlarmprocess> {

    private static final long serialVersionUID=1L;

    /**
     * 通讯SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 报警编号
     */
    @TableField("AlarmId")
    private String AlarmId;

    /**
     * 处理人
     */
    @TableField("UserId")
    private String UserId;

    /**
     * 流水号
     */
    @TableField("OrderId")
    private Integer OrderId;

    /**
     * 处理时间
     */
    @TableField("ProcessTime")
    private LocalDateTime ProcessTime;

    /**
     * 处理方式
     */
    @TableField("ProcessMode")
    private String ProcessMode;

    /**
     * 处理结果(0:成功，1:失败)
     */
    @TableField("ProcessResult")
    private Integer ProcessResult;

    @TableField("SessionId")
    private String SessionId;

    @TableField("Remark")
    private String Remark;

    @TableField("AlarmFlag")
    private Long AlarmFlag;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("AlarmType")
    private Integer AlarmType;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
