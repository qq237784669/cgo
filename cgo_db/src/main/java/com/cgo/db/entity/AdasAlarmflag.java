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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("adas_AlarmFlag")
public class AdasAlarmflag extends Model<AdasAlarmflag> {

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
     * 报警类型(1: ADAS 2: DSM)
     */
    @TableField("AlarmType")
    private Integer AlarmType;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("AlarmOrder")
    private Integer AlarmOrder;

    @TableField("AlarmSort")
    private Integer AlarmSort;


    @Override
    protected Serializable pkVal() {
        return this.AlarmFlag;
    }

}
