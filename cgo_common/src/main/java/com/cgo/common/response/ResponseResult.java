package com.cgo.common.response;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一的返回响应 格式
 */
@Data
@AllArgsConstructor
public class ResponseResult implements Serializable {
    //操作是否成功
    private boolean success;

    //操作代码
    private int code;

    //提示信息
    private String message;

    private Object data;

    public ResponseResult(Object data, ResultCode resultCode) {
        setCommonResponse(resultCode);
        this.data=data;
    }

    public ResponseResult() {
        setCommonResponse(CommonCode.SUCCESS);
    }

    public void setCommonResponse(ResultCode resultCode) {
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult success() {
        return new ResponseResult(null, CommonCode.SUCCESS);
    }

    public static ResponseResult fail() {
        return new ResponseResult(null, CommonCode.FAILURE);
    }
}
