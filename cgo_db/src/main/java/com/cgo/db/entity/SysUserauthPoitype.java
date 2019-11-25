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
@TableName("sys_UserAuth_POIType")
public class SysUserauthPoitype extends Model<SysUserauthPoitype> {

    private static final long serialVersionUID=1L;

    @TableField("UserId")
    private String UserId;

    @TableField("PoiType")
    private Integer PoiType;

    @TableField("Auth")
    private String Auth;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
