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
@TableName("rpt_MessagePush")
public class RptMessagepush extends Model<RptMessagepush> {

    private static final long serialVersionUID=1L;

    @TableField("MesContent")
    private String MesContent;

    @TableField("PushTime")
    private LocalDateTime PushTime;

    @TableField("PushNumber")
    private Integer PushNumber;

    @TableField("PushUser")
    private String PushUser;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("PushResult")
    private Integer PushResult;

    @TableField("HasFile")
    private Integer HasFile;

    @TableField("IsPush")
    private Integer IsPush;

    @TableField("FilePath")
    private String FilePath;

    @TableField("RptType")
    private Integer RptType;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
