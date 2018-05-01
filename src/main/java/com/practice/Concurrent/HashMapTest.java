package com.practice.Concurrent;

import java.util.HashMap;
import java.util.concurrent.*;

/**
 * Created by liqiang on 2018/5/1 10:17.
 */
public class HashMapTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorCompletionService s = new ExecutorCompletionService(Executors.newFixedThreadPool(4));

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        Future f1 = s.submit(new MyRunnable(1, 1000000, h), null);
        Future f2 = s.submit(new MyRunnable(1000000, 2000000, h), null);
        Future f3 = s.submit(new MyRunnable(2000000, 3000000, h), null);
        f1.get(); f2.get(); f3.get();


        System.out.println("s");
    }

    static class MyRunnable implements Runnable {

        int start;
        int end;
        HashMap h;

        public MyRunnable(int start, int end, HashMap h) {
            this.start = start;
            this.end = end;
            this.h = h;
        }

        public void run() {

            while (start++ <= end) {
                h.put(start, start);
            }
        }
    }
}
