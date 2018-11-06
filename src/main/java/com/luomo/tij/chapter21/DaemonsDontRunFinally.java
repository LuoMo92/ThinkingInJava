package com.luomo.tij.chapter21;

import java.util.concurrent.TimeUnit;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */
class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.SECONDS.sleep(1);
    }
}
