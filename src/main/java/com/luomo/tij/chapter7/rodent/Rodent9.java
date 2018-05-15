package com.luomo.tij.chapter7.rodent;

import static net.mindview.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
class Rodent {
    private String name = "Rodent";

    protected void eat() {
        print("Rodent.eat()");
    }

    protected void run() {
        print("Rodent.run()");
    }

    protected void sleep() {
        print("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    protected void eat() {
        print("Mouse.eat()");
    }

    @Override
    protected void run() {
        print("Mouse.run()");
    }

    @Override
    protected void sleep() {
        print("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    @Override
    protected void eat() {
        print("Rat.eat()");
    }

    @Override
    protected void run() {
        print("Rat.run()");
    }

    @Override
    protected void sleep() {
        print("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";

    @Override
    protected void eat() {
        print("Squirrel.eat()");
    }

    @Override
    protected void run() {
        print("Squirrel.run()");
    }

    @Override
    protected void sleep() {
        print("Squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Rodent9 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (Rodent r : rodents) {
            r = gen.next();
            print(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
