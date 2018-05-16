package com.luomo.tij.chapter5;

import static com.luomo.tij.util.Print.print;

/**
 * initialization/TankTest.java
 * TIJ4 Chapter Initialization, Exercise 12, page 177
 * Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up.
 * Write a finalize() that verifies this termination condition. In main(), test
 * the possible scenarios that can occur when your Tank is used.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex12 {

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        tank2.empty();
        new Tank(6);
        print("Check tanks:");
        print("tank1:");
        tank1.sayHowFull();
        print("tank2:");
        tank2.sayHowFull();
        print("tank3:");
        tank3.sayHowFull();
        print("first forced gc()");
        System.gc();
        print("try deprecated runFinalizersOnExit(true);");
        System.runFinalizersOnExit(true);
        print("last forced gc():");
        System.gc();
    }

}

class Tank {
    int howFull = 0;

    Tank() {
        this(0);
    }

    Tank(int fullness) {
        howFull = fullness;
    }

    void sayHowFull() {
        if (howFull == 0) {
            print("Tank is empty");
        } else {
            print("Tank filling status = " + howFull);
        }
    }

    void empty() {
        howFull = 0;
    }

    @Override
    protected void finalize() {
        if (howFull != 0) {
            print("Error: Tank not empty");
        }
    }
}