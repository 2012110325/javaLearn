package com.spittr.web;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

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

    public static void main (String[] args) {

//        List<String> l = new ArrayList<String>();
//        l.add("a");
//        l.add("b");
//        l.add("c");
//        l.add("d");
//
//
//        remove(l, 1);
//        System.out.println(l);
//
//        remove(l, 2);
//        System.out.println(l);
//
//        DateTime today = new DateTime().dayOfMonth().roundFloorCopy();
//        DateTime beginDate = today.minusDays(30);
//        DateTime endDate = today.minusDays(1);
//
//        System.out.println(today);
//        System.out.println(beginDate);
//        System.out.println(endDate);

//        List<String> l = new ArrayList<String>();
//        l.add("a");
//        l.add("b");
//        l.add("c");
//
//        List<String> l1 = new ArrayList<String>();
//        l1.add("d");
//        l1.add("e");
//        l1.add("f");
//
//        l.addAll(l1);
//        l1.clear();
//
//        System.out.println(l);
//        System.out.println(l1);
//
//        Integer i = null;
//        Integer i1 = 2;
//        int i3 = 0;
//        int b = i3 == 0 ? i : i1;

//        System.out.println(b);
//
//        int arr[] = {1, 2, 3, 33, 4, 5, 4, 4};
//        test(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; ++i)
//        System.out.println(arr[i]);
        f(s.a);
        f(s.b);
        f(null);
    }

    private static void test(int arr[], int from ,int to) {

        if (from >= to) {
            return;
        }

        int benchmark = arr[from];

        int pos=from;
        for (int i = from + 1; i <= to; ++i) {
            if (arr[i] < benchmark) {
                arr[pos++] = arr[i];
            }
        }
        arr[pos] = benchmark;
        test(arr, from, pos-1);
        test(arr, pos+1, to);
    }

    enum s {
        a,
        b;
    }
    private static void f(s e) {

        switch(e) {
            case a: System.out.println("a"); break;
            case b: System.out.println("b"); break;
            default: System.out.println("null");
        }

    }

    private void a(int a1) {

        ThreadLocal<String> t = new ThreadLocal<String>() {

        };
    }


}
