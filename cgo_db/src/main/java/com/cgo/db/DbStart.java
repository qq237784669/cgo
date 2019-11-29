package com.cgo.db;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDubbo
@EnableScheduling
@ComponentScan(basePackages = {
        "com.cgo.common",
        "com.cgo.db",
        "com.cgo.entity"
})
@MapperScan("com.cgo.db.mapper")
public class DbStart {

    //test推送
    public static void main(String[] args) {
        SpringApplication.run(DbStart.class);
    }
}
