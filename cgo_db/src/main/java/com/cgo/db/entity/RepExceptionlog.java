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
@TableName("rep_ExceptionLog")
public class RepExceptionlog extends Model<RepExceptionlog> {

    private static final long serialVersionUID=1L;

    @TableField("UserType")
    private String UserType;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("IMEI")
    private String imei;

    @TableField("MobileOs")
    private Integer MobileOs;

    @TableField("CustomerCode")
    private String CustomerCode;

    @TableField("Exception")
    private String Exception;

    @TableField("OperateFunc")
    private String OperateFunc;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
