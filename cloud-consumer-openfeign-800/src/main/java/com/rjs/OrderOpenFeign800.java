package com.rjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeign800 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeign800.class,args);
    }
}