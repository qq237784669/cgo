package com.cgo.mobile;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  手动注入 dataSource 避免 DruidAutoConfigure   dataSourceAutoConfigure 起bean冲突
 */
@SpringBootApplication()
@ComponentScan(basePackages ={
        "com.cgo.mobile",
        //"com.cgo.common", 不扫描 common 因为有redis存在
        "com.cgo.api"
} )
public class MobileApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApplication.class, args);
    }
}
