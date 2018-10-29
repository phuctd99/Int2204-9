/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan8_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CCNE
 */
public class Baituan8_2 {
    public static void Division() throws ArithmeticException{
        try{
        int x = 3/0;
        System.out.println(x);
        } catch(Exception e){
            System.out.println("java.lang.ArithmeticException");
        }
    }
    public static void print() throws ArrayIndexOutOfBoundsException{
        int []arr = {3,5,6,2};
        try{
        System.out.println(arr[7]);
        } catch(Exception e){
            System.out.println("java.lang.ArrayIndexOfBoundException");
        }
    }
    public static void Pointer() throws NullPointerException{
        String s = null;
        try{
        System.out.println(s.length());
        } catch(Exception e){
            System.out.println("java.lang.NullPointerException");
        }
    }
    public static void classcast() throws ClassCastException{
        try {
            Object i = new Double(0);
            String str = (String)i;
            System.out.println(str);
                    
        } catch(ClassCastException e) {
            System.out.println("java.lang.ClassCastException");
        }
//        Object x = 5;
//        String s = (String)x;
//        System.out.println(s);
    }
    public static void IOE(String file) throws IOException{
        File f = new File(file);
        BufferedReader filex = new BufferedReader(new FileReader(f));
        if(filex.ready()){
            System.out.println("succsess");
        }
        else {
            System.out.println("failed");
        }
    };
    public static void FileNot() throws FileNotFoundException{
        try{
            Scanner inFile = new Scanner(new FileInputStream("E:\\abc.txt"),"UTF-8");
            System.out.println("file found");
        } catch(FileNotFoundException e) {
            System.out.println("java.io.FileNotFoundException");
        }
    }
    public static void main(String[] args)  {
        Division();
        print();
        Pointer();
        classcast();
        try {
            FileNot();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Baituan8_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        String file = "E:\\xyz.txt";
        try {
            IOE(file);
        } catch (IOException ex) {
            Logger.getLogger(Baituan8_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}   
