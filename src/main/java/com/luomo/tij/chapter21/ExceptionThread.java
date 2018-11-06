package com.luomo.tij.chapter21;//: concurrency/ExceptionThread.java
// {ThrowsException}

import java.util.concurrent.*;

public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
} ///:~
