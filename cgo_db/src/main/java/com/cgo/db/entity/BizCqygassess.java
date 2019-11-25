package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("biz_CQYGAssess")
public class BizCqygassess extends Model<BizCqygassess> {

    private static final long serialVersionUID=1L;

    @TableField("assessBatch")
    private String assessBatch;

    @TableField("isHandle")
    private Integer isHandle;

    @TableField("shiftRate")
    private Double shiftRate;

    @TableField("onlineRate")
    private Double onlineRate;

    private LocalDateTime updatetime;

    @TableField("orbitRate")
    private Double orbitRate;

    @TableField("vehicleCount")
    private Integer vehicleCount;

    @TableField("failCount")
    private Integer failCount;

    @TableField("dataRate")
    private Double dataRate;

    @TableField("userID")
    private String userID;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
