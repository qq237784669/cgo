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
@TableName("adas_OrgRiskLevelConfig")
public class AdasOrgrisklevelconfig extends Model<AdasOrgrisklevelconfig> {

    private static final long serialVersionUID=1L;

    @TableId("OrgId")
    private Integer OrgId;
    /**
     * 低风险阀值
     */
    @TableField("LowRisk")
    private Double LowRisk;

    /**
     * 中风险阀值
     */
    @TableField("CenterRisk")
    private Double CenterRisk;

    /**
     * 高风险阀值
     */
    @TableField("HighRisk")
    private Double HighRisk;

    @TableField("2171798691842")
    private Double adas_ORKL_2171798691842;

    @TableField("221474836482")
    private Double adas_ORKL_221474836482;

    @TableField("12")
    private Double adas_ORKL_12;

    @TableField("132")
    private Double adas_ORKL_132;

    @TableField("268719476736")
    private Double adas_ORKL_268719476736;

    @TableField("28589934592")
    private Double adas_ORKL_28589934592;

    @TableField("285899345922")
    private Double adas_ORKL_285899345922;
    @TableField("116")
    private Double adas_ORKL_116;
    @TableField("24294967296")
    private Double adas_ORKL_24294967296;
    @TableField("142")
    private Double adas_ORKL_142;
    @TableField("1322")
    private Double adas_ORKL_1322;
    @TableField("11")
    private Double adas_ORKL_11;
    @TableField("18")
    private Double adas_ORKL_18;
    @TableField("22147483648")
    private Double adas_ORKL_22147483648;
    @TableField("234359738368")
    private Double adas_ORKL_234359738368;
    @TableField("122")
    private Double adas_ORKL_122;
    @TableField("1162")
    private Double adas_ORKL_1162;
    @TableField("2687194767362")
    private Double adas_ORKL_2687194767362;
    @TableField("2343597383682")
    private Double adas_ORKL_2343597383682;
    @TableField("242949672962")
    private Double adas_ORKL_242949672962;
    @TableField("14")
    private Double adas_ORKL_14;
    @TableField("217179869184")
    private Double adas_ORKL_217179869184;
    @TableField("112")
    private Double adas_ORKL_112;
    @TableField("182")
    private Double adas_ORKL_182;


    @Override
    protected Serializable pkVal() {
        return this.OrgId;
    }

}
