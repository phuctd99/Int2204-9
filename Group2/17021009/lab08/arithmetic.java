package Cau2;

import java.util.Scanner;

public class arithmetic {
    public static void exception() throws ArithmeticException {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println((double)a/b);
    }

    public static void main(String[] args) {
        try {
            exception();
        } catch (ArithmeticException e) {
            System.err.println("ERROR");
        }
    }
}
