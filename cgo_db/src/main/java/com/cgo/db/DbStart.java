package com.cgo.db;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.cgo.db.mapper")
public class DbStart {

    public static void main(String[] args) {
        SpringApplication.run(DbStart.class);
    }
}
