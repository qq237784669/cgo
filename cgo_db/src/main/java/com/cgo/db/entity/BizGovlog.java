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
@TableName("biz_GovLog")
public class BizGovlog extends Model<BizGovlog> {

    private static final long serialVersionUID=1L;

    @TableField("govId")
    private String govId;

    @TableField("SimNum")
    private String SimNum;

    @TableField("RspTime")
    private LocalDateTime RspTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("parameValue")
    private String parameValue;

    @TableField("vehicle_Color")
    private Integer vehicleColor;

    @TableField("cmdContent")
    private String cmdContent;

    @TableField("CmdCode")
    private Integer CmdCode;

    @TableField("RspResult")
    private String RspResult;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    @TableField("vehicle_No")
    private String vehicleNo;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
