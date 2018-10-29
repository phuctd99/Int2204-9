/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t8_b2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OOP_T8_B2 {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        try{
            arrayIndex();
        }
        catch(Exception e){
            System.out.println("k co phan tu so 3");
        }
        
        nullPointer();
        arithmetic();
        fileFound();
        try{
            fileNotFound();       
        }
        catch(IOException e){
            System.out.println("k tim thay file trong thu muc");
        }        
        try{
            Object o = "abc";
            System.out.println(classCast(o));
            
        }
        catch(ClassCastException e){
            System.out.println("chuyen kieu k hop le");
        }
    }
    static void nullPointer(){
        try{
            String x=null;
            System.out.println(x.length());
        }catch(Throwable e){
            System.out.println("x= null");
        }
    }
    static void arrayIndex()throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
    static void arithmetic() {
        try{
            int x = 10;
            int y = 0;
            System.out.println(x/y);
        }catch(ArithmeticException e){
            System.out.println("phep chia cho so 0");
        }
    }
    static int classCast(Object a) throws ClassCastException{
        return (int) a;
    }
    static void fileFound() throws IOException{
        Scanner inputDic = new Scanner(Paths.get("dictionary.txt"));
        while(inputDic.hasNextLine()){
            System.out.println("da doc dc file");
            break;
        }
    }
    static void fileNotFound() throws IOException{
        Scanner inputDic = new Scanner(Paths.get("file.txt"));
        while(inputDic.hasNextLine()){
            System.out.println(inputDic);
        }
    }
}
