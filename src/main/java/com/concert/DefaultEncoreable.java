package com.concert;

import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/6.
 */
@Component
public class DefaultEncoreable implements Encoreable {

    public void performEncore () {
        System.out.println(" ha ha ");
    }
}
