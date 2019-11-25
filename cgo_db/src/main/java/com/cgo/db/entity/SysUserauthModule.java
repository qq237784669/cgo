package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户系统模块权限表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_UserAuth_Module")
public class SysUserauthModule extends Model<SysUserauthModule> {

    private static final long serialVersionUID=1L;

    /**
     * 用户账号
     */
    @TableId("UserId")
    private String UserId;

    /**
     * 系统模块代码
     */
    @TableField("ModuleCode")
    private String ModuleCode;

    /**
     * Id
     */
    @TableField("Id")
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

}
