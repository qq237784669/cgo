package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("bas_SystemNoticeFlag")
public class BasSystemnoticeflag extends Model<BasSystemnoticeflag> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableId(value = "NoticeFlag", type = IdType.AUTO)
    private Integer NoticeFlag;

    @TableField("NoticeName")
    private String NoticeName;


    @Override
    protected Serializable pkVal() {
        return this.NoticeFlag;
    }

}
