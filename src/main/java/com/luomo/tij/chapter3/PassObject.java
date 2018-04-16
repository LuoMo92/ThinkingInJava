package com.luomo.tij.chapter3;

import static net.mindview.util.Print.print;

/**
 * P41 练习3
 *
 * @author LiuMei
 * @date 2018-04-16
 */

class Float {
    float f;
}

public class PassObject {

    static void f(Float f) {
        f.f = 2;
    }

    public static void main(String[] args) {
        Float f = new Float();
        f.f = 1;
        f(f);
        print(f.f);
    }
}
