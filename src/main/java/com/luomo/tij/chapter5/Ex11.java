package com.luomo.tij.chapter5;

import static com.luomo.tij.util.Print.print;

/**
 * Modify the previous exercise so that finalize() will always be called.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex11 {

    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        new WebBank(true);
        bank1.logOut();
        print("Try 1:");
        System.runFinalization();
        print("Try 2:");
        Runtime.getRuntime().runFinalization();
        print("Try 3:");
        System.gc();
    }

}
