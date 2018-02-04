package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by liqiang on 2018/2/1 19:12.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!\n");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on a quest!\n");
    }
}
