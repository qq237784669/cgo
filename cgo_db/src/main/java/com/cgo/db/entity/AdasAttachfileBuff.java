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
@TableName("adas_AttachFile_Buff")
public class AdasAttachfileBuff extends Model<AdasAttachfileBuff> {

    private static final long serialVersionUID=1L;

    /**
     * 报警id 需跟入库报警id一致
     */
    @TableField("AlarmId")
    private String AlarmId;

    /**
     * 通讯号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 文件名称
     */
    @TableField("FileName")
    private String FileName;

    /**
     * 文件类型 与主动安全协议中文件类型一致 0:图片 1:音频 2:视频 3:文本 4:其他
     */
    @TableField("FileType")
    private Integer FileType;

    /**
     * 文件来源 64:adas 65:dms -1:未知
     */
    @TableField("FileSource")
    private Integer FileSource;

    /**
     * 大小 未知为-1
     */
    @TableField("Size")
    private Integer Size;

    /**
     * 报警类型 对应平台的报警标识
     */
    @TableField("AlarmFlag")
    private Long AlarmFlag;

    /**
     * 报警类型 与主动安全协议中的报警类型保持一致
adas【0x01：前向碰撞报警
0x02：车道偏离报警
0x03：车距过近报警
0x04：行人碰撞报警
0x05：频繁变道报警
0x06：道路标识超限报警
0x07：障碍物报警
0x08~0x0F：用户自定义
0x10：道路标志识别事件
0x11：主动抓拍事件
0x12~0x1F：用户自定义】
dsm【0x01:疲劳驾驶报警
0x02:接打电话报警
0x03:抽烟报警
0x04:分神驾驶报警
0x05:驾驶员异常报警
0x10：自动抓拍事件
0x11：驾驶员变更事件
0x12~0x1F：用户自定义】
     */
    @TableField("AlarmType")
    private Integer AlarmType;

    /**
     * 附件获取来源  字符串类型 包含以下几种 1、url
     */
    @TableField("SourceType")
    private String SourceType;

    /**
     * 附件获取来源 当SourceType为url时，则值为对应的完整url地址。
     */
    @TableField("SourceInfo")
    private String SourceInfo;

    /**
     * 下载次数
     */
    @TableField("GetedNum")
    private Integer GetedNum;

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

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
