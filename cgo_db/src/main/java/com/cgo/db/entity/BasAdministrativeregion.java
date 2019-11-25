package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("bas_AdministrativeRegion")
public class BasAdministrativeregion extends Model<BasAdministrativeregion> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("UserConfig")
    private Integer UserConfig;

    @TableField("DivisonLevel")
    private Integer DivisonLevel;

    @TableField("ParentCode")
    private Integer ParentCode;

    @TableField("ShortName")
    private String ShortName;

    @TableField("DivisonCode")
    private Integer DivisonCode;

    @TableField("DivisonName")
    private String DivisonName;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
