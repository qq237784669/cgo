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
@TableName("biz_DispatchCarHandle")
public class BizDispatchcarhandle extends Model<BizDispatchcarhandle> {

    private static final long serialVersionUID=1L;

    @TableField("CheckUserId5")
    private String CheckUserId5;

    @TableField("CheckUserId2")
    private String CheckUserId2;

    @TableField("CheckTime1")
    private LocalDateTime CheckTime1;

    @TableField("CheckStatu3")
    private Integer CheckStatu3;

    @TableField("CheckTime4")
    private LocalDateTime CheckTime4;

    @TableField("CheckStatu2")
    private Integer CheckStatu2;

    @TableField("DriverId")
    private String DriverId;

    @TableField("CheckUserId4")
    private String CheckUserId4;

    @TableField("CheckStatu5")
    private Integer CheckStatu5;

    @TableField("CheckUserId1")
    private String CheckUserId1;

    @TableField("CheckStatu4")
    private Integer CheckStatu4;

    @TableField("CheckTime3")
    private LocalDateTime CheckTime3;

    @TableField("CheckStatu1")
    private Integer CheckStatu1;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableId("Id")
    private String Id;

    @TableField("CurrentLevel")
    private Integer CurrentLevel;

    @TableField("CheckTime5")
    private LocalDateTime CheckTime5;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CheckTime2")
    private LocalDateTime CheckTime2;

    @TableField("CheckUserId3")
    private String CheckUserId3;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
