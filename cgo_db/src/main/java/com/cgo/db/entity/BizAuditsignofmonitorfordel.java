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
@TableName("biz_AuditSignOfMonitorForDel")
public class BizAuditsignofmonitorfordel extends Model<BizAuditsignofmonitorfordel> {

    private static final long serialVersionUID=1L;

    @TableField("YGCheckTime")
    private LocalDateTime YGCheckTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("DeleteLogId")
    private Integer DeleteLogId;

    @TableField("YGCheckState")
    private Integer YGCheckState;

    @TableField("YGCheckUserId")
    private String YGCheckUserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
