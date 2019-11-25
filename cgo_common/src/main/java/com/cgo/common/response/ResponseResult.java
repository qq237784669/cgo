package com.cgo.common.response;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一的返回响应 格式
 */
@Data
@AllArgsConstructor
public class ResponseResult implements Serializable {

    private Object data;

    //操作是否成功
    boolean success;

    //操作代码
    int code;

    //提示信息
    String message;


    public ResponseResult(Object data, ResultCode resultCode){
        setCommonRespones(resultCode);
        this.data=data;
    }
    public ResponseResult(){
       setCommonRespones(CommonCode.SUCCESS);
    }

    public void setCommonRespones(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }


    public static ResponseResult success(){
        return new ResponseResult(null,CommonCode.SUCCESS);
    }

    public static ResponseResult fail(){
        return new ResponseResult(null,CommonCode.FAIL);
    }
}
