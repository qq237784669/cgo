package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_PassengerOverloadingInfo")
public class BizPassengeroverloadinginfo extends Model<BizPassengeroverloadinginfo> {

    private static final long serialVersionUID=1L;

    @TableField("TrackId")
    private String TrackId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("SignUserId")
    private String SignUserId;

    @TableField("Remark")
    private String Remark;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SignTime")
    private LocalDateTime SignTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("Status")
    private Integer Status;

    @TableField("GpsTime")
    private LocalDateTime GpsTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
