package com.rjs.mapper;

import com.rjs.vo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProviderMapper {
    public List<User> selectUserAllInfo();

    public User selectUserById(int id);
}
