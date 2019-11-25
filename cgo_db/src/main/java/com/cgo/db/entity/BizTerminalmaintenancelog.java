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
@TableName("biz_TerminalMaintenanceLog")
public class BizTerminalmaintenancelog extends Model<BizTerminalmaintenancelog> {

    private static final long serialVersionUID=1L;

    @TableField("ServiceType")
    private Integer ServiceType;

    @TableField("ServicedTime")
    private LocalDateTime ServicedTime;

    @TableField("FaultFoundTime")
    private LocalDateTime FaultFoundTime;

    @TableField("RecordUser")
    private String RecordUser;

    @TableField("FaultFoundUser")
    private String FaultFoundUser;

    @TableField("Remark")
    private String Remark;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("ServiceAddress")
    private String ServiceAddress;

    @TableField("VehicleId")
    private Integer VehicleId;

    @TableField("FaultProcess")
    private String FaultProcess;

    @TableField("ServiceUser")
    private String ServiceUser;

    @TableField("ProcessMethod")
    private String ProcessMethod;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
