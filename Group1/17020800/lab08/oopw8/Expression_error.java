/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nguyenhuy
 */
public class Expression_error {
    public int Division(int x , int y) throws ArithmeticException{
        return x / y;
    }
    
    public String Arr (String [] s) throws NullPointerException {
        return s[s.length];
    }
    
    public int ArrIndex (int arr) throws ArrayIndexOutOfBoundsException {
            return arr;
    }
    
    public int toInt (Object s) throws ClassCastException{
        return (int) s;
    }
    
    public void ReadFile () throws FileNotFoundException{
        File dict = new File("dictionary.txt");
        Scanner sc = new Scanner(dict, "utf-8");
         while (sc.hasNextLine())
        {
            String fullLine = sc.nextLine();
            String[] split = fullLine.split("\t");
            // tao tu moi
            System.out.println(split[0]);
        }
    }
    
    public void Read () throws IOException{
        File dict = new File("dictionary.txt");
        Scanner sc = new Scanner(dict, "utf-8");
         while (sc.hasNextLine())
        {
            String fullLine = sc.nextLine();
            String[] split = fullLine.split("\t");
            // tao tu moi
            System.out.println(split[0]);
        }
    } 
    public static void main(String[] args) {
        Expression_error ee = new Expression_error();
        try {
            System.out.println(ee.Division(2, 0));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        String[] s = null;
        try {
            System.out.println(ee.Arr(s));
            }catch(NullPointerException e){
                System.out.println(e);
            } 
        int [] arr =  new int [10];
        try {
            arr[22] = 10;
            System.out.println(ee.ArrIndex(arr[22]));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            System.out.println(ee.toInt("abc"));
        }catch (ClassCastException e){
            System.out.println(e);
        }
        try{
              ee.Read();
        }catch(IOException e){
              System.out.println(e);
        
        }
    }
}
