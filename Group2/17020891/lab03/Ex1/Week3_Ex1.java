package com.company;
import java.util.*;
public class Week3_Ex1 {
    int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                if (a < b) {
                    b = b - a;
                }
            }
        }
        return a;
    }
    long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    long secondWayFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    public static void main(String[] args) {
        // write your code here
        Week3_Ex1 test = new Week3_Ex1();
        System.out.println(test.ucln(2,6));
        System.out.println(test.fibonacci(40));
        System.out.println(test.secondWayFibonacci(1000));
    }
}
