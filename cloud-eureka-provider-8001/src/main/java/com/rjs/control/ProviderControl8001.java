package com.rjs.control;

import com.rjs.service.ProviderServiceInf;
import com.rjs.vo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProviderControl8001 {

    @Resource
    private ProviderServiceInf providerServiceInf;

    @RequestMapping("/UserConsumerControl/selectUserAllInfo")
    public List<User> selectUserAllInfo(){
        System.out.println("8001");
        return providerServiceInf.selectUserAllInfo();
    }
    @RequestMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable("id") int id){
        System.out.println("8001");
        return providerServiceInf.selectUserById(id);
    }

}
