package com.cgo.db.service.web_module.vehicle;


import com.alibaba.dubbo.config.annotation.Service;
import com.cgo.api.service.web_module.vehicle.IVehicleService;
import com.cgo.common.utlis.EncryptionUtil;
import com.cgo.common.utlis.RedisUtil;
import com.cgo.db.mapper.web_module.user.UserMapper;
import com.cgo.entity.login_module.login.pojo.AppMenuAuth;
import com.cgo.entity.login_module.login.pojo.CustomConfig;
import com.cgo.entity.login_module.login.pojo.GlobalConfig;
import com.cgo.entity.login_module.login.pojo.VehicleIcon;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


@Slf4j
@Service
public class VehicleService implements IVehicleService {
    /**
     * 用户登录默认的返回   常量
     */
    @Autowired
    private GlobalConfig globalConfig;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;


    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    // 获取 车辆定位 计数器
    private ThreadLocal<Integer> vehiclePositioningCount=new ThreadLocal<>();

    @Override
    public List getVehicleList(String userId, String userType) {
        if ("0".equals(userType)) {
            // 查询出所有组织列表
            List<Map<String, Object>> organizationList = userMapper.findOrganizationListByUserTypeEqZero(userId);
            // 查询出所有车辆列表
            List<Map<String, Object>> vehicleList = userMapper.findVehicleListByUserTypeEqZero(userId);
            //查询到所有一级节点
            List<Map<String, Object>> levelOneNode = organizationList.stream().filter(item -> "0".equals(item.get("ParentId").toString())).collect(Collectors.toList());

            List<Map<String, Object>> nodeAll = new ArrayList<>();
            // 分段查找出所有 一级节点的 所有子节点
            for (Map<String, Object> map : levelOneNode) {
                this.findChildNode(map, organizationList, userId, vehicleList);

                // 当前map 为一级切点 递归完成后 查询出所有 子节点的map
                nodeAll.add(map);
            }
            return nodeAll;
        } else {
            return userMapper.findVehicleListByUserTypeEqOne(userId);
        }
    }




    @Override
    public List getVehiclePositioningList(String[] vehicleIdList) {

        RLock lock = redissonClient.getLock("vehiclePositioning");
        boolean state=false;

        try {
            state = lock.tryLock(2L, 10L, TimeUnit.SECONDS);

            if (state){
                List<String> vehicleIdListCache = redisTemplate.opsForList().range("vehicleIdList", 0, -1);

                // 过滤
                List<String> filterPostIdList = vehicleIdListCache.stream().filter(item -> {
                    for (String vehicleId : vehicleIdList) {
                        if (vehicleId.equals(item)){
                            return true;
                        }
                    }
                    return false;
                }).collect(Collectors.toList());

                return  redisUtil.getMapInKeysForList("vehiclePositioningList", filterPostIdList);

            }else {

                Integer count = vehiclePositioningCount.get();
                if (count==null) {
                    vehiclePositioningCount.set(1);
                }else {
                    vehiclePositioningCount.set(  vehiclePositioningCount.get()+1 );
                }
                if (vehiclePositioningCount.get() < 10)
                     getVehiclePositioningList(vehicleIdList);

            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (state){
                lock.unlock();
            }
        }


        return null;
    }

    /**
     * @param node             一级节点
     * @param organizationList
     * @param userId
     * @param vehicleList      车辆列表
     */
    private void findChildNode(Map<String, Object> node, List<Map<String, Object>> organizationList, String userId, List<Map<String, Object>> vehicleList) {
        node.remove("SearchCode");
        node.remove("OrgType");

        String orgName = node.remove("OrgName").toString();
        String orgId = node.remove("OrgId").toString();
        String parentId = node.remove("ParentId").toString();

        node.put("id", orgId);
        node.put("name", orgName);

        //获取节点 id
        // String nodeId=node.get("OrgId").toString();
        //查找出 当前节点的下一级 节点
        List<Map<String, Object>> childNode = organizationList.stream().filter(item -> {
                    Object parentId1 = item.get("ParentId");
                    if (parentId1 != null) {
                        return parentId1.toString().equals(orgId);
                    }
                    return false;
                }
        ).collect(Collectors.toList());

        // 如果 下级节点 存在 则 添加到 上级节点的子节点中
        if (childNode.size() > 0) {
            node.put("children", childNode);
        }
        //如果不存在  代表当前节点是叶子节点那么查询 出车牌号信息然后retrun
        else {
            //根据节点OrgId  查询 对应的 车辆信息的车牌号

            List<Map<String, Object>> vehicleListConvert = new ArrayList<>();
            for (Map<String, Object> map : vehicleList) {

                String vehicleOrgId = map.get("OrgId").toString();
                if (orgId.equals(vehicleOrgId)) {
                    Map<String, Object> vehicleNode = new HashMap<>();
                    vehicleNode.put("id", map.get("VehicleId"));
                    vehicleNode.put("name", map.get("PlateNum"));
                    vehicleNode.put("orgId", map.get("OrgId"));
                    vehicleNode.put("vehicleType", map.get("VehicleTypeName"));
                    vehicleNode.put("simNum", map.get("SimNum"));
                    vehicleNode.put("isOnline", map.get("IsOnline"));
                    vehicleNode.put("hasCamera", "1");
                    vehicleNode.put("dvrDeviceId", map.get("DVRDeviceId"));
                    vehicleNode.put("searchCode", map.get("SearchCode"));
                    vehicleNode.put("terminalType", map.get("TerminalTypeName"));

                    if ("999".equals(map.get("DVRTypeCode").toString()) && "1".equals(globalConfig.getHasVideo())) {
                        vehicleNode.put("dvrChannelNum", map.get("DVRChannelNum"));
                    } else {
                        vehicleNode.put("dvrChannelNum", "0");
                    }

                    vehicleNode.put("chanelNumInfo", null); //未翻译
                    if (map.get("VehicleOfflineTimeOut") != null) {
                        vehicleNode.put("vehicleOfflineTimeOut", map.get("VehicleOfflineTimeOut"));
                    }

                    vehicleNode.put("receTime", "");
                    vehicleListConvert.add(vehicleNode);
                }
            }

            if (vehicleListConvert.size() > 0)
                node.put("children", vehicleListConvert);

            return;
        }

        // 遍历所有节点  递归查询 下级节点
        for (Map<String, Object> map : childNode) {
            findChildNode(map, organizationList, userId, vehicleList);
        }
    }
}
