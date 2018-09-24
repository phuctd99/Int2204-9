package com.company;

public class Main {
    static int ucln(int a, int b) {
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
    public static void main(String[] args) {
	// write your code here
        PS ps1 = new PS(2, 2);
        PS ps2 = new PS(5, 3);
        System.out.println(ps1);
        System.out.println(ps2);
  //      ps1.plus(ps2);
        double d = 1;
//        ps1.subtract(ps2);
        System.out.println(ps1);
        System.out.println(ps1.equals(d));
    }
}
