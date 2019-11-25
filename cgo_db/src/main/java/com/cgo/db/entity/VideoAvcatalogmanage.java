package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("video_AVCatalogManage")
public class VideoAvcatalogmanage extends Model<VideoAvcatalogmanage> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("IsChoice")
    private Boolean IsChoice;

    @TableField("VedioLevel")
    private String VedioLevel;

    @TableField("Remark")
    private String Remark;

    @TableField("Sample")
    private String Sample;

    @TableField("IsInclude")
    private Boolean IsInclude;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
