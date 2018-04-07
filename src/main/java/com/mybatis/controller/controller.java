package com.mybatis.controller;

import com.mybatis.domain.User;
import com.mybatis.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liqiang28 on 2018/4/3.
 */

@Controller
@RequestMapping("/begin")
public class controller {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/index")
    @ResponseBody
    public String helloWord(){
        System.out.print("访问index后台。。。");
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String userName=request.getParameter("username");
        String password=request.getParameter("password");
        User user= userService.findByUserAndPass(userName,password);
        System.out.print(user!=null?"用户id:"+user.getId():"用户不存在");
        return user!=null?"index":"error";
    }

}
