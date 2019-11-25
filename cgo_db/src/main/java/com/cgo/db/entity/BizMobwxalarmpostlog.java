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
@TableName("biz_MobWxAlarmPostLog")
public class BizMobwxalarmpostlog extends Model<BizMobwxalarmpostlog> {

    private static final long serialVersionUID=1L;

    @TableField("IDs")
    private String IDs;

    @TableId("AlarmId")
    private String AlarmId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("PlatformUrl")
    private String PlatformUrl;


    @Override
    protected Serializable pkVal() {
        return this.AlarmId;
    }

}
