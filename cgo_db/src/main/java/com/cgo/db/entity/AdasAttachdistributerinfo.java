package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("adas_AttachDistributerInfo")
public class AdasAttachdistributerinfo extends Model<AdasAttachdistributerinfo> {

    private static final long serialVersionUID=1L;

    @TableField("TermLinkCount")
    private Integer TermLinkCount;

    @TableField("IsDel")
    private Boolean IsDel;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("TermUdpPort")
    private Integer TermUdpPort;

    @TableField("TermIp")
    private String TermIp;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("TermDomain")
    private String TermDomain;

    @TableField("TermTcpPort")
    private Integer TermTcpPort;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
