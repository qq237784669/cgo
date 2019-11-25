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
@TableName("rpt_everyDayInfo")
public class RptEverydayinfo extends Model<RptEverydayinfo> {

    private static final long serialVersionUID=1L;

    @TableField("everyDate")
    private LocalDateTime everyDate;

    @TableField("Remark")
    private String Remark;

    private String pathway;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("startPlace")
    private String startPlace;

    @TableField("bookId")
    private Integer bookId;

    private String destination;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
