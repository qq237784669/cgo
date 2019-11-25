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
@TableName("biz_AuditSignLog")
public class BizAuditsignlog extends Model<BizAuditsignlog> {

    private static final long serialVersionUID=1L;

    @TableField("ComIsUploadImg")
    private Boolean ComIsUploadImg;

    @TableField("ComSignTime")
    private LocalDateTime ComSignTime;

    @TableField("ComGpsTimeList")
    private String ComGpsTimeList;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ComUserId")
    private String ComUserId;

    @TableField("WriteSignUser")
    private String WriteSignUser;

    @TableField("ComIsCorrectImgPos")
    private Boolean ComIsCorrectImgPos;

    @TableField("SimNum")
    private String SimNum;

    @TableField("ComIsPass")
    private Boolean ComIsPass;

    @TableField("ComIsLocation")
    private Boolean ComIsLocation;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
