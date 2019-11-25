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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_DriverLogDetailed")
public class BizDriverlogdetailed extends Model<BizDriverlogdetailed> {

    private static final long serialVersionUID=1L;

    @TableField("ValidDate")
    private String ValidDate;

    @TableField("DriverId")
    private String DriverId;

    @TableField("State")
    private Integer State;

    @TableField("WorkLicenseId")
    private String WorkLicenseId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("DriverName")
    private String DriverName;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("UpDataTime")
    private LocalDateTime UpDataTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("OrgName")
    private String OrgName;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
