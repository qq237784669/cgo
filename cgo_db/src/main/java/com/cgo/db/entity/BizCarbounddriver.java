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
@TableName("biz_CarBoundDriver")
public class BizCarbounddriver extends Model<BizCarbounddriver> {

    private static final long serialVersionUID=1L;

    @TableField("CreateBy")
    private String CreateBy;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("Statu")
    private Integer Statu;

    @TableField("Remark")
    private String Remark;

    @TableField("UnboundBy")
    private String UnboundBy;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("UserId")
    private String UserId;

    @TableField("MatchTime")
    private LocalDateTime MatchTime;

    @TableField("UnbundTime")
    private LocalDateTime UnbundTime;

    @TableField("VehicleId")
    private Integer VehicleId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
