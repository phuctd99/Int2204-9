/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArithmeticExceptions {
    public static void Ari(int a, int b) throws ArithmeticException{
        try {
            double x = a/b;
            System.out.println(x);
        } catch(ArithmeticException e) {
            System.err.println("Lỗi chia cho 0");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Ari(a, b);
        
    }
}
