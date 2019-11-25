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
@TableName("adas_EquipType")
public class AdasEquiptype extends Model<AdasEquiptype> {

    private static final long serialVersionUID=1L;

    /**
     * 设备名称
     */
    @TableField("EquipName")
    private String EquipName;

    /**
     * 设备类型(ADAS/DSM)
     */
    @TableField("EquipType")
    private String EquipType;

    /**
     * 厂牌型号
     */
    @TableField("FacCardModel")
    private String FacCardModel;

    /**
     * 生产厂家
     */
    @TableField("FactoryName")
    private String FactoryName;

    /**
     * 厂家编号
     */
    @TableField("FactoryNum")
    private String FactoryNum;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 创建人
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("IsFaceRec")
    private Boolean IsFaceRec;

    @TableId(value = "EquipId", type = IdType.AUTO)
    private Integer EquipId;


    @Override
    protected Serializable pkVal() {
        return this.EquipId;
    }

}
