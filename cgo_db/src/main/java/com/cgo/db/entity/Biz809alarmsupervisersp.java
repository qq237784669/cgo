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
@TableName("biz_809AlarmSuperviseRsp")
public class Biz809alarmsupervisersp extends Model<Biz809alarmsupervisersp> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("GovId")
    private String GovId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("RspResult")
    private Integer RspResult;

    @TableField("UniqueId")
    private String UniqueId;

    @TableField("Result")
    private Integer Result;

    @TableField("SimNum")
    private String SimNum;

    @TableField("SupervisionId")
    private Integer SupervisionId;

    @TableField("UserId")
    private String UserId;

    @TableField("RspTime")
    private LocalDateTime RspTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
