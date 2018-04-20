package com.luomo.tij.chapter5;

import static net.mindview.util.Print.print;

/**
 * initialization/TerminationConditionEx.java
 * TIJ4 Chapter Initialization, Exercise 10, page 177
 * Create a class with a finalize() method that prints a message. In main(),
 * create an object of your class. Explain the behavior of your program.
 *
 * @author LiuMei
 * @date 2018-04-20.
 */
public class Ex10 {

    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        bank1.logOut();
        new WebBank(true);
        System.gc();
    }

}

class WebBank {

    boolean loggedIn = false;

    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (loggedIn) {
            print("Error : still logged in");
        }
        super.finalize();
    }
}
