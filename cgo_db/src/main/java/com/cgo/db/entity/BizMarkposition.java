package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("biz_MarkPosition")
public class BizMarkposition extends Model<BizMarkposition> {

    private static final long serialVersionUID=1L;

    /**
     * 1:补报数据 2...
     */
    @TableField("Mark")
    private Long Mark;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("SimNum")
    private String SimNum;

    @TableId("Id")
    private String Id;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
