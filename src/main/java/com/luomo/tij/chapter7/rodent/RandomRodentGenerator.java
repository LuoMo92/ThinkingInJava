package com.luomo.tij.chapter7.rodent;

import java.util.Random;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
public class RandomRodentGenerator {
    protected Shared shared = new Shared();
    private Random rand = new Random();

    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }


}
