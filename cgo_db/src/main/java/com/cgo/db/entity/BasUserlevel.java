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
@TableName("bas_UserLevel")
public class BasUserlevel extends Model<BasUserlevel> {

    private static final long serialVersionUID=1L;

    @TableField("UserLevelName")
    private String UserLevelName;

    @TableId(value = "UserLevelId", type = IdType.AUTO)
    private Integer UserLevelId;

    @TableField("ReplayMaxCh")
    private Integer ReplayMaxCh;

    @TableField("LiveVideoMaxCh")
    private Integer LiveVideoMaxCh;


    @Override
    protected Serializable pkVal() {
        return this.UserLevelId;
    }

}
