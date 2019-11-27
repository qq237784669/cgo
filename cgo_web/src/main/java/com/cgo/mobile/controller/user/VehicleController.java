package com.cgo.mobile.controller.user;


import com.alibaba.dubbo.config.annotation.Reference;
import com.cgo.api.controller.web_module.user.IUserController;
import com.cgo.api.service.web_module.user.IUserService;
import com.cgo.common.exception.CustomException;
import com.cgo.common.response.CommonCode;
import com.cgo.common.response.ResponseResult;


import com.cgo.common.utlis.ResponseUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController("/api/v1/vehicle")
public class VehicleController implements IUserController {


    @Reference
    IUserService iUserService;


    @RequestMapping("/getVehicleList")
    public ResponseResult findList(@RequestBody Map<String, String> param) {
        String userId = param.get("userId");
        String userType = param.get("userType");

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userType)) {
            throw new CustomException(CommonCode.INVALID_PARAM);
        }

        List list = iUserService.getVehicleList(userId, userType);
        return new ResponseResult(ResponseUtil.put("orgList", list), CommonCode.SUCCESS);
    }
}
