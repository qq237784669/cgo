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
@TableName("bas_EquipInfo")
public class BasEquipinfo extends Model<BasEquipinfo> {

    private static final long serialVersionUID=1L;

    @TableField("EquipSelfCode")
    private String EquipSelfCode;

    @TableField("Remark")
    private String Remark;

    @TableField("OutStockTime")
    private LocalDateTime OutStockTime;

    @TableField("EquipId")
    private String EquipId;

    @TableField("StockState")
    private Integer StockState;

    @TableField("RealSimNum")
    private String RealSimNum;

    @TableField("EquipTypeCode")
    private Integer EquipTypeCode;

    @TableField("InStockTime")
    private LocalDateTime InStockTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("EquipState")
    private Integer EquipState;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("CommunicateID")
    private String CommunicateID;

    @TableField("IconCode")
    private String IconCode;

    @TableField("UseState")
    private Integer UseState;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
