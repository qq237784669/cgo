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
@TableName("video_DistributerInfo")
public class VideoDistributerinfo extends Model<VideoDistributerinfo> {

    private static final long serialVersionUID=1L;

    @TableField("LocalIp")
    private String LocalIp;

    @TableField("MachineId")
    private Integer MachineId;

    @TableField("PlayerIp")
    private String PlayerIp;

    @TableField("PlayerChCount")
    private Integer PlayerChCount;

    @TableField("LocalPlayerTcpPort")
    private Integer LocalPlayerTcpPort;

    @TableField("Id")
    private Long Id;

    @TableField("TermChCount")
    private Integer TermChCount;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("LocalPlayerUdpPort")
    private Integer LocalPlayerUdpPort;

    @TableField("AVType")
    private String AVType;

    @TableField("LocalTermTcpPort")
    private Integer LocalTermTcpPort;

    @TableField("SimLastNum")
    private String SimLastNum;

    @TableField("LocalTermUdpPort")
    private Integer LocalTermUdpPort;

    @TableField("TermIp")
    private String TermIp;

    @TableField("TermDomain")
    private String TermDomain;

    @TableField("TermCount")
    private Integer TermCount;

    @TableField("PlayerPort")
    private Integer PlayerPort;

    @TableField("PlayerCount")
    private Integer PlayerCount;

    @TableField("IsDel")
    private Integer IsDel;

    @TableField("ServiceId")
    private String ServiceId;

    @TableField("TermPort")
    private Integer TermPort;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
