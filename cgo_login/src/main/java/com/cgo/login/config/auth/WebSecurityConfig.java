package com.cgo.login.config.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsUtils;


@Configuration
@EnableWebSecurity

//这个类主要是做一个  授权之前的认证  如果美誉这个的话 直接去授权拿  认证码 的话 会报错  必须在授权之前
// 先认证   认证后 才能 拿授权码   -------也就是 在拿授权码 之前 做一个认证
// 即是  授权服务器 也是资源服务器
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers(HttpMethod.OPTIONS, "/api/**","/oauth/**")
                .and()
                .cors()
                .and()
                .csrf().disable();
        http.authorizeRequests()
                .antMatchers(
                "/api/v1/user/**","/doc.html",
                "/docs.html",
                "/v2/api-docs",
                "/swagger-resources/configuration/ui",
                "/swagger-resources",
                "/swagger-resources/configuration/security",
                "/swagger-ui.html",
                "/webjars/**").permitAll()
              //  .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
    //             .anyRequest().authenticated()
                 .anyRequest().permitAll();
    }
}
