package com.cgo.common.response;

/**

 该类作为 顶层 响应接口  
  每个 模块 每个表 对应有自己的 枚举类 
 */
public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    boolean success();
    //操作代码
    int code();
    //提示信息
    String message();

}
