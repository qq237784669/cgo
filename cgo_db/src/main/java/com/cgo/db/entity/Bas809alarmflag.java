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
@TableName("bas_809AlarmFlag")
public class Bas809alarmflag extends Model<Bas809alarmflag> {

    private static final long serialVersionUID=1L;

    @TableField("808AlarmFlag")
    private Long bas_809A_808AlarmFlag;

    @TableField("Remark")
    private String Remark;

    @TableId("809AlarmFlag")
    private Long bas_809A_809AlarmFlag;

    @TableField("AlarmName")
    private String AlarmName;


    @Override
    protected Serializable pkVal() {
        return this.bas_809A_809AlarmFlag;
    }

}
