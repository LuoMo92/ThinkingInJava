package com.luomo.tij.chapter21;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            print("Waiting for LiftOff");
        }
    }

}
