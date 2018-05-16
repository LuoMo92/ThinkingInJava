package com.luomo.tij.chapter7.rodent;


import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        print("Creating Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        print("Creating Description " + s);
    }
}

class Rodent {
    Rodent() {
        print("Rodent()");
    }

    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

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
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");

    Mouse() {
        print("Mouse()");
    }

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

    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");

    Rat() {
        print("Rat()");
    }

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
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");

    Squirrel() {
        print("Squirrel()");
    }

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
//        Rodent[] rodents = new Rodent[10];
//        for (Rodent r : rodents) {
//            r = gen.next();
//            print(r);
//        }
        print(new Mouse());
    }
}
