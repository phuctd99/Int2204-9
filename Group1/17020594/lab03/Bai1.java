
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Tommmm^^
 */
public class Bai1 {

    public int UCLN (int a, int b) {
       
        while(a!=b){
            if(a > b ) a = a-b;
            else b = b - a;
        }
        return a;
    }

    public int Fibonacci (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main (String[] argh) {
        Bai1 bT = new Bai1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(bT.UCLN(a, b));

        int n = sc.nextInt();
        System.out.println(bT.Fibonacci(n));
        sc.close();
    }
    
}
