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
@TableName("rep_ServerUpdateFailLog")
public class RepServerupdatefaillog extends Model<RepServerupdatefaillog> {

    private static final long serialVersionUID=1L;

    @TableField("CustomerCode")
    private String CustomerCode;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("PrevServerVersion")
    private String PrevServerVersion;

    @TableField("UpdateServerVersion")
    private String UpdateServerVersion;

    @TableField("UpdateStatus")
    private Integer UpdateStatus;

    @TableField("Remark")
    private String Remark;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    @TableField("DoneTime")
    private LocalDateTime DoneTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
