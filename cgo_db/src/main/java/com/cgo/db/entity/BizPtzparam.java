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
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_PTZParam")
public class BizPtzparam extends Model<BizPtzparam> {

    private static final long serialVersionUID=1L;

    @TableField("ApertureCtrl")
    private Boolean ApertureCtrl;

    @TableField("Speed")
    private Integer Speed;

    @TableField("WiperCtrl")
    private Boolean WiperCtrl;

    @TableField("Direction")
    private Integer Direction;

    @TableField("FillLightCtrl")
    private Boolean FillLightCtrl;

    @TableField("FocusCtrl")
    private Boolean FocusCtrl;

    @TableId("ConfigId")
    private Integer ConfigId;

    @TableField("ZoomCtrl")
    private Boolean ZoomCtrl;

    @TableField("IsStop")
    private Boolean IsStop;

    @TableField("UserId")
    private String UserId;


    @Override
    protected Serializable pkVal() {
        return this.ConfigId;
    }

}
