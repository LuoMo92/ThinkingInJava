package com.luomo.tij.chapter4;

/**
 * @author LiuMei
 * @date 2018-04-18
 */
public class Fibonacci {

    int fib(int n) {
        if (n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int k = 5;
        System.out.println("First " + k + " Fibonacci number(s): ");
        for (int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }

}
