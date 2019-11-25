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
@TableName("biz_CarInfoChangeLog")
public class BizCarinfochangelog extends Model<BizCarinfochangelog> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("OldSVREndTime")
    private LocalDateTime OldSVREndTime;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("NewSimNum")
    private String NewSimNum;

    @TableField("NewTerminalTypeId")
    private Integer NewTerminalTypeId;

    @TableField("OldSimNum")
    private String OldSimNum;

    @TableField("OldOrgId")
    private Integer OldOrgId;

    @TableField("NewPlateNum")
    private String NewPlateNum;

    @TableField("Createby")
    private String Createby;

    @TableField("OldPlateNum")
    private String OldPlateNum;

    @TableField("OldTerminalTypeId")
    private Integer OldTerminalTypeId;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("NewColorCode")
    private Integer NewColorCode;

    @TableField("NewSVRStartTime")
    private LocalDateTime NewSVRStartTime;

    @TableField("OldColorCode")
    private Integer OldColorCode;

    @TableField("OldSVRStartTime")
    private LocalDateTime OldSVRStartTime;

    @TableField("NewOrgId")
    private Integer NewOrgId;

    @TableField("NewSVREndTime")
    private LocalDateTime NewSVREndTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
