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
@TableName("biz_FeatureHelperConfig")
public class BizFeaturehelperconfig extends Model<BizFeaturehelperconfig> {

    private static final long serialVersionUID=1L;

    /**
     * 功能编码
     */
    @TableId("FeatureCode")
    private String FeatureCode;

    /**
     * 编码类别 区分FeatureCode含义  类别：1 MenuCode  其他待增加维护
     */
    @TableField("CodeType")
    private Integer CodeType;

    /**
     * 功能所属模块 
     */
    @TableField("ModuleCode")
    private String ModuleCode;

    /**
     * 帮助内容
     */
    @TableField("HelperContent")
    private String HelperContent;

    /**
     * 帮助内容的版本 以遍判断帮助是否需要更新
     */
    @TableField("Version")
    private String Version;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.FeatureCode;
    }

}
