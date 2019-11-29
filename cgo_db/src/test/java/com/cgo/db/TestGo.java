package com.cgo.db;

import com.alibaba.fastjson.JSON;
import com.cgo.db.mapper.web_module.vehicle.VehicleMapper;
import com.cgo.entity.login_module.login.request.LoginRequest;
import com.cgo.api.service.web_module.user.IUserService;
import com.cgo.db.mapper.AaMapper;
import com.cgo.db.mapper.web_module.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbStart.class})// 指定启动类
@Slf4j
public class TestGo {


    @Autowired
    private VehicleMapper vehicleMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    private IUserService userService;
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Autowired
//    private AaMapper aaMapper;


    @Test
    public void test2(){
    }

    @Test
    public void test1(){

//        LoginRequest loginRequest = JSON.parseObject("{\n" +
//                "\t\"userId\":\"admin\",\n" +
//                "    \"userType\":\"0\",\n" +
//                "    \"password\":\"670B14728AD9902AECBA32E22FA4F6BD\",\n" +
//                "    \"imei\":\"\",\n" +
//                "    \"appVersionCode\":27,\n" +
//                "    \"bdChannelId\":\"\",\n" +
//                "\t\"bdTokenId\":\"\",\n" +
//                "    \"platformType\":\"\",\n" +
//                "\t\"mobileOs\":\"\"\n" +
//                "}", LoginRequest.class);
//
//        System.out.println(userService.login(loginRequest));

    }


    @Test
    public void test3(){

    }


}
