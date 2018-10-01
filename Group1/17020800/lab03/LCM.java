/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author nguyenhuy
 */
public class LCM {
    public int  UocChung ( int a , int b) {
//        while ( a != b) {
//            if ( a > b) {
//                a = a - b;
//            }
//            else if ( a < b){
//                b = b - a;
//            }
//        }
//        return a ;
          if (b == 0) return a;
          else return UocChung(b, a% b) ;
    }
    public int Fibonaxi ( int a) {
        if ( a == 0) {
            return 0;
        }
        if ( a == 1) {
            return 1;
        }
        
        return ( Fibonaxi(a - 1) + Fibonaxi(a - 2) );
    }
    public static void main(String[] args) {
        LCM lcm = new LCM();
//        Scanner in = new Scanner( System.in);
        int a = 6;
        int b = 10;
//        in.close();
        System.out.println(lcm.UocChung(a, b));
        System.out.println(lcm.Fibonaxi(a));
    }
}
