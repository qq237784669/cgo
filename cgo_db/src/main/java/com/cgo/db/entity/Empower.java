package com.cgo.db.entity;

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
public class Empower extends Model<Empower> {

    private static final long serialVersionUID=1L;

    private LocalDateTime lastEmpowerTm;

    private String computerIdNew;

    @TableField("Empower_tm")
    private LocalDateTime empowerTm;

    private Boolean dogSg;

    @TableField("Version")
    private String Version;

    private String empowerSts;

    private String empowerCd;

    private String computerId;

    @TableField("Empower_psn")
    private String empowerPsn;

    private String ip;

    private LocalDateTime endTm;

    @TableField("Empower_Result")
    private Integer empowerResult;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String systemId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
