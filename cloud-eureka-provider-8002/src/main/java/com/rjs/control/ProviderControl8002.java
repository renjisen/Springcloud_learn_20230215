package com.rjs.control;

import com.rjs.service.ProviderServiceInf;
import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserConsumerControl")
public class ProviderControl8002 {

    @Autowired
    private ProviderServiceInf providerServiceInf;
    @RequestMapping("/selectUserAllInfo")
    public List<User> selectUserAllInfo(){
        System.out.println("8002");
        return providerServiceInf.selectUserAllInfo();
    }

    @RequestMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable("id") int id){
        System.out.println("8002");
        return providerServiceInf.selectUserById(id);
    }
}
