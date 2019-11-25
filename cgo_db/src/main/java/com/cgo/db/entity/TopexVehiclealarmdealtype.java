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
@TableName("topEx_VehicleAlarmDealType")
public class TopexVehiclealarmdealtype extends Model<TopexVehiclealarmdealtype> {

    private static final long serialVersionUID=1L;

    /**
     * 9999:其他，2：超速报警，4：疲劳报警
     */
    @TableField("Type")
    private Long Type;

    @TableField("AlarmDealTypeName")
    private String AlarmDealTypeName;

    @TableField("OrderId")
    private Integer OrderId;

    @TableId("Id")
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
