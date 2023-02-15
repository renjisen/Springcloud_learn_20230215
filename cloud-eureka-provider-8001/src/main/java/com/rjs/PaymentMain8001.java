package com.rjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.rjs.mapper")//注解包扫描
public class PaymentMain8001
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}