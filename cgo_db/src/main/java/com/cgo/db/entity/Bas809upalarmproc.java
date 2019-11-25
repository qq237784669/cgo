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
@TableName("bas_809UpAlarmProc")
public class Bas809upalarmproc extends Model<Bas809upalarmproc> {

    private static final long serialVersionUID=1L;

    /**
     * 处理方式标识，如（停止报警、实时监控发送消息，实时监控审核等）
     */
    @TableId("ProcFlag")
    private Long ProcFlag;

    /**
     * 处理方式名称
     */
    @TableField("ProcName")
    private String ProcName;

    /**
     * 处理结果（0：处理中，1：已处理完毕，2：不做处理，3：将来处理）
     */
    @TableField("Result")
    private Integer Result;

    /**
     * 报警处理方式（0：快速拍照，1：语音下发，2：不做处理，3：其他）
     */
    @TableField("Method")
    private Integer Method;

    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.ProcFlag;
    }

}
