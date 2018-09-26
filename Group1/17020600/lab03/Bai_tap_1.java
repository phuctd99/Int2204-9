/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_1;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Bai_tap_1 {
    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while(a != b){
            if(a>b){
                a -= b;
            }
            else
                b -= a;
        }
        return a;
    }
    public int Fibonaci(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonaci(n-1) + Fibonaci(n-2);
    }
    public static void main(String[] args) {
        Bai_tap_1 test = new Bai_tap_1();
        Scanner scanint = new Scanner(System.in);
        System.out.println("a) tim uoc chung lon nhat");
        System.out.println("nhap so thu nhat:");
        int a = scanint.nextInt();
        System.out.println("nhap so thu hai:");
        int b = scanint.nextInt();
        System.out.println("UCLN cua 2 so la:");
        System.out.println(test.UCLN(a, b));
        System.out.println("b) Fibonaci");
        System.out.println("nhap so can tinh Fibonaci:");
        int n = scanint.nextInt();
        System.out.println("Fibonaci cua so do la:");
        System.out.println(test.Fibonaci(n));
        
        
    }
    
}
