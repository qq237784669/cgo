package com.cgo.login.controller;


import com.alibaba.fastjson.JSON;
import com.cgo.api.controller.login_module.logo.IUserLoginController;
import com.cgo.common.utlis.ResponseUtil;
import com.cgo.entity.login_module.login.request.LoginRequest;
import com.cgo.common.response.CommonCode;
import com.cgo.common.response.ResponseResult;
import com.cgo.login.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserLoginController implements IUserLoginController {

    @Autowired
    LoginService loginService;

    // 登录接口
    @RequestMapping("/login")
    public ResponseResult login( @RequestBody LoginRequest loginRequest){
        System.out.println(loginRequest);
        ResponseResult responseResult = new ResponseResult();
        Map data=new HashMap();

        String access_token = loginService.login(loginRequest);
//        if (StringUtils.isBlank(access_token)){
//            responseResult.setCommonResponse(CommonCode.FAILURE);
//        }else {
//            String claims = JwtHelper.decode(access_token).getClaims();
//            data.put("userInfo", JSON.parseObject(claims,Map.class));
//        }
        System.out.println(access_token);
        data.put("access_token",StringUtils.isBlank(access_token)? "":access_token);

        responseResult.setData(data);
        return responseResult;
    }
    @RequestMapping("/logout")
    public ResponseResult logout(@RequestBody LoginRequest loginRequest){
        loginService.logout(loginRequest);
        return new ResponseResult().setData("");
    }


    // 将jwt 转换为  用户信息 接口
    @RequestMapping("/getUserInfo")
    public ResponseResult getUserInfo(@RequestBody Map<String,String> map){
        ResponseResult responseResult =new ResponseResult();

        String access_token = map.get("access_token");
        Jwt decode = JwtHelper.decode(access_token);
        String data = decode.getClaims();
        Map result = JSON.parseObject(data, Map.class);
        result.remove("jti");
        result.remove("exp");
        responseResult.setData(result);

        return responseResult;
    }



}
