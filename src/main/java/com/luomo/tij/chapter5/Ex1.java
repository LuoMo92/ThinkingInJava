package com.luomo.tij.chapter5;

import static net.mindview.util.Print.print;

/**
 * initialization/ConstructorTest.java
 * ITJ4 Chapter Initialization, Exercise 1, p158
 * Create a class containing an unitialized String reference. Demonstrate that // this reference is initialized by Java to null.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex1 {
    public static void main(String[] args) {
        Tester tester = new Tester();
        print(tester.s);
    }
}

class Tester {
    String s;
}

