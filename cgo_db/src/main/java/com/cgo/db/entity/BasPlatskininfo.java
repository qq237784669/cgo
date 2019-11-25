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
@TableName("bas_PlatSkinInfo")
public class BasPlatskininfo extends Model<BasPlatskininfo> {

    private static final long serialVersionUID=1L;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableId(value = "SkinFlag", type = IdType.AUTO)
    private Integer SkinFlag;

    @TableField("BSFlag")
    private String BSFlag;

    @TableField("Remark")
    private String Remark;

    @TableField("TopClientFlag")
    private String TopClientFlag;

    @TableField("SkinName")
    private String SkinName;


    @Override
    protected Serializable pkVal() {
        return this.SkinFlag;
    }

}
