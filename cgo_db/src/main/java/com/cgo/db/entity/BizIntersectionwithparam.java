package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_IntersectionWithParam")
public class BizIntersectionwithparam extends Model<BizIntersectionwithparam> {

    private static final long serialVersionUID=1L;

    @TableId("IntersectionId")
    private Integer IntersectionId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Speed")
    private Integer Speed;

    @TableField("PathId")
    private Integer PathId;

    @TableField("InsTime")
    private LocalDateTime InsTime;


    @Override
    protected Serializable pkVal() {
        return this.IntersectionId;
    }

}
