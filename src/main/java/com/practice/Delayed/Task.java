package com.practice.Delayed;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by liqiang28 on 2018/4/8.
 */
public class Task<T extends Runnable> implements Delayed {

    private final long time;

    private final T task;

    private static final AtomicLong atomic = new AtomicLong(0);
    private final long n;

    public Task(long timeout, T t) {
        this.time = System.nanoTime() + timeout;
        this.task = t;
        this.n = atomic.getAndIncrement();
    }


    public long getDelay (TimeUnit unit) {
        return unit.convert(this.time - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public int compareTo (Delayed o) {

        if (o == this) {
            return 0;
        }

        if (o instanceof Task) {
            Task x = (Task)o;
            long diff = time - x.time;

            if (diff < 0) {
                return -1;
            } else if (diff > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        return 0;
    }

    public T getTask() {
        return this.task;
    }
}


















