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
 * 命令代码表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_CmdCode")
public class BasCmdcode extends Model<BasCmdcode> {

    private static final long serialVersionUID=1L;

    /**
     * 命令代码
     */
    @TableId("CmdCode")
    private Long CmdCode;

    /**
     * 命令名称
     */
    @TableField("CmdName")
    private String CmdName;

    /**
     * 命令方向
   1-下行; 2-上行
     */
    @TableField("CmdDirection")
    private Integer CmdDirection;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;


    @Override
    protected Serializable pkVal() {
        return this.CmdCode;
    }

}
