package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("sys_UserAuth_POI")
public class SysUserauthPoi extends Model<SysUserauthPoi> {

    private static final long serialVersionUID=1L;

    @TableField("UserId")
    private String UserId;

    @TableField("PoiId")
    private Integer PoiId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
