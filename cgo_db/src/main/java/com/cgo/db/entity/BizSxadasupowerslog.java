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
@TableName("biz_SxAdasUpOwersLog")
public class BizSxadasupowerslog extends Model<BizSxadasupowerslog> {

    private static final long serialVersionUID=1L;

    /**
     * 业户id
     */
    @TableField("Id")
    private Integer Id;

    /**
     * 上级id
     */
    private Integer parentId;

    /**
     * 业户名称
     */
    private String name;

    /**
     * 道路经营许可证  车辆表对应：RoadTransportID
     */
    private String rtoln;

    /**
     * 联系人  车辆表对应：Contact
     */
    private String linkma;

    /**
     * 联系电话 车辆表  对应：Telephone
     */
    private String linkmanTel;

    /**
     * 上报类型：1 上报 2：注销
     */
    @TableField("ReportType")
    private Integer ReportType;

    /**
     * 上报状态：1成功 2：失败
     */
    @TableField("ReportState")
    private Integer ReportState;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    @TableField("ReportTime")
    private LocalDateTime ReportTime;

    @TableField("Reason")
    private String Reason;

    private String platformId;

    private String sign;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}
