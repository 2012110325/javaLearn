package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by liqiang on 2018/1/31 23:25.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
