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
@TableName("biz_CurrentDivison")
public class BizCurrentdivison extends Model<BizCurrentdivison> {

    private static final long serialVersionUID=1L;

    @TableField("Longitude")
    private Double Longitude;

    @TableField("SimNum")
    private String SimNum;

    @TableField("DivisonCode")
    private Integer DivisonCode;

    @TableField("Latitude")
    private Double Latitude;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Address")
    private String Address;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
