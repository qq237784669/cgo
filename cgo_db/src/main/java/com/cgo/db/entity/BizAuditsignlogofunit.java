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
@TableName("biz_AuditSignLogOfUnit")
public class BizAuditsignlogofunit extends Model<BizAuditsignlogofunit> {

    private static final long serialVersionUID=1L;

    @TableField("MonIsLocation")
    private Boolean MonIsLocation;

    @TableField("MonIsPass")
    private Boolean MonIsPass;

    @TableField("SimNum")
    private String SimNum;

    @TableField("MonSignTime")
    private LocalDateTime MonSignTime;

    @TableField("MonIsUploadImg")
    private Boolean MonIsUploadImg;

    @TableField("MonGpsTimeList")
    private String MonGpsTimeList;

    @TableField("WriteSignUser")
    private String WriteSignUser;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("MonIsCorrectImgPos")
    private Boolean MonIsCorrectImgPos;

    @TableField("MonUserId")
    private String MonUserId;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
