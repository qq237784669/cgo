package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 车辆当前驾驶员表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_CurrentDriver")
public class BizCurrentdriver extends Model<BizCurrentdriver> {

    private static final long serialVersionUID=1L;

    /**
     * SIM卡号
     */
    @TableId("SimNum")
    private String SimNum;

    /**
     * 驾驶员身份证
     */
    @TableField("DriverID")
    private String DriverID;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("DriverTime")
    private LocalDateTime DriverTime;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
