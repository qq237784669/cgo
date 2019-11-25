package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("biz_809PosLoseLog")
public class Biz809posloselog extends Model<Biz809posloselog> {

    private static final long serialVersionUID=1L;

    @TableField("GovId")
    private String GovId;

    @TableField("LoseNum")
    private Integer LoseNum;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
