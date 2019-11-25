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
@TableName("biz_PlatOutWayAlarmConfig")
public class BizPlatoutwayalarmconfig extends Model<BizPlatoutwayalarmconfig> {

    private static final long serialVersionUID=1L;

    @TableId("PathId")
    private Integer PathId;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndTime")
    private LocalDateTime EndTime;


    @Override
    protected Serializable pkVal() {
        return this.PathId;
    }

}
