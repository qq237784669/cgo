package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 协议表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_Protocol")
public class BasProtocol extends Model<BasProtocol> {

    private static final long serialVersionUID=1L;

    /**
     * 协议代码
     */
    @TableId("ProtocolCode")
    private String ProtocolCode;

    /**
     * 协议版本
     */
    @TableField("ProtocolVersion")
    private String ProtocolVersion;

    /**
     * 协议名称
     */
    @TableField("ProtocolName")
    private String ProtocolName;

    /**
     * 说明
     */
    @TableField("Description")
    private String Description;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.ProtocolCode;
    }

}
