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
 * 车牌颜色表 按照JT/T 145-2006中5.4.12的规定
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("std_PlateColor")
public class StdPlatecolor extends Model<StdPlatecolor> {

    private static final long serialVersionUID=1L;

    /**
     * 代码
     */
    @TableId("ColorCode")
    private Integer ColorCode;

    /**
     * 颜色
     */
    @TableField("ColorName")
    private String ColorName;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    @TableField("TypeOrder")
    private Integer TypeOrder;


    @Override
    protected Serializable pkVal() {
        return this.ColorCode;
    }

}
