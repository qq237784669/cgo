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
@TableName("biz_OperatorOnlineLog")
public class BizOperatoronlinelog extends Model<BizOperatoronlinelog> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableField("LogoutTime")
    private LocalDateTime LogoutTime;

    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId("Id")
    private String Id;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
