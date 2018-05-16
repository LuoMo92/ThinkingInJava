package com.luomo.tij.chapter5;

import static com.luomo.tij.util.Print.print;

/**
 * initialization/ConstructorTest2.java
 * TIJ4 Chapter Initialization, Exercise 2, p158
 * Create a class with a String field that is initialized at the point of
 * definition, and another one that is initialized by the constructor. What is
 * the difference between the two approaches.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex2 {

    public static void main(String[] args) {
        Tester2 tester2 = new Tester2();
        print(tester2.s1);
        print(tester2.s2);
        print(tester2.s3);
    }

}

class Tester2 {
    String s1;
    String s2 = "hello";
    String s3;

    Tester2() {
        s3 = "good-bye";
    }
}