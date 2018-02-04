package com.soundsystem;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * Created by liqiang on 2018/2/4 7:56.
 */
public class compactDiscMain {

    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("classpath:spring/compactDisc.xml");

        CompactDisc cd = ac.getBean(SgtPeppers.class);
        cd.play();

    }
}
