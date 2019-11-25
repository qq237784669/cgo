package com.cgo.common.utlis;

import sun.nio.cs.ext.MacArabic;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtils {


    public static Map put(String k,Object v){
        Map<String,Object> map=new HashMap<>();
        map.put(k,v);
        return map;
    }
}
