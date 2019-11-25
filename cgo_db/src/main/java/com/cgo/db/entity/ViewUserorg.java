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
@TableName("View_UserOrg")
public class ViewUserorg extends Model<ViewUserorg> {

    private static final long serialVersionUID=1L;

    @TableField("ParentId")
    private Integer ParentId;

    @TableField("UserId")
    private String UserId;

    @TableField("OrgName")
    private String OrgName;

    @TableField("OrgId")
    private Integer OrgId;

    @TableField("SearchCode")
    private String SearchCode;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
