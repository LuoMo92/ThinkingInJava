package com.luomo.tij.chapter7.shape;

import static net.mindview.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }

    @Override
    public void amend(){
        print("Triangle.amend()");
    }
}
