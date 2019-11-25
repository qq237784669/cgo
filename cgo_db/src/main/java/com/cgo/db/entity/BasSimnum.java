package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("bas_SimNum")
public class BasSimnum extends Model<BasSimnum> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("AgentName")
    private String AgentName;

    @TableId("RealSimNum")
    private String RealSimNum;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("Remark")
    private String Remark;

    @TableField("HomeCity")
    private String HomeCity;

    @TableField("IMEI")
    private String imei;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;


    @Override
    protected Serializable pkVal() {
        return this.RealSimNum;
    }

}
