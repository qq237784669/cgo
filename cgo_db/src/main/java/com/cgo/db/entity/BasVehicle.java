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
 * 车辆信息表
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_Vehicle")
public class BasVehicle extends Model<BasVehicle> {

    private static final long serialVersionUID=1L;

    /**
     * 车辆Id
     */
    @TableId(value = "VehicleId", type = IdType.AUTO)
    private Integer VehicleId;

    /**
     * 车牌号码
     */
    @TableField("PlateNum")
    private String PlateNum;

    /**
     * 车牌颜色
     */
    @TableField("ColorCode")
    private Integer ColorCode;

    /**
     * 车辆类型
     */
    @TableField("VehicleTypeCode")
    private Integer VehicleTypeCode;

    /**
     * 运输行业编码
     */
    @TableField("TransTypeCode")
    private String TransTypeCode;

    /**
     * 车籍地
     */
    @TableField("HomeCity")
    private Integer HomeCity;

    /**
     * 所属组织Id
     */
    @TableField("OrgId")
    private Integer OrgId;

    /**
     * SIM卡号
     */
    @TableField("SimNum")
    private String SimNum;

    /**
     * 终端Id
     */
    @TableField("TerminalId")
    private String TerminalId;

    /**
     * 注册标识
     */
    @TableField("RegFlag")
    private Integer RegFlag;

    /**
     * 授权码
     */
    @TableField("AuthCode")
    private String AuthCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 交强险
     */
    @TableField("ViStrong")
    private Double ViStrong;

    /**
     * 车船使用税
     */
    @TableField("ViUseTax")
    private Double ViUseTax;

    /**
     * 车损险
     */
    @TableField("ViDamage")
    private Double ViDamage;

    /**
     * 盗抢险
     */
    @TableField("ViThief")
    private Double ViThief;

    /**
     * 第三者责任险
     */
    @TableField("ViThirdParty")
    private Double ViThirdParty;

    /**
     * 车上人员责任险
     */
    @TableField("ViPassenger")
    private Double ViPassenger;

    /**
     * 保险到期时间
     */
    @TableField("ViExpirationTime")
    private LocalDateTime ViExpirationTime;

    /**
     * 里程修正比例
     */
    @TableField("MileageCorrectRate")
    private Integer MileageCorrectRate;

    @TableField("ConnectorID")
    private String ConnectorID;

    @TableField("FactoryId")
    private String FactoryId;

    @TableField("PromptDays")
    private Integer PromptDays;

    @TableField("BusinessScope")
    private String BusinessScope;

    @TableField("CorpNum")
    private String CorpNum;

    @TableField("TwolevelMaintenanceTime")
    private LocalDateTime TwolevelMaintenanceTime;

    @TableField("TINo")
    private String TINo;

    @TableField("TotalMass")
    private Integer TotalMass;

    @TableField("CarBody")
    private byte[] CarBody;

    @TableField("ADASFactoryName")
    private String ADASFactoryName;

    @TableField("OfflineMinutes")
    private Integer OfflineMinutes;

    @TableField("UnitArea")
    private String UnitArea;

    @TableField("DVRUserName")
    private String DVRUserName;

    @TableField("StartSite")
    private String StartSite;

    @TableField("DrivingPromptDays")
    private Integer DrivingPromptDays;

    @TableField("MacAddress")
    private String MacAddress;

    @TableField("CarPhone")
    private String CarPhone;

    @TableField("ServiceFee")
    private Double ServiceFee;

    @TableField("CreateBy")
    private String CreateBy;

    @TableField("FrameNo")
    private String FrameNo;

    @TableField("LiabilityBeginTime")
    private LocalDateTime LiabilityBeginTime;

    @TableField("BSDFactoryName")
    private String BSDFactoryName;

    @TableField("EquipmentDebugger")
    private String EquipmentDebugger;

    @TableField("OperatorId")
    private Integer OperatorId;

    @TableField("IsInstallOil")
    private Boolean IsInstallOil;

    @TableField("CharteredCarSTime")
    private LocalDateTime CharteredCarSTime;

    @TableField("DrivingLicensePic")
    private byte[] DrivingLicensePic;

    @TableField("PersonId")
    private String PersonId;

    @TableField("RegTime")
    private LocalDateTime RegTime;

    @TableField("OLLength")
    private Integer OLLength;

    @TableField("TIClaimInfo")
    private String TIClaimInfo;

    @TableField("BrandModel")
    private String BrandModel;

    @TableField("MaintenanceLastMileage")
    private String MaintenanceLastMileage;

    @TableField("PropertyTime")
    private LocalDateTime PropertyTime;

    @TableField("IsHaveAlarmSound")
    private Boolean IsHaveAlarmSound;

    @TableField("DSMFactoryName")
    private String DSMFactoryName;

    @TableField("VclnumRedy")
    private LocalDateTime VclnumRedy;

    @TableField("DrivingLicenseUseFunc")
    private String DrivingLicenseUseFunc;

    @TableField("DVRTypeCode")
    private String DVRTypeCode;

    @TableField("DriverLicenseEndTime")
    private LocalDateTime DriverLicenseEndTime;

    @TableField("NetProtocolNum")
    private String NetProtocolNum;

    @TableField("Tonnage")
    private Double Tonnage;

    @TableField("Operator")
    private String Operator;

    @TableField("OwnerSimNum")
    private String OwnerSimNum;

    @TableField("IsAutoStay")
    private Boolean IsAutoStay;

    @TableField("UnitCall")
    private String UnitCall;

    @TableField("VideoServerPort")
    private String VideoServerPort;

    @TableField("CommercialBeginTime")
    private LocalDateTime CommercialBeginTime;

    @TableField("ChanelNumInfo")
    private String ChanelNumInfo;

    @TableField("IsConnectCar")
    private Boolean IsConnectCar;

    @TableField("SupercargoName")
    private String SupercargoName;

    @TableField("SVRStartTime")
    private LocalDateTime SVRStartTime;

    @TableField("PPromptDays")
    private Integer PPromptDays;

    @TableField("OLWidth")
    private Integer OLWidth;

    @TableField("DVRUserPwd")
    private String DVRUserPwd;

    @TableField("ADASEquip")
    private Integer ADASEquip;

    @TableField("LineNature")
    private Integer LineNature;

    @TableField("OilBox1TypeId")
    private Integer OilBox1TypeId;

    @TableField("CarrierTime")
    private LocalDateTime CarrierTime;

    @TableField("ReadyDelete")
    private Integer ReadyDelete;

    @TableField("TerminalCode")
    private String TerminalCode;

    @TableField("DriverPromptDays")
    private Integer DriverPromptDays;

    @TableField("ConnectorName")
    private String ConnectorName;

    @TableField("IsServicePay")
    private Boolean IsServicePay;

    @TableField("DSMEquipId")
    private String DSMEquipId;

    @TableField("BSDEquip")
    private Integer BSDEquip;

    @TableField("IsInstallTemperature")
    private Boolean IsInstallTemperature;

    @TableField("CommercialEndTime")
    private LocalDateTime CommercialEndTime;

    @TableField("OperateTypeCode")
    private Integer OperateTypeCode;

    @TableField("VideoCommunicateID")
    private String VideoCommunicateID;

    @TableField("TerminalImeiNum")
    private String TerminalImeiNum;

    @TableField("FirstQualifyNo")
    private String FirstQualifyNo;

    @TableField("PropertyCompany")
    private String PropertyCompany;

    @TableField("OwnerName")
    private String OwnerName;

    @TableField("IsPayment")
    private String IsPayment;

    @TableField("TerminalTypeId")
    private Integer TerminalTypeId;

    @TableField("RunStatus")
    private String RunStatus;

    @TableField("RoadTPromptDays")
    private Integer RoadTPromptDays;

    @TableField("CorpContact")
    private String CorpContact;

    @TableField("GradeEvaluateEnd")
    private LocalDateTime GradeEvaluateEnd;

    @TableField("ApprovedLoad")
    private Integer ApprovedLoad;

    @TableField("OfflineSMSUsers")
    private String OfflineSMSUsers;

    @TableField("DSMEquip")
    private Integer DSMEquip;

    @TableField("VehicleColor")
    private String VehicleColor;

    @TableField("EngineNo")
    private String EngineNo;

    @TableField("UnitAddress")
    private String UnitAddress;

    @TableField("HomeAddress")
    private String HomeAddress;

    @TableField("LIDCardNo")
    private String LIDCardNo;

    @TableField("TrusteeshipTime")
    private LocalDateTime TrusteeshipTime;

    @TableField("CurrentTaskInfo")
    private String CurrentTaskInfo;

    @TableField("DriverLicenseNo")
    private String DriverLicenseNo;

    @TableField("TPMSEquip")
    private Integer TPMSEquip;

    @TableField("OwnerEmail")
    private String OwnerEmail;

    @TableField("LastLoginFailTime")
    private LocalDateTime LastLoginFailTime;

    @TableField("LiabilityEndTime")
    private LocalDateTime LiabilityEndTime;

    @TableField("OilBox2TypeId")
    private Integer OilBox2TypeId;

    @TableField("SIMRemark")
    private String SIMRemark;

    @TableField("CharteredCarETime")
    private LocalDateTime CharteredCarETime;

    @TableField("FactoryNum")
    private String FactoryNum;

    @TableField("DSMFacCardModel")
    private String DSMFacCardModel;

    @TableField("ConnectorQualifyNo")
    private String ConnectorQualifyNo;

    @TableField("PropertyNo")
    private String PropertyNo;

    @TableField("PaymentTime")
    private LocalDateTime PaymentTime;

    @TableField("LaborQualificationNo")
    private String LaborQualificationNo;

    @TableField("CameraNum")
    private Integer CameraNum;

    @TableField("CurrentRegion")
    private String CurrentRegion;

    @TableField("VclnumStart")
    private LocalDateTime VclnumStart;

    @TableField("VehicleModel")
    private String VehicleModel;

    @TableField("IsDenyWebGps")
    private Boolean IsDenyWebGps;

    @TableField("CarrierCompany")
    private String CarrierCompany;

    @TableField("Registration1")
    private byte[] Registration1;

    @TableField("DrivingLicenseBtime")
    private LocalDateTime DrivingLicenseBtime;

    @TableField("Installer")
    private String Installer;

    @TableField("ViFire")
    private Double ViFire;

    @TableField("ServerType")
    private Integer ServerType;

    @TableField("Arrears")
    private Boolean Arrears;

    @TableField("RecorderVersion")
    private String RecorderVersion;

    @TableField("TransportPermitStart")
    private LocalDateTime TransportPermitStart;

    @TableField("TPMSFacCardModel")
    private String TPMSFacCardModel;

    @TableField("FirstConnectorName")
    private String FirstConnectorName;

    @TableField("IsAdasSplit")
    private Boolean IsAdasSplit;

    @TableField("SecondUnitTel")
    private String SecondUnitTel;

    @TableField("OilBox3TypeId")
    private Integer OilBox3TypeId;

    @TableField("SupercargoPersonId")
    private String SupercargoPersonId;

    @TableField("InstallAdress")
    private String InstallAdress;

    @TableField("FactoryType")
    private String FactoryType;

    @TableField("SupercargoTel")
    private String SupercargoTel;

    @TableField("TerminalModel")
    private String TerminalModel;

    @TableField("TIDeadline")
    private LocalDateTime TIDeadline;

    @TableField("PropertyClaimInfo")
    private String PropertyClaimInfo;

    @TableField("ADASFacCardModel")
    private String ADASFacCardModel;

    @TableField("CPromptDays")
    private Integer CPromptDays;

    @TableField("IsOpenOfflineAlarm")
    private Boolean IsOpenOfflineAlarm;

    @TableField("Servicer")
    private String Servicer;

    @TableField("ConnectTele")
    private String ConnectTele;

    @TableField("CorpName")
    private String CorpName;

    @TableField("VehicleSource")
    private String VehicleSource;

    @TableField("ProductDate")
    private LocalDateTime ProductDate;

    @TableField("CorpTel")
    private String CorpTel;

    @TableField("ServicePayTime")
    private LocalDateTime ServicePayTime;

    @TableField("BusinessNo")
    private String BusinessNo;

    @TableField("Salersman")
    private String Salersman;

    @TableField("LineCode")
    private Integer LineCode;

    @TableField("BSDFacCardModel")
    private String BSDFacCardModel;

    @TableField("CarVinNo")
    private String CarVinNo;

    @TableField("DVRChannelNum")
    private Integer DVRChannelNum;

    @TableField("IsInstallPosAndNeg")
    private Boolean IsInstallPosAndNeg;

    @TableField("InstallTime")
    private LocalDateTime InstallTime;

    @TableField("CarrierClaimInfo")
    private String CarrierClaimInfo;

    @TableField("Seats")
    private Integer Seats;

    @TableField("Sex")
    private Integer Sex;

    @TableField("MaintenanceLastTime")
    private LocalDateTime MaintenanceLastTime;

    @TableField("TIPromptDays")
    private Integer TIPromptDays;

    @TableField("OweFile")
    private Boolean OweFile;

    @TableField("TractionQuality")
    private Integer TractionQuality;

    @TableField("ManageDep")
    private String ManageDep;

    @TableField("RoadTransPortId")
    private String RoadTransPortId;

    @TableField("Insurance")
    private String Insurance;

    @TableField("DriverLicenseBeginTime")
    private LocalDateTime DriverLicenseBeginTime;

    @TableField("SimNum3G")
    private String SimNum3G;

    @TableField("OwnerRemark")
    private String OwnerRemark;

    @TableField("Line")
    private String Line;

    @TableField("CarIdentifyCode")
    private String CarIdentifyCode;

    @TableField("LiabilityCompany")
    private String LiabilityCompany;

    @TableField("LoginFailCount")
    private Integer LoginFailCount;

    @TableField("UnitTel")
    private String UnitTel;

    @TableField("OilMeterTypeId")
    private Integer OilMeterTypeId;

    @TableField("PathMsg")
    private String PathMsg;

    @TableField("VideoServerIP")
    private String VideoServerIP;

    @TableField("RealSimNum")
    private String RealSimNum;

    @TableField("FirstConnectID")
    private String FirstConnectID;

    @TableField("SVREndTime")
    private LocalDateTime SVREndTime;

    @TableField("AnnualCheckDeadline")
    private LocalDateTime AnnualCheckDeadline;

    @TableField("LaborQualificationAddr")
    private String LaborQualificationAddr;

    @TableField("PassWord")
    private String PassWord;

    @TableField("OLHeight")
    private Integer OLHeight;

    @TableField("ThirdEquipment")
    private Integer ThirdEquipment;

    @TableField("RegisterTime")
    private LocalDateTime RegisterTime;

    @TableField("NickName")
    private String NickName;

    @TableField("VclnumEnd")
    private LocalDateTime VclnumEnd;

    @TableField("Registration2")
    private byte[] Registration2;

    @TableField("CarrierNo")
    private String CarrierNo;

    @TableField("DriverVehicleId")
    private String DriverVehicleId;

    @TableField("DrivingLicenseEtime")
    private LocalDateTime DrivingLicenseEtime;

    @TableField("TIContractor")
    private String TIContractor;

    @TableField("TransportPermitEnd")
    private LocalDateTime TransportPermitEnd;

    @TableField("TPMSFactoryName")
    private String TPMSFactoryName;

    @TableField("FirstConnectTele")
    private String FirstConnectTele;

    @TableField("AllowDriveCarType")
    private String AllowDriveCarType;

    @TableField("PreOrgId")
    private Integer PreOrgId;

    @TableField("ADASEquipId")
    private String ADASEquipId;

    @TableField("SecondUnitCall")
    private String SecondUnitCall;

    @TableField("CommercialCompany")
    private String CommercialCompany;

    @TableField("InstallName")
    private String InstallName;

    @TableField("SupercargoQuaSort")
    private String SupercargoQuaSort;

    @TableField("InstallUnit")
    private Integer InstallUnit;


    @Override
    protected Serializable pkVal() {
        return this.VehicleId;
    }

}
