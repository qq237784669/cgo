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
@TableName("bas_OilBoxRefPoint")
public class BasOilboxrefpoint extends Model<BasOilboxrefpoint> {

    private static final long serialVersionUID=1L;

    /**
     * 参考点序号
     */
    @TableField("PointNum")
    private Integer PointNum;

    /**
     * 模拟量/标定值
     */
    @TableField("AnalogValue")
    private Double AnalogValue;

    /**
     * 实际油量值
     */
    @TableField("OilValue")
    private Double OilValue;

    /**
     * 所属油箱型号ID
     */
    @TableField("OilBoxTypeId")
    private Integer OilBoxTypeId;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
