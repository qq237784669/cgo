package com.cgo.db.config.redisson;


import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RedissonConfig {



     @Bean
     public RedissonClient getRedisson(@Autowired Environment env){
         Config config = new Config();
         config.useSingleServer().setAddress("redis://" +
                 env.getProperty("spring.redis.host") +
                 ":" +
                 env.getProperty("spring.redis.port"))
                 .setPassword("123456");
         return Redisson.create(config);
     }



}
