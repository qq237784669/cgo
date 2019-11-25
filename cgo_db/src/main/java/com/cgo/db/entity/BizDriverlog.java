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
 * 驾驶员变更记录
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_DriverLog")
public class BizDriverlog extends Model<BizDriverlog> {

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
     * 驾驶员身份证
     */
    @TableField("DriverID")
    private String DriverID;

    /**
     * 开始时间
     */
    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    /**
     * 结束时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 接收时间
     */
    @TableField("InsertTime")
    private LocalDateTime InsertTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
