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
@TableName("biz_AuditSignForDel")
public class BizAuditsignfordel extends Model<BizAuditsignfordel> {

    private static final long serialVersionUID=1L;

    /**
     * 注销车辆记录Id
     */
    @TableField("DeleteLogId")
    private Integer DeleteLogId;

    /**
     * 企业核实用户
     */
    @TableField("EnCheckUserId")
    private String EnCheckUserId;

    /**
     * 企业核实时间
     */
    @TableField("EnCheckTime")
    private LocalDateTime EnCheckTime;

    /**
     * 企业核实状态 0：未核实，1：核实通过，2：核实不通过
     */
    @TableField("EnCheckState")
    private Integer EnCheckState;

    /**
     * 区所核实用户
     */
    @TableField("AreaCheckUserId")
    private String AreaCheckUserId;

    /**
     * 区所核实时间
     */
    @TableField("AreaCheckTime")
    private LocalDateTime AreaCheckTime;

    /**
     * 区所核实状态 0：未核实，1：核实通过，2：核实不通过
     */
    @TableField("AreaCheckState")
    private Integer AreaCheckState;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
