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
@TableName("SC_GeologicHazardAlarmErr")
public class ScGeologichazardalarmerr extends Model<ScGeologichazardalarmerr> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Double lat;

    @TableField("SendTime")
    private LocalDateTime SendTime;

    @TableField("simK")
    private String simK;

    private String ghid;

    @TableField("wTime")
    private LocalDateTime wTime;

    @TableField("SendResuestTime")
    private LocalDateTime SendResuestTime;

    @TableField("AlarmID")
    private String AlarmID;

    private Double speed;

    private String cph;

    @TableField("operatorsID")
    private String operatorsID;

    @TableField("IsSend")
    private Boolean IsSend;

    private Integer direction;

    @TableField("IsSendRequest")
    private Boolean IsSendRequest;

    private Double lon;

    @TableField("insertTime")
    private LocalDateTime insertTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
