package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liqiang28 on 2018/4/3.
 */
@Mapper
public interface UserMapperDAO {

    User findByUserAndPass(@Param("username") String username,@Param("password")String password);

}
