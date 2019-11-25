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
@TableName("bas_QuickChoice")
public class BasQuickchoice extends Model<BasQuickchoice> {

    private static final long serialVersionUID=1L;

    @TableField("MonthBegin")
    private Integer MonthBegin;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Name")
    private String Name;

    @TableField("Last")
    private Integer Last;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("MonthEnd")
    private Integer MonthEnd;

    @TableField("Order")
    private Integer Order;

    @TableField("Type")
    private Integer Type;

    @TableField("TimeSpan")
    private Integer TimeSpan;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
