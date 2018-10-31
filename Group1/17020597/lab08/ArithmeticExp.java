/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArithmeticExp {
    public static void method(int x, int y) throws ArithmeticException {
        try {
            System.out.print(x + " : " + y + " = ");
            x = x/y;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Chia cho 0!!!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        method(x, y);
        
    }
}
