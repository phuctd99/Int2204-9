package com.company;
import java.util.*;
public class Main {
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0){
            return b;
        }
        else if (a != 0 && b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        while(a != b){
            if(a > b)
                a -= b;
//            else
            if(a < b)
                b -= a;
        }
        return a;
    }
    public int Fibonaxi(int a){
        if(a == 0)
            return 0;
        else
            if(a == 1)
            return 1;
        else{
            return (a+Fibonaxi(a-1));
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        Main m = new Main();
        System.out.println(m.UCLN(a,b));
        //System.out.println(m.Fibonaxi(10));
    }
}