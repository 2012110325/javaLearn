package com.soundsystem;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/5.
 */
@Component
public class CDPlayer implements MediaPlayer, ApplicationContextAware{

    private ApplicationContext ctx;

    private CompactDisc cd;

    public void play () {
        cd.play();
    }

    @Autowired
    public CDPlayer (CompactDisc cd) {
        this.cd = cd;
    }

    public void setApplicationContext (ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }


}
