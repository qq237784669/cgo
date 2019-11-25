package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("upd_UpgradeTaskDetail")
public class UpdUpgradetaskdetail extends Model<UpdUpgradetaskdetail> {

    private static final long serialVersionUID=1L;

    @TableId("SimNum")
    private String SimNum;

    @TableField("UpdMsg")
    private String UpdMsg;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableField("TaskId")
    private Integer TaskId;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("UpdState")
    private Integer UpdState;


    @Override
    protected Serializable pkVal() {
        return this.SimNum;
    }

}
