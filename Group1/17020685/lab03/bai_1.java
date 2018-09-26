/*5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class bai_1 {
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {a = a - b;}
            else { b = b -a; }
        }
        return a;
    }
    
    static int FI(int n) {
        int []a = new int[n];
        if (n==0)
            System.out.print(0);
        else if (n==1)
            System.out.print("0 1  ");
        else if(n>1) {
            a[0]=0;
            a[1]=1;
            System.out.print("0 1 ");
            for (int i=2;i<n;i++) {
                a[i]=a[i-1]+a[i-2];
                System.out.print(a[i]+ " ");
            }
        }
        return 0;
    }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = scan.nextInt();
        System.out.println("nhap b: ");
        int b = scan.nextInt();
        System.out.println("UCLN: " +UCLN(a,b));
        System.out.println("nhap n: ");
        int n = scan.nextInt();
        System.out.print("day fibonaci: ");
        FI(n);
    }
}
