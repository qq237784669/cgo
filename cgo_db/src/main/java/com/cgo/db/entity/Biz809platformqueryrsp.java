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
@TableName("biz_809PlatformQueryRsp")
public class Biz809platformqueryrsp extends Model<Biz809platformqueryrsp> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("InfoId")
    private Integer InfoId;

    @TableField("UniqueId")
    private String UniqueId;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("UserId")
    private String UserId;

    @TableField("RspTime")
    private LocalDateTime RspTime;

    @TableField("QueryId")
    private String QueryId;

    @TableField("RspSource")
    private Integer RspSource;

    @TableField("RspResult")
    private Integer RspResult;

    @TableField("InfoContent")
    private String InfoContent;

    @TableField("QueryType")
    private Integer QueryType;

    @TableField("GovId")
    private String GovId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
