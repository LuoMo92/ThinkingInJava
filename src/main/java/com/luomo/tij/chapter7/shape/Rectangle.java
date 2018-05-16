package com.luomo.tij.chapter7.shape;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
public class Rectangle extends Shape {

    @Override
    public void draw() {
        print("Rectangle.draw()");
    }

    @Override
    public void erase() {
        print("Rectangle.erase()");
    }

    @Override
    public void amend() {
        print("Rectangle.amend()");
    }
}
