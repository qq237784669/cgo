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
@TableName("sas_ActivationInfo")
public class SasActivationinfo extends Model<SasActivationinfo> {

    private static final long serialVersionUID=1L;

    private String ip;

    private LocalDateTime expireTm;

    @TableField("Activation_Result")
    private Integer activationResult;

    @TableField("Activation_cd")
    private String activationCd;

    @TableField("PlatName")
    private String PlatName;

    @TableField("Version")
    private String Version;

    private String computerId;

    private LocalDateTime endTm;

    @TableField("Activation_tm")
    private LocalDateTime activationTm;

    @TableField("Activation_sts")
    private String activationSts;

    @TableField("last_Activation_tm")
    private LocalDateTime lastActivationTm;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("Activation_psn")
    private String activationPsn;

    @TableField("ContactTel")
    private String ContactTel;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
