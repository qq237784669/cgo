package com.cgo.entity.web_module.vehicle.response;


import com.cgo.common.response.ResultCode;

public enum VehicleCode implements ResultCode  {


    INVALID_PARAM(false,10001,"用户id 不能为空"),
    FAILURE(false,10002,"请稍后再试当  前未拿到锁  正在更新数据");
    //    private static ImmutableMap<Integer, VehicleCode> codes ;
    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private VehicleCode(boolean success, int code, String message){
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
