/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;
import java.lang.ArithmeticException;
import java.util.Scanner;
/**
 *
 * @author Hoang Vu Huong
 */
public class ArithmeticExceptions {
    public static int Mod(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        
        int a, b; 
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b = scan.nextInt();
        try{
        Mod(a, b);
        }catch(ArithmeticException e){
            System.out.println("Ban Vua chia cho so 0");
    }
    }
}
