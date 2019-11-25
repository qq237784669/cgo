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
@TableName("bas_VoiceOfMsg")
public class BasVoiceofmsg extends Model<BasVoiceofmsg> {

    private static final long serialVersionUID=1L;

    /**
     * 联系人Id（关联表bas_CompanyContactInfo）
     */
    @TableField("VoiceId")
    private Integer VoiceId;

    /**
     * 报警类型标识(关联表bas_MsgPushConfig)
     */
    @TableField("AlarmTag")
    private String AlarmTag;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
