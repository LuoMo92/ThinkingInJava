package com.luomo.tij.chapter3;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-04-17
 */
public class RightShiftTest2 {

    public static void main(String[] args) {
        int h = -1;
        print(Integer.toBinaryString(h));
        h <<= 10;
        print(Integer.toBinaryString(h));
        for (int i = 0; i < 32; i++) {
            h >>>= 1;
            print(Integer.toBinaryString(h));
        }
    }

}
