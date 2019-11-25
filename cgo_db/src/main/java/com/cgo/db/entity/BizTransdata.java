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
@TableName("biz_TransData")
public class BizTransdata extends Model<BizTransdata> {

    private static final long serialVersionUID=1L;

    @TableField("SimNum")
    private String SimNum;

    @TableField("DataType")
    private Integer DataType;

    @TableField("Desc")
    private String Desc;

    @TableField("TransType")
    private Integer TransType;

    @TableField("ReceTime")
    private LocalDateTime ReceTime;

    @TableField("Data")
    private String Data;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
