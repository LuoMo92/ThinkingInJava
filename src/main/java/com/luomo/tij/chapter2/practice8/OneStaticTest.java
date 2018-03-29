package com.luomo.tij.chapter2.practice8;

/**
 * @author LiuMei
 * @date 2018-03-28.
 */

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

public class OneStaticTest {

    public static void main(String[] args) {
        System.out.println("StaticTest.i=" + StaticTest.i);
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        System.out.println("staticTest1.i=" + staticTest1.i);
        System.out.println("staticTest2.i=" + staticTest2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called:");
        System.out.println("staticTest1.i=" + staticTest1.i);
        System.out.println("staticTest2.i=" + staticTest2.i);
        staticTest1.i = 3;
        System.out.println("After staticTest1.i = 3");
        System.out.println("staticTest1.i=" + staticTest1.i);
        System.out.println("staticTest2.i=" + staticTest2.i);
        System.out.println("Create another StaticTest, staticTest3.");
        StaticTest staticTest3 = new StaticTest();
        System.out.println("staticTest3.i="+staticTest3.i);
    }

}
