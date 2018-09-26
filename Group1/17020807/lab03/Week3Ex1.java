package week3ex1;

import java.util.Scanner;
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package week3ex1;

/**
 *
 * @author Dell
 */
public class Week3Ex1 {
    public int ucln(int a, int b)
    {
        if (a*b == 0) return 0;
        else while (a != b)
        {
            if (a > b) 
            {
                a = a - b;
            }
            else b = b - a;
        }
        return a;
    }
    
    public int Fibo(int n)
    {
        if (n == 0) return 0;
        if (n == 1)
            return 1;
        else return Fibo(n-1) + Fibo(n-2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int uc;
        
        Week3Ex1 Ex1 = new Week3Ex1();    
        
        a = input.nextInt();
        b = input.nextInt();
        uc = Ex1.ucln(a, b);
        
        System.out.println ("UCLN cua " + a + " va " + b + " la: "+ uc);
        System.out.println ("Fibonacci thu " + a + " la: " + Ex1.Fibo(a));

        // TODO code application logic here
    }
    
}
