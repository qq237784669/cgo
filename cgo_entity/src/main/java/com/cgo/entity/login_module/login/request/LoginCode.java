package com.cgo.entity.login_module.login.request;

import com.cgo.common.response.ResultCode;

public enum LoginCode implements ResultCode {
    PLATFORMTYPE_MISMATCH(false,-10,"该平台请使用TOP6产品线App，点击确认前往下载。"),
    SUCCESS(true,10000,"操作成功！"),
    UNAUTHENTICATED(false,10003,"此操作需要登陆系统！"),
    PERMISSION_DENIED(false,10004,"权限不足，无权操作！"),
    SYSTEM_BUSY(false,10005,"抱歉，系统繁忙，请稍后重试！");
    //    private static ImmutableMap<Integer, VehicleCode> codes ;
    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private LoginCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return false;
    }

    @Override
    public int code() {
        return 0;
    }

    @Override
    public String message() {
        return null;
    }
}
