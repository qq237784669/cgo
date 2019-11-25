package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("bas_VehicleInfoColumn")
public class BasVehicleinfocolumn extends Model<BasVehicleinfocolumn> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆信息字段列在车辆表中的列名
     */
    @TableField("ColumnField")
    private String ColumnField;

    /**
     * 车辆信息字段列显示在页面上的字符
     */
    @TableField("ColumnText")
    private String ColumnText;

    /**
     * 字段列的分类
     */
    @TableField("ColumnTypeId")
    private Integer ColumnTypeId;

    /**
     * 此字段列对应的控件在页面上所跨的列数，默认为1
     */
    @TableField("ColumnSpan")
    private Integer ColumnSpan;

    /**
     * 此字段列对应的页面控件的类型，参考控件类型表 bas_WebControlType
     */
    @TableField("ControlTypeId")
    private Integer ControlTypeId;

    /**
     * 此字段列在页面上的扩展文本，比如度量单位等
     */
    @TableField("ExtendText")
    private String ExtendText;

    /**
     * 是否必填
     */
    @TableField("IsRequired")
    private Boolean IsRequired;

    /**
     * 数据类型，与TopGps.Helper.CheckDataHelper中定义的枚举DataType值对应
     */
    @TableField("DataType")
    private Integer DataType;

    /**
     * 最大值或最大字符数
     */
    @TableField("MaxValueOrLength")
    private Integer MaxValueOrLength;

    /**
     * 最小值或最小字符数
     */
    @TableField("MinValueOrLength")
    private Integer MinValueOrLength;

    /**
     * 若是下拉控件，此字段表示下拉控件的显示文本域
     */
    @TableField("DropDownTextField")
    private String DropDownTextField;

    /**
     * 若是下拉控件，此字段表示下拉控件的值域
     */
    @TableField("DropDownValueField")
    private String DropDownValueField;

    /**
     * 若是下拉控件，此字段表示下拉控件是否在首行增加一项默认项
     */
    @TableField("DropDownHasDefault")
    private Boolean DropDownHasDefault;

    /**
     * 若是下拉控件且有默认首行，此字段表示下拉控件首行的值
     */
    @TableField("DropDownDefaultValue")
    private String DropDownDefaultValue;

    /**
     * 若是下拉控件且有默认首行，此字段表示下拉控件首行的显示文本
     */
    @TableField("DropDownDefaultText")
    private String DropDownDefaultText;

    /**
     * 若是下拉控件，此字段表示下拉控件的显示文本是否要缩进
     */
    @TableField("DropDownIsIndent")
    private Boolean DropDownIsIndent;

    /**
     * 若是下拉控件，此字段表示下拉控件当前选中的项的值
     */
    @TableField("DropDownSelectValue")
    private String DropDownSelectValue;

    @TableField("SortOrder")
    private Integer SortOrder;

    @TableField("MultiSortOrder")
    private Integer MultiSortOrder;

    @TableField("CheckBoxHasDefault")
    private Boolean CheckBoxHasDefault;

    @TableField("IsMulti")
    private Boolean IsMulti;

    @TableField("DefaultValue")
    private String DefaultValue;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
