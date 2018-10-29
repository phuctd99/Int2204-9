/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt7_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class BTT7 {

    /**
     * @param args the command line arguments
     */
    public void printName(String name) throws Exception {             
        System.out.println(name);
    }

    public void printString(String a, int n) throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.print(a.charAt(i));
        }
    }

    public int division(int numerator, int denominator) throws Exception {     
        return numerator / denominator;
    }

    public void printString2(Object x) {

        System.out.println((String) x);

    }

    public void createFile(String x) throws Exception {
        File myFile = new File(x);
    }

    public void oppenFile(String x) throws Exception {
        Scanner input = new Scanner(new File(x));
    }

    public static void main(String[] args) throws Exception  {
        // TODO code application logic here
        BTT7 t = new BTT7();
        String name = null;
        //java.lang.NullPointerException
        try{
        t.printName(name);
        } catch(Exception e){
            System.out.println("ERROR");
        }

        String a = "haha";
        int n = 5;
        //java.lang.ArrayIndexOfBoundException
        try {
            t.printString(a, n);
        } catch (Exception e) {
            System.out.println("ERROR!");
        }

        int n1 = 0;
        //java.lang.ArithmeticException
        try{
        t.division(n, n1);
        } catch (Exception e){
            System.out.println("ERROR");
        }
        
        Object x = new Integer(0);
        //java.lang.ClassCastException
        try {
            t.printString2(x);
        } catch (ClassCastException e) {
            System.out.println("ERROR!" + e.getMessage());
        }
        //java.io.IOException
        try {
            t.createFile("daco");
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
        //java.io.FileNotFoundException
        try {
            t.oppenFile(a);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!!");
        }
    }

}
