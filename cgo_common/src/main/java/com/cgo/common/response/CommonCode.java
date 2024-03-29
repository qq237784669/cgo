package com.cgo.common.response;


public enum  CommonCode implements ResultCode  {


    INVALID_PARAM(false,10001,"非法参数！"),
    INVALID_CONTENTTYPE(false,10006,"请求类型格 content-type 有误"),
    SUCCESS(true,1,""),
    FAILURE(false,-1,"操作失败！"),
    UNAUTHENTICATED(false,10003,"此操作需要登陆系统！"),
    PERMISSION_DENIED(false,10004,"权限不足，无权操作！"),
    SYSTEM_BUSY(false,10005,"抱歉，系统繁忙，请稍后重试！");
    //    private static ImmutableMap<Integer, CommonCode> codes ;
    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private CommonCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
