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
 * 系统日志表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_Log")
public class SysLog extends Model<SysLog> {

    private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 日志记录时间
     */
    @TableField("LogTime")
    private LocalDateTime LogTime;

    /**
     * 日志类型
   错误：Error
   信息：Info
   警告：Warning
   调试：Debug
     */
    @TableField("LogType")
    private String LogType;

    /**
     * 日志内容
     */
    @TableField("LogContent")
    private String LogContent;

    /**
     * 系统模块 使用各个模块的简写
   如: AppServer、Report、CommServer等
     */
    @TableField("FromModule")
    private String FromModule;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
