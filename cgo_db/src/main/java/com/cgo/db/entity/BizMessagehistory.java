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
@TableName("biz_MessageHistory")
public class BizMessagehistory extends Model<BizMessagehistory> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableField("MsgTypeId")
    private Integer MsgTypeId;

    @TableField("CreateDte")
    private LocalDateTime CreateDte;

    @TableField("SimNum")
    private String SimNum;

    @TableField("MsgId")
    private Integer MsgId;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
