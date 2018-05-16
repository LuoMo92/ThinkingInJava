package com.luomo.tij.chapter5;

import static com.luomo.tij.util.Print.print;

/**
 * * initialization/OverloadedConstructors.java
 * TIJ4 Chapter Initialization, Exercise 9, page 172
 * Create a class with two (overloaded) constructors. Using 'this', call
 * the second constructor from inside the first one.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex9 {

    public static void main(String[] args) {
        new Doc(8).intubate();
    }

}

class Doc {
    Doc(int i) {
        this("MD");
        System.out.println("New doc with " + i + " years of training");
    }

    Doc(String s) {
        System.out.println("New doc with " + s + " degree");
    }

    void intubate() {
        print("prepare patient");
        laryngoscopy();
    }

    void laryngoscopy() {
        print("use laryngoscopy");
    }
}

