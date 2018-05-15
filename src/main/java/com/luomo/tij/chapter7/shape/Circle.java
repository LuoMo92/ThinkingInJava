package com.luomo.tij.chapter7.shape;

import static net.mindview.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void amend(){
        print("Circle.amend()");
    }

}
