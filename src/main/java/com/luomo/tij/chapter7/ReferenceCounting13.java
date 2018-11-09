package com.luomo.tij.chapter7;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-05-16.
 */
class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refCount++;
    }

    @Override
    protected void finalize() {
        if (refCount > 0) {
            print("Error: " + refCount + " Shared " + id + " objects in use");
        }
    }

    protected void dispose() {
        if (--refCount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for (Composing c : composing) {
            c.dispose();
        }
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        sharedTest.finalize();
    }
}