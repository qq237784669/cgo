package com.cgo.common.exception;


import com.cgo.common.response.ResultCode;
import lombok.Data;

/**
 * 自定义异常处理
 */
@Data
public class CustomException extends RuntimeException {

    private ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode=resultCode;
    }


}
