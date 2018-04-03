package com.mybatis.service;

import com.mybatis.dao.UserMapperDAO;
import com.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liqiang28 on 2018/4/3.
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserMapperDAO mapper;

    public User findByUserAndPass(String username, String password) {
        return mapper.findByUserAndPass(username,password);
    }

}
