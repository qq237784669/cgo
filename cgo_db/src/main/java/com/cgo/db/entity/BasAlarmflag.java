package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 报警标志位表
AlarmType:1-终端报警;2-平台报警;4-故障
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_AlarmFlag")
public class BasAlarmflag extends Model<BasAlarmflag> {

    private static final long serialVersionUID=1L;

    /**
     * 报警标志
     */
    @TableId("AlarmFlag")
    private Long AlarmFlag;

    /**
     * 报警名称
     */
    @TableField("AlarmName")
    private String AlarmName;

    /**
     * 报警类别按位与（1：终端报警；2：平台报警；4：设备故障）
     */
    @TableField("AlarmType")
    private Integer AlarmType;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("IsStat")
    private Boolean IsStat;

    @TableField("AlarmOrder")
    private Integer AlarmOrder;


    @Override
    protected Serializable pkVal() {
        return this.AlarmFlag;
    }

}
