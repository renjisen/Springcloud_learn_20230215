package com.rjs.service;

import com.rjs.mapper.ProviderMapper;
import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderServiceInf{
    @Autowired
    private ProviderMapper providerMapper;
    public List<User> selectUserAllInfo(){
        return providerMapper.selectUserAllInfo();
    }

    public User selectUserById(int id){
        return providerMapper.selectUserById(id);
    }
}
