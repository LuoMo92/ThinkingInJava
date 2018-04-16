package com.luomo.tij.chapter3;

import static net.mindview.util.Print.print;

/**
 * P40 练习2
 * @author LiuMei
 * @date 2018-04-16
 */

class Test {
    float f;
}

public class Assignment {

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        test1.f = 1;
        test2.f = 2;
        print("1: test1.f:"+test1.f+" test2.f:"+test2.f );
        test1 = test2;
        test1.f = 3;
        print("2: test1.f:"+test1.f+" test2.f:"+test2.f );
    }

}
