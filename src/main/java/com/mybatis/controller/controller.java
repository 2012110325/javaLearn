package com.mybatis.controller;

import com.mybatis.domain.User;
import com.mybatis.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @RequestMapping("/{text:[a-z]+}.{number:[\\d]+}/")
    public String login(HttpServletRequest request){
        String userName=request.getParameter("username");
        String password=request.getParameter("password");
        User user= userService.findByUserAndPass(userName,password);
        System.out.print(user!=null?"用户id:"+user.getId():"用户不存在");
        return user!=null?"index":"error";
    }


    public static void main(String[] args) {
//        f(1000000000);
//        f(256);

        System.out.println( String.format("%02d:%02d:%02d", 1, 2, 45));
    }


    static void f(int n) {

        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 3, 5);
        Collections.sort(numbers);
        for (int i = 0; i < 6; ++i)
        System.out.print(numbers.get(i));
        System.out.println("\n");
    }


    // 时间的最小值
    // two
    public String print(int A, int B, int C, int D, int E, int F) {

        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 3, 5);
        Collections.sort(numbers);

        int hours;
        int minute;
        int second;

        if (numbers.get(0) > 1 || numbers.get(3) <= 5) {
            hours = 10*numbers.get(0) + numbers.get(1);
            if (numbers.get(4) <= 5) {
                minute = 10*numbers.get(2) + numbers.get(3);
                second = 10*numbers.get(4) + numbers.get(5);
            } else {
                minute = 10*numbers.get(2) + numbers.get(4);
                second = 10*numbers.get(3) + numbers.get(5);
            }
        } else {

            hours = 10*numbers.get(0) + numbers.get(3);
            minute = 10 * numbers.get(1) + numbers.get(4);
            second = 10 * numbers.get(2) + numbers.get(5);
        }

        if (hours < 24 && minute < 60 && second < 60) {
            return String.format("%02d:%02d:%02d", hours, minute, second);
        } else {
            return "NOT POSSIBLE";
        }



    }



}
