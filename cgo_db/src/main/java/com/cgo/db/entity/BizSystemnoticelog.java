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
@TableName("biz_SystemNoticeLog")
public class BizSystemnoticelog extends Model<BizSystemnoticelog> {

    private static final long serialVersionUID=1L;

    @TableField("Title")
    private String Title;

    @TableField("AttachmentPath")
    private String AttachmentPath;

    @TableField("NoticeFlag")
    private Integer NoticeFlag;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("Submitter")
    private String Submitter;

    @TableField("NoticeContent")
    private String NoticeContent;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
