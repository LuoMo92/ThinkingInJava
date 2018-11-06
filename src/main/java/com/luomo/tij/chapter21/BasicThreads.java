package com.luomo.tij.chapter21;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-11-05.
 */
public class BasicThreads {

    public static void main(String[] args){
        Thread t= new Thread(new LiftOff());
        t.start();
        print("Waiting for LiftOff");
    }

}
