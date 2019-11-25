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
@TableName("biz_DispatchCarApply")
public class BizDispatchcarapply extends Model<BizDispatchcarapply> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("ModeId")
    private Integer ModeId;

    @TableField("EndPosition")
    private String EndPosition;

    @TableField("StartTime")
    private LocalDateTime StartTime;

    @TableField("UserId1")
    private String UserId1;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("RefuseNotes")
    private String RefuseNotes;

    @TableField("StartPosition")
    private String StartPosition;

    @TableField("Statu")
    private Integer Statu;

    @TableField("Tel")
    private String Tel;

    @TableField("IsReplenish")
    private Boolean IsReplenish;

    @TableField("Evaluate")
    private Integer Evaluate;

    @TableId("Id")
    private String Id;

    @TableField("CompleteTime")
    private LocalDateTime CompleteTime;

    @TableField("Reason")
    private String Reason;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableField("Remark")
    private String Remark;

    @TableField("UserName2")
    private String UserName2;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("CheckLevel")
    private Integer CheckLevel;

    @TableField("Number")
    private Integer Number;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
