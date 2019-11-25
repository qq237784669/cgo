package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_809UpTransPackage")
public class Biz809uptranspackage extends Model<Biz809uptranspackage> {

    private static final long serialVersionUID=1L;

    @TableField("GovId")
    private String GovId;

    @TableField("SubCmdCode")
    private Long SubCmdCode;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("Data")
    private String Data;

    @TableField("CmdCode")
    private Long CmdCode;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
