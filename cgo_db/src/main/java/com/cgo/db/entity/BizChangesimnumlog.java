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
@TableName("biz_ChangeSimNumLog")
public class BizChangesimnumlog extends Model<BizChangesimnumlog> {

    private static final long serialVersionUID=1L;

    @TableField("ChangBy")
    private String ChangBy;

    @TableField("OldSimNum")
    private String OldSimNum;

    @TableField("NewSimNum")
    private String NewSimNum;

    @TableField("CompleteTime")
    private LocalDateTime CompleteTime;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ChangeTime")
    private LocalDateTime ChangeTime;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
