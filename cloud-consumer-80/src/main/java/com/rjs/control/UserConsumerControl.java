package com.rjs.control;

import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/ConsumerControl")
public class UserConsumerControl {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX="http://cloud-payment-provider";
    @RequestMapping("/selectUserAllInfo")
    public List<User> selectUserAllInfo(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/UserConsumerControl/selectUserAllInfo",List.class);
    }
    @RequestMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable("id") int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/UserConsumerControl/selectUserById/"+id,User.class);

    }

}
