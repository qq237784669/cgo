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
@TableName("video_AVFileFtpInfo")
public class VideoAvfileftpinfo extends Model<VideoAvfileftpinfo> {

    private static final long serialVersionUID=1L;

    @TableField("PlateColor")
    private Integer PlateColor;

    @TableField("Password")
    private String Password;

    @TableField("AVDownloadInfoId")
    private Long AVDownloadInfoId;

    @TableField("FtpIp")
    private String FtpIp;

    @TableField("IsDel")
    private Boolean IsDel;

    @TableField("SimNum")
    private String SimNum;

    @TableField("Result")
    private Integer Result;

    @TableField("FilePath")
    private String FilePath;

    @TableField("FtpPort")
    private Integer FtpPort;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    @TableField("Username")
    private String Username;

    @TableField("SessionId")
    private Integer SessionId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("PlateNum")
    private String PlateNum;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
