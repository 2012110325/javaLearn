package com.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by other on 2018/2/4 7:45.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Clud Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
