package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("video_AVCode")
public class VideoAvcode extends Model<VideoAvcode> {

    private static final long serialVersionUID=1L;

    @TableField("AVType")
    private String AVType;

    @TableField("IsSupported")
    private Boolean IsSupported;

    @TableField("CodeName")
    private String CodeName;

    @TableField("Remark")
    private String Remark;

    @TableId("AVCode")
    private Integer AVCode;


    @Override
    protected Serializable pkVal() {
        return this.AVCode;
    }

}
