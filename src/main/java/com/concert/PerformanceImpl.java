package com.concert;

import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/6.
 */
@Component
public class PerformanceImpl implements Performance {

    public void perform () {

        System.out.println("\n goodaop goodaop \n");
    }
}
