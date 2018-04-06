package com.springinaction.knights;

import com.soundsystem.AutowiredTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by other on 2018/1/31 23:37.
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
//        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
//        context.close();

        AutowiredTest auto = context.getBean(AutowiredTest.class);
        auto.play();
    }
}
