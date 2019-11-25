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
@TableName("sys_OtherPlatform_UserConfig")
public class SysOtherplatformUserconfig extends Model<SysOtherplatformUserconfig> {

    private static final long serialVersionUID=1L;

    @TableField("Param1")
    private String Param1;

    @TableField("UserId")
    private String UserId;

    @TableField("Remark")
    private String Remark;

    @TableField("PlatCode")
    private String PlatCode;

    @TableField("Param2")
    private String Param2;

    @TableField("Param3")
    private String Param3;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Enabled")
    private Boolean Enabled;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
