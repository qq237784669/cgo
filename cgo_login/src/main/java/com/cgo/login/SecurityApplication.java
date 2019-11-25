package com.cgo.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SecurityApplication.class);
    }

    @Bean
    public RestTemplate OKHttp3RestTemplate(){
        OkHttp3ClientHttpRequestFactory okhttp = new OkHttp3ClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(okhttp);
        return restTemplate;
    }

}
