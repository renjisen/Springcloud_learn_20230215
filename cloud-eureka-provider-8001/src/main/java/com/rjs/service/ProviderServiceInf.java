package com.rjs.service;

import com.rjs.vo.User;

import java.util.List;

public interface ProviderServiceInf {
    public List<User> selectUserAllInfo();

    public User selectUserById(int id);
}
