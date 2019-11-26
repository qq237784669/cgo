package com.cgo.db.service.web_module.login;


import com.alibaba.dubbo.config.annotation.Service;
import com.cgo.api.pojo.login_module.login.*;
import com.cgo.api.service.web_module.user.IUserService;
import com.cgo.common.response.ResponseResult;
import com.cgo.common.utlis.EncryptionUtil;

import com.cgo.db.entity.login.GlobalConfig;
import com.cgo.db.mapper.svc.web_module.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class UserService implements IUserService {
    /**
     * 用户登录默认的返回   常量
     */
    @Autowired
    private GlobalConfig globalConfig;



    @Autowired
    private UserMapper userMapper;



    public ResponseResult login(LoginRequest loginRequest)  {
        ResponseResult responseResult = new ResponseResult();
        LoginResponse loginResponse=null;


            String userId = loginRequest.getUserId();
            String password = loginRequest.getPassword();
            String userType = loginRequest.getUserType();
            Integer mobileOs = loginRequest.getMobileOS();
            String platformType = loginRequest.getPlatformType();
            String bdTokenId = loginRequest.getBdTokenId();
            String bdChannelId = loginRequest.getBdChannelId();
            String imei = loginRequest.getImei();



            if (platformType != null && !platformType.isEmpty() && platformType.equals("top6")) {
                responseResult.setCommonResponse(LoginCode.FAIL_1);
                if (mobileOs != null && mobileOs == 0) {
                    responseResult.setData(globalConfig.getAndroidTop6AppDownloadUrl());
                } else if (mobileOs != null && mobileOs == 1) {
                    responseResult.setData(globalConfig.getIosTop6AppDownloadUrl());
                }
                return responseResult;
            }

            if (mobileOs != null && mobileOs == 0 && loginRequest.getAppVersionCode() < globalConfig.getMinApkVersionCode()) {
                return new ResponseResult(null,false,-10,globalConfig.getMinApkVersionCodeErrDesc());
            }

            if (userId == null || userId.isEmpty() || password == null || password.isEmpty()) {
                return new ResponseResult(null,false,-1,"请输入用户名/密码。");
            }

            /*
            （未翻译）
            日志处理
            判断云端授权情况
            */

            if (loginRequest.getBdTokenId() == null) {
                loginRequest.setBdTokenId("");
            }
            if (loginRequest.getBdChannelId() == null) {
                loginRequest.setBdChannelId("");
            }
            if (loginRequest.getImei() == null) {
                loginRequest.setImei("");
            }



        List<Map<String,String>> list=null;

            if ("0".equals(userType)){
                list = userMapper.findByUserTypeZero  (userId);
            }else {
                list=userMapper.findByUserTypeOne(userId);
            }


            if (list.size()>0 && !"0".equals(userType)){
                return new ResponseResult(null,false,-1,"您输入的号牌【XXXX】存在不同颜色的多辆车,请在车牌号码后加颜色重新登录,如:测A12345黄。");
            }
            // 获取登录用户信息
            //endregion

            if (!(list.size()>0) || !validPassword(loginRequest.getPassword(),list.get(0).get("UserPwd").toString()) ){
                return new ResponseResult(null,false,-1,"用户名/密码不正确。");
            }


            ///新加车辆登录是否有权限，根据IsDenyWebGps判断 0表示无权限
            if (userType.equals("1") && "0".equals(list.get(0).get("isDenyWebGps"))) {
                return new ResponseResult(null,false,-1,"该车辆没有权限。");
            }

            ///新加车辆登录判断是否到期自动冻结
            if (userType.equals("1") && "1".equals(list.get(0).get("IsStay"))) {
                return new ResponseResult(null,false,-1,"登录失败,车辆已到期冻结。");
            }

            boolean isUserAuth = false;

            List<Map<String, String>> userAuths = userMapper.findUserAuth(userId);

            //先判断有没有采用权限功能
            for (Map<String, String> userAuth : userAuths) {
                if ( !"0".equals(userAuth.get("isExist"))){
                    isUserAuth = true;
                    if (userAuth.get("hasModule").equals("0") && userType.equals("0")){
                        //采用权限功能的话，判断用户是否采用手机模块
                        return new ResponseResult(null,false,-1,"用户没有登录权限。");
                    }
                }
            }




            if (mobileOs != null && mobileOs != 3) {
//                CallableStatement cstmt = conn.prepareCall("{call dbo.spApp_ModifyMobOnLineUser(?, ?, ?, ?, ?, ?)}");
//                cstmt.setString(1, userId);
//                cstmt.setString(2, bdTokenId);
//                cstmt.setString(3, bdChannelId);
//                cstmt.setInt(4, mobileOs);
//                cstmt.setString(5, imei);
//                cstmt.setString(6, userType);
//                int rowsAffected = modifyMobOnLineUser(cstmt);
            }

            Map<String, String> userInfo = list.get(0);
            // 获取登录用户响应
            loginResponse = new LoginResponse();
            loginResponse.setUserId(userId);
            loginResponse.setUserType(userType);
            loginResponse.setUserName(userInfo.get("UserName"));
            loginResponse.setRoleName(userInfo.get("OrgId"));
            loginResponse.setOrgId(userInfo.get("OrgId"));
            loginResponse.setOrgName(userInfo.get("OrgName"));
            loginResponse.setAlarmType(userInfo.get("AlarmType"));
            loginResponse.setPlatformType("1");
            loginResponse.setSelectedCars(globalConfig.getSelectedCars());
            loginResponse.setHasVideoModule(globalConfig.getHasVideo());
            loginResponse.setHasVideoPush(globalConfig.getStartVideoAlarmPush());
            loginResponse.setServerVersion(globalConfig.getServerVersion());
            loginResponse.setAppMenuAuth(getAppMenuAuth(userId, userType, isUserAuth));
            loginResponse.setVehicleIconList(getVehicleIcons());

            if (userType.equals("1")) {
                loginResponse.setExpireDay("8");//车牌登录不判断过期默认8天
            } else {
                loginResponse.setExpireDay(userInfo.get("ExpiryDay").toString());
            }



            responseResult.setData(loginResponse);

            return responseResult;

    }

    @Override
    public List getVehicleList(String userId, String userType) {
        if ("0".equals(userType)){
            return userMapper.finVehicleListByUserTypeEqZero(userId);
        }else {
            return userMapper.finVehicleListByUserTypeEqOne(userId);
        }

    }

    private List<VehicleIcon> getVehicleIcons() {


        List<Map<String,String>> list=userMapper.findVehicleIcons();

        ArrayList<VehicleIcon> vehicleIconList = new ArrayList<>();

            for (Map<String,String> rs : list) {
                VehicleIcon vi = new VehicleIcon();
                vi.setIconType(rs.get("IconType"));
                vi.setIconName(rs.get("IconName"));
                vi.setIconOrder(rs.get("IconOrder"));
                vi.setOffline(rs.get("offline"));
                vi.setDrive_normal(rs.get("drive_normal"));
                vi.setDrive_alarm(rs.get("drive_alarm"));
                vi.setDrive_full(rs.get("drive_full"));
                vi.setDrive_operateoff(rs.get("drive_operateoff"));
                vi.setSpeed0_normal(rs.get("speed0_normal"));
                vi.setSpeed0_alarm(rs.get("speed0_alarm"));
                vi.setSpeed0_full(rs.get("speed0_full"));
                vi.setSpeed0_operateoff(rs.get("speed0_operateoff"));
                vi.setAccoff_normal(rs.get("accoff_normal"));
                vi.setAccoff_alarm(rs.get("accoff_alarm"));
                vi.setAccoff_full(rs.get("accoff_full"));
                vi.setAccoff_operateoff(rs.get("accoff_operateoff"));
                vi.setGpsinvalid_normal(rs.get("gpsinvalid_normal"));
                vi.setGpsinvalid_alarm(rs.get("gpsinvalid_alarm"));
                vi.setGpsinvalid_full(rs.get("gpsinvalid_full"));
                vi.setGpsinvalid_operateoff(rs.get("gpsinvalid_operateoff"));
                vehicleIconList.add(vi);
            }

        return vehicleIconList;
    }

    private AppMenuAuth getAppMenuAuth(String userId, String userType, boolean isUserAuth) {


        AppMenuAuth appMenuAuth = new AppMenuAuth();
        appMenuAuth.setDeviceConfig(globalConfig.getDeviceConfig());
        CustomConfig customConfig = new CustomConfig();
        appMenuAuth.setDeviceConfig(customConfig.isHasDeviceData() ? globalConfig.getDeviceConfig() : "0");

        if (!isUserAuth) {
            appMenuAuth.setNavAuth(true);
            appMenuAuth.setTrackAuth(true);
            appMenuAuth.setTakePicAuth(true);
            appMenuAuth.setGetPicAuth(true);
            appMenuAuth.setMileAuth(true);
            appMenuAuth.setFollowAuth(true);
            appMenuAuth.setDetailAuth(true);
            appMenuAuth.setVideoAuth(true);
            appMenuAuth.setGetHistoryPicAuth(true);
            appMenuAuth.setSwitchCustomerAuth(true);
            appMenuAuth.setAlarmSetAuth(true);
            appMenuAuth.setPushSetAuth(true);
            appMenuAuth.setAdasPushSetAuth(false);
            appMenuAuth.setIsWorkAuth(false);
        } else {
            //用户登录
            if (userType.equals("0")) {
                    List<Map<String, String>> list = userMapper.call_spApp_GetNavMenuAuthByUser(userId);

//                    conn = jdbcUtil.getConnection();
//                    pstmt = conn.prepareStatement("{call dbo.spApp_GetNavMenuAuthByUser(?)}");
//                    pstmt.setString(1, userId);

                    for (Map<String, String> rs : list) {

                        String navUserMenuAuth = rs.get("navUserMenuAuth");
                        String navRoleMenuAuth = rs.get("navRoleMenuAuth");
                        if (navUserMenuAuth.equals("R") || navRoleMenuAuth.equals("R")) {
                            appMenuAuth.setNavAuth(true);
                        } else {
                            appMenuAuth.setNavAuth(false);
                        }

                        String trackUserMenuAuth = rs.get("trackUserMenuAuth");
                        String trackRoleMenuAuth = rs.get("trackRoleMenuAuth");
                        if (trackUserMenuAuth.equals("R") || trackRoleMenuAuth.equals("R")) {
                            appMenuAuth.setTrackAuth(true);
                        } else {
                            appMenuAuth.setTrackAuth(false);
                        }

                        String takePicUserMenuAuth = rs.get("takePicUserMenuAuth");
                        String takePicRoleMenuAuth = rs.get("takePicRoleMenuAuth");
                        if (takePicUserMenuAuth.equals("RH") || takePicRoleMenuAuth.equals("RH")) {
                            appMenuAuth.setTakePicAuth(true);
                            appMenuAuth.setGetPicAuth(true);
                        } else if (takePicUserMenuAuth.equals("R") || takePicRoleMenuAuth.equals("R")) {
                            appMenuAuth.setTakePicAuth(true);
                            appMenuAuth.setGetPicAuth(false);
                        } else if (takePicUserMenuAuth.equals("H") || takePicRoleMenuAuth.equals("H")) {
                            appMenuAuth.setTakePicAuth(false);
                            appMenuAuth.setGetPicAuth(true);
                        } else {
                            appMenuAuth.setTakePicAuth(false);
                            appMenuAuth.setGetPicAuth(false);
                        }

                        String detailUserMenuAuth = rs.get("detailUserMenuAuth");
                        String detailRoleMenuAuth = rs.get("detailRoleMenuAuth");
                        if (detailUserMenuAuth.equals("R") || detailRoleMenuAuth.equals("R")) {
                            appMenuAuth.setDetailAuth(true);
                        } else {
                            appMenuAuth.setDetailAuth(false);
                        }

                        String mileUserMenuAuth = rs.get("mileUserMenuAuth");
                        String mileRoleMenuAuth = rs.get("mileRoleMenuAuth");
                        if (mileUserMenuAuth.equals("R") || mileRoleMenuAuth.equals("R")) {
                            appMenuAuth.setMileAuth(true);
                        } else {
                            appMenuAuth.setMileAuth(false);
                        }

                        String followUserMenuAuth = rs.get("followUserMenuAuth");
                        String followRoleMenuAuth = rs.get("followRoleMenuAuth");
                        if (followUserMenuAuth.equals("R") || followRoleMenuAuth.equals("R")) {
                            appMenuAuth.setFollowAuth(true);
                        } else {
                            appMenuAuth.setFollowAuth(false);
                        }

                        String videoUserMenuAuth = rs.get("videoUserMenuAuth");
                        String videoRoleMenuAuth = rs.get("videoRoleMenuAuth");
                        if (videoUserMenuAuth.equals("RH") || videoRoleMenuAuth.equals("RH")) {
                            appMenuAuth.setVideoAuth(true);
                            appMenuAuth.setGetHistoryPicAuth(true);
                        } else if (videoUserMenuAuth.equals("R") || videoRoleMenuAuth.equals("R")) {
                            appMenuAuth.setVideoAuth(true);
                            appMenuAuth.setGetHistoryPicAuth(false);
                        } else if (videoUserMenuAuth.equals("H") || videoRoleMenuAuth.equals("H")) {
                            appMenuAuth.setVideoAuth(false);
                            appMenuAuth.setGetHistoryPicAuth(true);
                        } else {
                            appMenuAuth.setVideoAuth(false);
                            appMenuAuth.setGetHistoryPicAuth(false);
                        }

                        String switchCustomerUserMenuAuth = rs.get("switchCustomerUserMenuAuth");
                        String switchCustomerRoleMenuAuth = rs.get("switchCustomerRoleMenuAuth");
                        if (switchCustomerUserMenuAuth.equals("R") || switchCustomerRoleMenuAuth.equals("R")) {
                            appMenuAuth.setSwitchCustomerAuth(true);
                        } else {
                            appMenuAuth.setSwitchCustomerAuth(false);
                        }

                        String alarmSetUserMenuAuth = rs.get("alarmSetUserMenuAuth");
                        String alarmSetRoleMenuAuth = rs.get("alarmSetRoleMenuAuth");
                        if (alarmSetUserMenuAuth.equals("R") || alarmSetRoleMenuAuth.equals("R")) {
                            appMenuAuth.setAlarmSetAuth(true);
                        } else {
                            appMenuAuth.setAlarmSetAuth(false);
                        }

                        String pushSetUserMenuAuth = rs.get("pushSetUserMenuAuth");
                        String pushSetRoleMenuAuth = rs.get("pushSetRoleMenuAuth");
                        if (pushSetUserMenuAuth.equals("R") || pushSetRoleMenuAuth.equals("R")) {
                            appMenuAuth.setPushSetAuth(true);
                        } else {
                            appMenuAuth.setPushSetAuth(false);
                        }

                        String adadPushSetUserMenuAuth = rs.get("adasPushSetUserMenuAuth");
                        String adasPushSetRoleMenuAuth = rs.get("adasPushSetRoleMenuAuth");
                        if (adadPushSetUserMenuAuth.equals("R") || adasPushSetRoleMenuAuth.equals("R")) {
                            appMenuAuth.setAdasPushSetAuth(true);
                        } else {
                            appMenuAuth.setAdasPushSetAuth(false);
                        }

                        String basicSurveySetUserMenuAuth = rs.get("basicsurveySetUserMenuAuth");
                        String basicSurveySetRoleMenuAuth = rs.get("basicsurveySetRoleMenuAuth");
                        if (basicSurveySetUserMenuAuth.equals("R") || basicSurveySetRoleMenuAuth.equals("R")) {
                            appMenuAuth.setBasicSurveryAuth(true);
                        } else {
                            appMenuAuth.setBasicSurveryAuth(false);
                        }
                    }


                }
             else {
                // 车牌登录
                    List<Map<String,String>> list=userMapper.call_spApp_GetNavMenuAuthByPlateNum(userId);
//                    conn = jdbcUtil.getConnection();
//                    pstmt = conn.prepareStatement("{call dbo.spApp_GetNavMenuAuthByPlateNum(?)}");
//                    pstmt.setString(1, userId);
                    int rowsCnt = 0;
//                    rs = pstmt.executeQuery();
                    for (Map<String,String> rs : list) {
                        rowsCnt++;
                        if (rs.get("isExit") == "0") {
                            appMenuAuth.setNavAuth(true);
                            appMenuAuth.setTrackAuth(true);
                            appMenuAuth.setTakePicAuth(false);
                            appMenuAuth.setGetPicAuth(false);
                            appMenuAuth.setMileAuth(true);
                            appMenuAuth.setFollowAuth(false);
                            appMenuAuth.setDetailAuth(true);
                            appMenuAuth.setVideoAuth(false);
                            appMenuAuth.setGetHistoryPicAuth(false);
                            appMenuAuth.setSwitchCustomerAuth(true);
                            appMenuAuth.setAlarmSetAuth(false);
                            appMenuAuth.setPushSetAuth(true);
                            appMenuAuth.setAdasPushSetAuth(false);
                            appMenuAuth.setBasicSurveryAuth(false);
                        } else {
                            if (rs.get("NavAuth").equals("R")) {
                                appMenuAuth.setNavAuth(true);
                            } else {
                                appMenuAuth.setNavAuth(false);
                            }

                            if (rs.get("GetTrackAuth").equals("R")) {
                                appMenuAuth.setTrackAuth(true);
                            } else {
                                appMenuAuth.setTrackAuth(false);
                            }

                            if (rs.get("DetailAuth").equals("R")) {
                                appMenuAuth.setDetailAuth(true);
                            } else {
                                appMenuAuth.setDetailAuth(false);
                            }

                            if (rs.get("MileAuth").equals("R")) {
                                appMenuAuth.setMileAuth(true);
                            } else {
                                appMenuAuth.setMileAuth(false);
                            }

                            if (rs.get("FollowAuth").equals("R")) {
                                appMenuAuth.setFollowAuth(true);
                            } else {
                                appMenuAuth.setFollowAuth(false);
                            }

                            if (rs.get("VideoAuth").equals("RH")) {
                                appMenuAuth.setVideoAuth(true);
                                appMenuAuth.setGetHistoryPicAuth(true);

                            } else if (rs.get("VideoAuth").equals("R")) {
                                appMenuAuth.setVideoAuth(true);
                                appMenuAuth.setGetHistoryPicAuth(false);
                            } else if (rs.get("VideoAuth").equals("H")) {
                                appMenuAuth.setVideoAuth(false);
                                appMenuAuth.setGetHistoryPicAuth(true);
                            } else {
                                appMenuAuth.setVideoAuth(false);
                                appMenuAuth.setGetHistoryPicAuth(false);
                            }

                            if (rs.get("SwitchCusAuth").equals("R")) {
                                appMenuAuth.setSwitchCustomerAuth(true);
                            } else {
                                appMenuAuth.setSwitchCustomerAuth(false);
                            }

                            if (rs.get("AlarmSetAuth").equals("R")) {
                                appMenuAuth.setAlarmSetAuth(true);
                            } else {
                                appMenuAuth.setAlarmSetAuth(false);
                            }

                            if (rs.get("PushSetAuth").equals("R")) {
                                appMenuAuth.setPushSetAuth(true);
                            } else {
                                appMenuAuth.setPushSetAuth(false);
                            }

                            if (rs.get("TakePicAuth").equals("RH")) {
                                appMenuAuth.setTakePicAuth(true);
                                appMenuAuth.setGetPicAuth(true);
                            } else if (rs.get("TakePicAuth").equals("R")) {
                                appMenuAuth.setTakePicAuth(true);
                                appMenuAuth.setGetPicAuth(false);
                            } else if (rs.get("TakePicAuth").equals("H")) {
                                appMenuAuth.setTakePicAuth(false);
                                appMenuAuth.setGetPicAuth(true);
                            } else {
                                appMenuAuth.setTakePicAuth(false);
                                appMenuAuth.setGetPicAuth(false);
                            }

                            appMenuAuth.setAdasPushSetAuth(false);
                            if (rs.get("BasicsurveyAuth").equals("R")) {
                                appMenuAuth.setBasicSurveryAuth(true);
                            } else {
                                appMenuAuth.setBasicSurveryAuth(false);
                            }
                        }
                    }

                    if (rowsCnt == 0) {
                        appMenuAuth.setNavAuth(true);
                        appMenuAuth.setTrackAuth(true);
                        appMenuAuth.setTakePicAuth(false);
                        appMenuAuth.setGetPicAuth(false);
                        appMenuAuth.setMileAuth(true);
                        appMenuAuth.setFollowAuth(false);
                        appMenuAuth.setDetailAuth(true);
                        appMenuAuth.setVideoAuth(false);
                        appMenuAuth.setGetHistoryPicAuth(false);
                        appMenuAuth.setSwitchCustomerAuth(true);
                        appMenuAuth.setAlarmSetAuth(false);
                        appMenuAuth.setPushSetAuth(true);
                        appMenuAuth.setAdasPushSetAuth(false);
                        appMenuAuth.setBasicSurveryAuth(false);
                    }

            }
        }

        if (!customConfig.getCusModule().contains("TopActiveSafety")) {
            appMenuAuth.setAdasPushSetAuth(false);
        }

        // 单独判断是否有查岗功能
        if (globalConfig.getIsCheckWork().equals("1") && userType.equals("0")) {
            List<Map<String,String>> list=userMapper.call_spApp_IsWorkMenuAuth(userId);
                if (list.size()>0) {
                    Map<String,String> rs=list.get(0);
                    if (rs.get("isWorkMenuAuth").equals("R") ||
                            rs.get("isWorkRoleMenuAuth").equals("R")) {
                        appMenuAuth.setIsWorkAuth(true);
                    } else {
                        appMenuAuth.setIsWorkAuth(false);
                    }
                }

        } else {
            appMenuAuth.setIsWorkAuth(false);
        }

        return appMenuAuth;
    }

    private String buildGetUserLoginInfoSqlText(String userType) {
        StringBuffer sqlTextSb = new StringBuffer();

        // 判断是用户登录还是车牌号登录
        if (userType.equals("0")) {
            sqlTextSb.append("SELECT u.UserId, ");
            sqlTextSb.append("       u.UserPwd, ");
            sqlTextSb.append("       u.UserName, ");
            sqlTextSb.append("       g.RoleName, ");
            sqlTextSb.append("       o.OrgId, ");
            sqlTextSb.append("       o.OrgName, ");
            sqlTextSb.append("       Isnull(B.AlarmType, -1) AS AlarmType, ");
            sqlTextSb.append("       ExpiryDay=( CASE ");
            sqlTextSb.append("                     WHEN u.ExpiryDate IS NULL ");
            sqlTextSb.append("                           OR u.ExpiryDate = '' THEN 8 ");
            sqlTextSb.append("                     ELSE ( CASE ");
            sqlTextSb.append("                              WHEN Datediff(MINUTE, Getdate(), u.ExpiryDate) >= 0 THEN Datediff(day, Getdate(), u.ExpiryDate) ");
            sqlTextSb.append("                              ELSE -1 ");
            sqlTextSb.append("                            END ) ");
            sqlTextSb.append("                   END ), ");
            sqlTextSb.append("       IsStay=0 ");
            sqlTextSb.append("FROM   sys_User u ");
            sqlTextSb.append("       INNER JOIN sys_Role g ");
            sqlTextSb.append("               ON u.RoleId = g.RoleId ");
            sqlTextSb.append("       LEFT JOIN bas_Org o ");
            sqlTextSb.append("              ON u.OrgId = o.OrgId ");
            sqlTextSb.append("       LEFT JOIN biz_MobUserConfig B ");
            sqlTextSb.append("              ON u.UserId = B.UserId ");
            sqlTextSb.append("WHERE  u.UserId = ? ");
        } else {
            sqlTextSb.append("SELECT v.PlateNum   AS UserId, ");
            sqlTextSb.append("       v.[PassWord] AS UserPwd, ");
            sqlTextSb.append("       v.OwnerName  AS UserName, ");
            sqlTextSb.append("       v.CorpName   AS RoleName, ");
            sqlTextSb.append("       o.OrgId, ");
            sqlTextSb.append("       o.OrgName, ");
            sqlTextSb.append("       -1           AS AlarmType, ");
            sqlTextSb.append("       IsDenyWebGps=( CASE ");
            sqlTextSb.append("                        WHEN v.IsDenyWebGps = 1 THEN 1 ");
            sqlTextSb.append("                        ELSE 0 ");
            sqlTextSb.append("                      END ), ");
            sqlTextSb.append("       IsStay=( CASE ");
            sqlTextSb.append("                  WHEN v.IsAutoStay = 1 ");
            sqlTextSb.append("                       AND v.SVREndTime < CONVERT(VARCHAR(10), Getdate(), 120) THEN 1 ");
            sqlTextSb.append("                  ELSE 0 ");
            sqlTextSb.append("                END ) ");
            sqlTextSb.append("FROM   bas_Vehicle v ");
            sqlTextSb.append("       INNER JOIN bas_Org o ");
            sqlTextSb.append("               ON v.OrgId = o.OrgId ");
            sqlTextSb.append("       LEFT JOIN std_PlateColor c ");
            sqlTextSb.append("              ON v.ColorCode = c.ColorCode ");
            sqlTextSb.append("WHERE  v.PlateNum = ? ");
            sqlTextSb.append("        OR v.PlateNum + ( CASE ");
            sqlTextSb.append("                            WHEN c.ColorCode <> 9 THEN LEFT(c.ColorName, 1) ");
            sqlTextSb.append("                            ELSE c.ColorName ");
            sqlTextSb.append("                          END ) = ? ");
        }

        return sqlTextSb.toString();
    }

    private String buildGetUserAuthSqlText() {
        StringBuffer sqlTextSb = new StringBuffer();
        sqlTextSb.append("SELECT isExist=( Isnull((SELECT MaxAuth ");
        sqlTextSb.append("                         FROM   sys_Menu ");
        sqlTextSb.append("                         WHERE  MenuCode = 'GetTrackAuth'), '0') ), ");
        sqlTextSb.append("       hasModule=( Isnull((SELECT ModuleCode ");
        sqlTextSb.append("                           FROM   sys_UserAuth_Module ");
        sqlTextSb.append("                           WHERE  UserId = ? ");
        sqlTextSb.append("                                  AND ModuleCode = 'TopMobile'), '0') ) ");
        return sqlTextSb.toString();
    }



    private int modifyMobOnLineUser(CallableStatement cstmt) {
        int rowsAffected = 0;
        try {
            cstmt.execute();
            rowsAffected = cstmt.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }


    /**
     * 验证用户输入的密码
     *
     * @param inputPwd
     * @param dbPwd
     * @return
     */
    private boolean validPassword(String inputPwd, String dbPwd) {
        return inputPwd.equals(dbPwd)
                || EncryptionUtil.encrypByMD5(inputPwd).equals(dbPwd);
    }
}
