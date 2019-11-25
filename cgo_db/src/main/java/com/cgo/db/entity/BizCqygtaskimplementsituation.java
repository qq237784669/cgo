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
@TableName("biz_CQYGTaskImplementSituation")
public class BizCqygtaskimplementsituation extends Model<BizCqygtaskimplementsituation> {

    private static final long serialVersionUID=1L;

    @TableField("FeedbackContent")
    private String FeedbackContent;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("TaskContent")
    private String TaskContent;

    @TableField("Updatetime")
    private LocalDateTime Updatetime;

    @TableField("StartTime")
    private LocalDateTime StartTime;

    @TableField("TaskTitle")
    private String TaskTitle;

    @TableField("TaskState")
    private Integer TaskState;

    @TableId("TaskSN")
    private String TaskSN;

    @TableField("ReceiveTime")
    private LocalDateTime ReceiveTime;

    @TableField("TaskFile")
    private String TaskFile;

    @TableField("FeedbackFile")
    private String FeedbackFile;


    @Override
    protected Serializable pkVal() {
        return this.TaskSN;
    }

}
