package com.company;

import java.util.Scanner;

public  class UCLN {
    public int ucln(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if( a == 0) return b;
        if ( b == 0) return a;
        if( a == b) return a;
        else {
            if( a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return  ucln(a,b);
        }

        public static void main(String[] args) {
        UCLN p = new UCLN();
        System.out.print(p.ucln(12,15));


        }

}