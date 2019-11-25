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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_FZCXRepairOrder")
public class BizFzcxrepairorder extends Model<BizFzcxrepairorder> {

    private static final long serialVersionUID=1L;

    @TableId("eventNo")
    private String eventNo;

    @TableField("checkDescription")
    private String checkDescription;

    @TableField("lnName")
    private String lnName;

    @TableField("checkUser")
    private String checkUser;

    private Integer status;

    @TableField("updateTime")
    private LocalDateTime updateTime;

    @TableField("lnPhone")
    private String lnPhone;

    @TableField("planTime")
    private LocalDateTime planTime;

    @TableField("checkTime")
    private LocalDateTime checkTime;

    @TableField("taskNo")
    private String taskNo;

    @TableField("vehicleId")
    private Integer vehicleId;

    @TableField("ID")
    private Integer id;

    private String description;

    @TableField("checkStatus")
    private Integer checkStatus;


    @Override
    protected Serializable pkVal() {
        return this.eventNo;
    }

}
