package com.spittr.dao;

import com.spittr.domain.Spittle;

import java.util.List;

/**
 * Created by liqiang28 on 2018/2/7.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
