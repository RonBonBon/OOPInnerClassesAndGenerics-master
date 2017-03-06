package edu.tomer.java;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hackeru on 06/03/2017.
 */
public class StopTask extends TimerTask {
    private final Timer timer;

    public StopTask(Timer t) {
        this.timer = t;
    }

    @Override
    public void run() {
        timer.cancel();
    }
}
