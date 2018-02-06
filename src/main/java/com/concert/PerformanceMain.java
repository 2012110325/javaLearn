package com.concert;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liqiang28 on 2018/2/6.
 */
public class PerformanceMain {

    public static void main (String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

        Performance p = ctx.getBean(Performance.class);

        p.perform();
    }
}
