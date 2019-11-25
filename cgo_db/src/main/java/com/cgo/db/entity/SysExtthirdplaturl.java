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
@TableName("sys_ExtThirdPlatUrl")
public class SysExtthirdplaturl extends Model<SysExtthirdplaturl> {

    private static final long serialVersionUID=1L;

    /**
     * 类型（1：地图上方自定义功能按钮）
     */
    @TableField("Type")
    private Integer Type;

    @TableField("Param")
    private String Param;

    @TableField("IsOpenWin")
    private Integer IsOpenWin;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("isEnable")
    private Integer isEnable;

    @TableField("Url")
    private String Url;

    @TableField("Name")
    private String Name;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
