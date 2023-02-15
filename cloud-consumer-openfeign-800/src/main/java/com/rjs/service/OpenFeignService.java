package com.rjs.service;

import com.rjs.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value = "CLOUD-PAYMENT-PROVIDER")
public interface OpenFeignService {
    @RequestMapping("/UserConsumerControl/selectUserAllInfo")
    public List<User> selectUserAllInfo();
    @RequestMapping("/UserConsumerControl/selectUserById/{id}")
    public User selectUserById(@PathVariable("id") int id);
}
