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

@RestController("/api/v1/user")
public class UserController implements IUserController {

}
