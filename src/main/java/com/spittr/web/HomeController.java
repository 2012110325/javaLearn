package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by liqiang28 on 2018/2/6.
 */
@Controller
@RequestMapping({"/", "/first/homepage"})
public class HomeController {

    @RequestMapping(method=GET)
    public String home() {
        return "home";
    }
}
