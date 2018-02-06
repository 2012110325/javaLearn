package com.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/6.
 */
@Component
public class AutowiredTest {

    @Value("abc")
    private String value;

    public void play() {
        System.out.println(value);
    }
}
