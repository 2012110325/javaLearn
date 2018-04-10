package com.practice.Serializable;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by liqiang28 on 2018/4/10.
 */
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 8923589604022124114L;

    private int age;
    private String name;
    private String sex;
}
