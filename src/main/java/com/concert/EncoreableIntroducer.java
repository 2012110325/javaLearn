package com.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/6.
 */
@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value="com.concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
