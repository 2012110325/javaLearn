package com.spittr.dao;

import com.spittr.domain.Spittle;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liqiang28 on 2018/2/8.
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    public List<Spittle> findSpittles (long max, int count) {
        return null;
    }
}
