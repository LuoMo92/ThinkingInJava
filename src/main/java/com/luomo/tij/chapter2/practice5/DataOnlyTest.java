package com.luomo.tij.chapter2.practice5;

/**
 * @author LiuMei
 * @date 2018-03-28.
 */
public class DataOnlyTest {

    public static void main(String[] args) {

        class DataOnly {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 1;
        dataOnly.b = true;
        dataOnly.d = 1;
        dataOnly.show();
    }

}
