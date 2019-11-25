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
@TableName("biz_809PlatformQueryReq")
public class Biz809platformqueryreq extends Model<Biz809platformqueryreq> {

    private static final long serialVersionUID=1L;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("AnswerTime")
    private Integer AnswerTime;

    @TableField("UniqueId")
    private String UniqueId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("QueryType")
    private Integer QueryType;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InfoContent")
    private String InfoContent;

    @TableField("GovId")
    private String GovId;

    @TableField("Remark")
    private String Remark;

    @TableField("SystemTime")
    private LocalDateTime SystemTime;

    @TableField("ReceiveTime")
    private LocalDateTime ReceiveTime;

    @TableField("QueryId")
    private String QueryId;

    @TableField("OrderId")
    private Long OrderId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
