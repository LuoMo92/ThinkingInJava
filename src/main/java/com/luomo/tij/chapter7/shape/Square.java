package com.luomo.tij.chapter7.shape;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-15.
 */
public class Square extends Shape {

    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }

    @Override
    public void amend(){
        print("Square.amend()");
    }
}
