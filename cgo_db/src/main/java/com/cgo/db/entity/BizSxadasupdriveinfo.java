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
@TableName("biz_SxAdasUpDriveInfo")
public class BizSxadasupdriveinfo extends Model<BizSxadasupdriveinfo> {

    private static final long serialVersionUID=1L;

    /**
     * id 驾驶员ID
     */
    private String id;

    /**
     * 驾驶员上报状态 1：上报 2:注销
     */
    @TableField("ReportState")
    private Integer ReportState;

    @TableField("ReprotTime")
    private LocalDateTime ReprotTime;

    @TableId(value = "sId", type = IdType.AUTO)
    private Integer sId;


    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

}
