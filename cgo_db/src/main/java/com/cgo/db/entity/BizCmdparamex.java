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
@TableName("biz_CmdParamEx")
public class BizCmdparamex extends Model<BizCmdparamex> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CmdCode")
    private Long CmdCode;

    @TableField("CmdCodeFlag")
    private String CmdCodeFlag;

    @TableField("ParamContent")
    private String ParamContent;

    @TableField("SimNum")
    private String SimNum;

    @TableField("UserId")
    private String UserId;

    @TableField("SendTime")
    private LocalDateTime SendTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
