package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 终端指令日志表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_TerminalLog")
public class BizTerminallog extends Model<BizTerminallog> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableField("Id")
    private Integer Id;

    /**
     * 用户账号
     */
    @TableField("UserId")
    private String UserId;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 操作时间
     */
    @TableField("OptTime")
    private LocalDateTime OptTime;

    /**
     * 命令来源Id
     */
    @TableField("WorkId")
    private Integer WorkId;

    /**
     * 命令流水号
     */
    @TableField("OrderId")
    private Integer OrderId;

    /**
     * 命令代码
     */
    @TableField("CmdCode")
    private Long CmdCode;

    /**
     * 命令结果
     */
    @TableField("CmdResult")
    private Integer CmdResult;

    /**
     * 通讯方式
     */
    @TableField("CommFlag")
    private Integer CommFlag;

    /**
     * 命令方向
   1-下行; 2-上行
     */
    @TableField("CmdDirection")
    private Integer CmdDirection;

    /**
     * 命令内容
     */
    @TableField("CmdContent")
    private String CmdContent;

    /**
     * 分区标识
     */
    @TableField("PartFlag")
    private Integer PartFlag;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("AlarmFlag")
    private Long AlarmFlag;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
