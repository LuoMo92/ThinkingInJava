package com.luomo.tij.chapter5;

/**
 * @author LiuMei
 * @date 2018-04-20.
 */

class Tank1 {
    int howFull = 0;
    Tank1() { this(0); }
    Tank1(int fullness) {
        howFull = fullness;
    }
    void sayHowFull() {
        if(howFull == 0) System.out.println("Tank1 is empty");
        else System.out.println("Tank1 filling status = " + howFull);
    }
    void empty() {
        howFull = 0;
    }
    protected void finalize() {
        if(howFull != 0)
            System.out.println("Error: Tank1 not empty");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

public class Test {
    public static void main(String[] args) {
        Tank1 tank1 = new Tank1();
        Tank1 tank2 = new Tank1(3);
        Tank1 tank3 = new Tank1(5);
        // Proper cleanup: empty tank before going home
        tank2.empty();
        // Drop the reference, forget to cleanup:
        new Tank1(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.sayHowFull();
        System.out.println("tank2: ");
        tank2.sayHowFull();
        System.out.println("tank3: ");
        tank3.sayHowFull();
        System.out.println("first forced gc():");
        System.gc();
        // Force finalization on exit but using method
        // deprecated since JDK 1.1:
        System.out.println("try deprecated runFinalizersOnExit(true):");
        System.runFinalizersOnExit(true);
        System.out.println("last forced gc():");
        System.gc();
    }
}
