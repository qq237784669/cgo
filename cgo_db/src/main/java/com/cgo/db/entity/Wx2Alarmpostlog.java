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
@TableName("Wx2_AlarmPostLog")
public class Wx2Alarmpostlog extends Model<Wx2Alarmpostlog> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableId("AlarmId")
    private String AlarmId;

    @TableField("IDs")
    private String IDs;

    @TableField("PlatformUrl")
    private String PlatformUrl;


    @Override
    protected Serializable pkVal() {
        return this.AlarmId;
    }

}
