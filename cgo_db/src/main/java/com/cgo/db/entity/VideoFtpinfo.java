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
@TableName("video_FtpInfo")
public class VideoFtpinfo extends Model<VideoFtpinfo> {

    private static final long serialVersionUID=1L;

    @TableField("FtpIp")
    private String FtpIp;

    @TableField("UserPwd")
    private String UserPwd;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("LocalPort")
    private Integer LocalPort;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("FtpDomain")
    private String FtpDomain;

    @TableField("FtpPort")
    private Integer FtpPort;

    @TableField("UpLoadPath")
    private String UpLoadPath;

    @TableField("FolderPath")
    private String FolderPath;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("LocalIp")
    private String LocalIp;

    @TableField("UserName")
    private String UserName;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
