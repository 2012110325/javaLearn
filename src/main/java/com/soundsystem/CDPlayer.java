package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liqiang28 on 2018/2/5.
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    public void play () {
        cd.play();
    }

    @Autowired
    public CDPlayer (CompactDisc cd) {
        this.cd = cd;
    }
}
