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
@TableName("biz_809PlatformCheckResponse")
public class Biz809platformcheckresponse extends Model<Biz809platformcheckresponse> {

    private static final long serialVersionUID=1L;

    @TableField("InsertTime")
    private LocalDateTime InsertTime;

    @TableField("Question")
    private String Question;

    @TableField("PlatformId")
    private String PlatformId;

    @TableField("RequestId")
    private Integer RequestId;

    @TableField("MatchResult")
    private Integer MatchResult;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("Remark")
    private String Remark;

    @TableField("Answer")
    private String Answer;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
