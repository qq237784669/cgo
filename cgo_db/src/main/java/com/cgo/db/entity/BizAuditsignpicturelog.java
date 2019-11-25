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
@TableName("biz_AuditSignPictureLog")
public class BizAuditsignpicturelog extends Model<BizAuditsignpicturelog> {

    private static final long serialVersionUID=1L;

    /**
     * 拍照时间
     */
    @TableField("PicTime")
    private LocalDateTime PicTime;

    /**
     * 操作类型（0：企业签章，1：区所签章，2：企业复运，3：区所复运）
     */
    @TableField("OperateType")
    private Integer OperateType;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("SimNum")
    private String SimNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
