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
@TableName("biz_809ReceCmd")
public class Biz809rececmd extends Model<Biz809rececmd> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("InsTime")
    private LocalDateTime InsTime;

    @TableField("EquipmentId")
    private String EquipmentId;

    @TableField("AccStatus")
    private Integer AccStatus;

    private LocalDateTime recetime;

    @TableField("PropertyData")
    private String PropertyData;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
