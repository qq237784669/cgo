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
@TableName("rep_EquipInfo")
public class RepEquipinfo extends Model<RepEquipinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 设备ID
     */
    @TableId(value = "EquipId", type = IdType.AUTO)
    private Integer EquipId;

    /**
     * 设备名称
     */
    @TableField("EquipName")
    private String EquipName;

    /**
     * 单价
     */
    @TableField("Price")
    private Double Price;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 创建人
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("OrderCode")
    private Integer OrderCode;


    @Override
    protected Serializable pkVal() {
        return this.EquipId;
    }

}
