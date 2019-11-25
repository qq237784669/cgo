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
 * 报警处理记录表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_AlarmProcess")
public class BizAlarmprocess extends Model<BizAlarmprocess> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 用户账号
     */
    @TableField("UserId")
    private String UserId;

    /**
     * 工作站Id
     */
    @TableField("WorkId")
    private Integer WorkId;

    /**
     * 命令流水号
     */
    @TableField("OrderId")
    private Integer OrderId;

    /**
     * 终端报警时间
     */
    @TableField("GpsTime")
    private LocalDateTime GpsTime;

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
     * 处理结果 -1 正在处理; 0 处理成功; 1 下发成功; 2 下发失败; 3 应答失败
     */
    @TableField("ProcessResult")
    private Integer ProcessResult;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("FilePath")
    private String FilePath;

    @TableField("AlarmId")
    private String AlarmId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
