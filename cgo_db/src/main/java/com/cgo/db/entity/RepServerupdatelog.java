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
@TableName("rep_ServerUpdateLog")
public class RepServerupdatelog extends Model<RepServerupdatelog> {

    private static final long serialVersionUID=1L;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("CustomerCode")
    private String CustomerCode;

    @TableField("PrevServerVersion")
    private String PrevServerVersion;

    @TableField("UpdateStatus")
    private Integer UpdateStatus;

    @TableField("UpdateServerVersion")
    private String UpdateServerVersion;

    @TableField("Remark")
    private String Remark;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    @TableField("DoneTime")
    private LocalDateTime DoneTime;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
