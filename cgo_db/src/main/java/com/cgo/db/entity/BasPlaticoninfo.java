package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("bas_PlatIconInfo")
public class BasPlaticoninfo extends Model<BasPlaticoninfo> {

    private static final long serialVersionUID=1L;

    @TableField("Remark")
    private String Remark;

    @TableId("IconKey")
    private String IconKey;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IconData")
    private byte[] IconData;

    @TableField("ModuleCode")
    private String ModuleCode;


    @Override
    protected Serializable pkVal() {
        return this.IconKey;
    }

}
