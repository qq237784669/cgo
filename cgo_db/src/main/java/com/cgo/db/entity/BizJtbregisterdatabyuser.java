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
@TableName("biz_JTBRegisterDataByUser")
public class BizJtbregisterdatabyuser extends Model<BizJtbregisterdatabyuser> {

    private static final long serialVersionUID=1L;

    @TableField("TerminalModel")
    private String TerminalModel;

    @TableField("UserId")
    private String UserId;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("SimNum")
    private String SimNum;

    @TableField("TerminalID")
    private String TerminalID;

    @TableField("CreateDate")
    private LocalDateTime CreateDate;

    @TableField("ManufacturerID")
    private String ManufacturerID;

    @TableField("TerminalImeiNum")
    private String TerminalImeiNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
