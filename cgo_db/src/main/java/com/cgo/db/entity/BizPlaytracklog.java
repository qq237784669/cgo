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
@TableName("biz_PlayTrackLog")
public class BizPlaytracklog extends Model<BizPlaytracklog> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("EndTime")
    private LocalDateTime EndTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InsTime")
    private LocalDateTime InsTime;

    @TableField("BeginTime")
    private LocalDateTime BeginTime;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
