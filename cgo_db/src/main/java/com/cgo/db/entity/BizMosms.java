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
@TableName("biz_MOSms")
public class BizMosms extends Model<BizMosms> {

    private static final long serialVersionUID=1L;

    @TableField("MsgContent")
    private byte[] MsgContent;

    @TableField("bSend")
    private Boolean bSend;

    @TableField("DeviceType")
    private String DeviceType;

    @TableField("IsResend")
    private Boolean IsResend;

    @TableField("Phone")
    private String Phone;

    @TableField("MsgCode")
    private Integer MsgCode;

    @TableField("SystemID")
    private String SystemID;

    @TableField("AddTime")
    private LocalDateTime AddTime;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
