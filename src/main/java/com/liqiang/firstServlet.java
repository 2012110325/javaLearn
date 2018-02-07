package com.liqiang;

import com.soundsystem.CDPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liqiang28 on 2018/1/29.
 */
public class firstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test Here");
        resp.getOutputStream().println("adf");
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());

        ctx.getBean(CDPlayer.class).play();
    }

}
