package com.rjs.control;

import com.rjs.service.OpenFeignService;
import com.rjs.vo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class OpenFeignControl {
    @Resource
    private OpenFeignService openFeignService;

    @RequestMapping("/OpenfeignConsumer/selectUserAllInfo")
    public List<User> selectUserAllInfo(){
        return openFeignService.selectUserAllInfo();
    }
    @RequestMapping("/OpenfeignConsumer/selectUserById/{id}")
    public User selectUserById(@PathVariable ("id") int id){
        return openFeignService.selectUserById(id);
    }
}
