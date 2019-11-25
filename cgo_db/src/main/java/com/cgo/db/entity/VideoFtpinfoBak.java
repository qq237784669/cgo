package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("video_FtpInfo_bak")
public class VideoFtpinfoBak extends Model<VideoFtpinfoBak> {

    private static final long serialVersionUID=1L;

    @TableField("LocalPort")
    private Integer LocalPort;

    @TableField("FtpPort")
    private Integer FtpPort;

    @TableField("UpLoadPath")
    private String UpLoadPath;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("UserName")
    private String UserName;

    @TableField("Id")
    private Long Id;

    @TableField("LocalIp")
    private String LocalIp;

    @TableField("FolderPath")
    private String FolderPath;

    @TableField("FtpIp")
    private String FtpIp;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("UserPwd")
    private String UserPwd;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
