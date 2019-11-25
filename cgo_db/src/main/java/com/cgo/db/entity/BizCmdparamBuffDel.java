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
 * 车辆指令参数_缓存表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_CmdParam_Buff_del")
public class BizCmdparamBuffDel extends Model<BizCmdparamBuffDel> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

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
     * 参数代码
     */
    @TableField("ParamCode")
    private Integer ParamCode;

    /**
     * 参数内容
     */
    @TableField("ParamContent")
    private String ParamContent;

    /**
     * 发送时间
     */
    @TableField("SendTime")
    private LocalDateTime SendTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
