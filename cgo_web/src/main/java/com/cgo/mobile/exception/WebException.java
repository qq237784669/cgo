package com.cgo.mobile.exception;

import com.cgo.common.exception.CustomException;
import com.cgo.common.response.CommonCode;
import com.cgo.common.response.ResponseResult;
import com.cgo.common.response.ResultCode;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常捕获类
 **/
@RestControllerAdvice//控制器增强
@Slf4j
public class WebException {
    //定义map，配置异常类型所对应的错误代码  volatile 防止汇编指令重排序的情况
    private  static ImmutableMap<Class<? extends Throwable>,ResultCode> EXCEPTIONS;
    //定义map的builder对象，去构建ImmutableMap
    private static ImmutableMap.Builder<Class<? extends Throwable>, ResultCode> builder = ImmutableMap.builder();

    //捕获CustomException此类异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseResult customException(CustomException customException){

        //记录日志
        log.error("catch exception:  >>>>>"+customException.getResultCode().message());
        ResultCode resultCode = customException.getResultCode();
        log.info("========================================== end ==========================================");
        return new ResponseResult(null,resultCode);
    }

    //捕获Exception此类异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult exception(Exception exception){
        //记录日志
        log.error("catch exception:  >>>>>  "+exception);

        //  预防并发情况下的重复创建 双重锁
        if(EXCEPTIONS == null){
            synchronized (WebException.class){
                if (EXCEPTIONS==null){
                    EXCEPTIONS = builder.build();//EXCEPTIONS构建成功
                }
            }
        }

        //从EXCEPTIONS中找异常类型所对应的错误代码，如果找到了将错误代码响应给用户，如果找不到给用户响应99999异常
        ResultCode resultCode = EXCEPTIONS.get(exception.getClass());
        if(resultCode !=null){
            return new ResponseResult(null,resultCode);
        }else{
            //返回99999异常
            return new ResponseResult(null,CommonCode.SYSTEM_BUSY);
        }
    }

    static {
        //定义异常类型所对应的错误代码
        builder.put(HttpMessageNotReadableException.class,CommonCode.INVALID_PARAM);
        builder.put(HttpMediaTypeNotSupportedException.class,CommonCode.INVALID_CONTENTTYPE);
    }
}
