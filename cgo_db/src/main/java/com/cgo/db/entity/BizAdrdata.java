package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
@TableName("biz_ADRData")
public class BizAdrdata extends Model<BizAdrdata> {

    private static final long serialVersionUID=1L;

    @TableField("ADRDataType")
    private Integer ADRDataType;

    @TableField("Is809Send")
    private Boolean Is809Send;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Content")
    private String Content;

    @TableField("UpLoadTime")
    private LocalDateTime UpLoadTime;

    @TableField("ADRVesionType")
    private Integer ADRVesionType;

    @TableId(value = "ADRDataId", type = IdType.AUTO)
    private Integer ADRDataId;


    @Override
    protected Serializable pkVal() {
        return this.ADRDataId;
    }

}
