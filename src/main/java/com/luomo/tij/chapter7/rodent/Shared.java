package com.luomo.tij.chapter7.rodent;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-16.
 */
public class Shared {

    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refCount++;
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    public void showRefcount() {
        print("refCount = " + refCount);
    }

}
