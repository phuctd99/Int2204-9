/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t3;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class OOP_T3 {
    public static Scanner sc = new Scanner(System.in);
    public static int UCLN(int a, int b){
        if (b == 0) return a;
        else return  UCLN(b ,a % b);
    }
    public static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UCLN cua  :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("la: ");
        System.out.println(UCLN(num1,num2));
        int n = num1 + num2;
        //for (int i = 0; i <= n; i++){
            System.out.print(fib(n) + " ");
        //} 
        
        
    }
    
}
