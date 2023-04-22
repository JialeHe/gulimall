package com.hjl.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用别的服务
 *  1. 引入OpenFeign
 *  2. 编写接口，告诉SpringCloud这个接口调用远程服务
 *      1. 声明接口的每一个方法都是调用哪个远程服务的哪个请求
 *  3. 开启远程调用功能
 */
@MapperScan("com.hjl.gulimall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.hjl.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
