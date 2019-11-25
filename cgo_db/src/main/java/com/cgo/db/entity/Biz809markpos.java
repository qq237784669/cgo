package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_809MarkPos")
public class Biz809markpos extends Model<Biz809markpos> {

    private static final long serialVersionUID=1L;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("RealUpSimNum")
    private String RealUpSimNum;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("IsSendMedia")
    private Boolean IsSendMedia;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
