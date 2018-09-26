package com.company;

public class math {

    // tinh uoc chung lon nhat
    public int gcd(int a, int b) {
        if (a == 0)
            return Math.abs(b);
        else if (b == 0)
            return Math.abs(a);

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }

        return a;
    }

    // tinh fibonacci
    public long fibonacci(int n) {
        if (n <= 1)
            return n;
        long a = 0, b = 1;
        long result = 0;
        while (n-- > 1) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        math test = new math();
        System.out.println(test.fibonacci(6));
        System.out.println(test.gcd(15, 45));
        System.out.println(test.gcd(0, -100));
        System.out.println(test.gcd(-10, -15));
    }
}
