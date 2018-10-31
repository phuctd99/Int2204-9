/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Tommmm^^
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String s = null;
        try {
            System.out.println(NullPointer(s));
        } catch(NullPointerException e) {
            System.out.println("Loi");
        }
        int [] a = {1,2,3};
        try {
            System.out.println(ArrayIndex(a));
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Loi");
        }
        int x= 1 ; int  y = 0;
        try {
            System.out.println(Arithmetic(x, y));
        } catch (ArithmeticException e) {
            System.out.println("lOI");
            
        }
        Object i = "abc";
        try {
            System.out.println(ClassCast(i));
        } catch (ClassCastException e) {
            System.out.println("lOI");
            
        }
        
        String m = "hi";
        InsertFromFile(m);
        
    }
    public static int NullPointer(String s) throws NullPointerException {
        return s.length();
        
    }
    public static int ArrayIndex(int []  a)throws ArrayIndexOutOfBoundsException  {
        return a[a.length];
    }
    public static int Arithmetic(int a,int b) throws ArithmeticException {
        return a/b;
    }   
    public static int ClassCast(Object i) throws ClassCastException {
        return (int) i;
    }
     public static void InsertFromFile(String ten) throws IOException , FileNotFoundException {

        File f = new File(ten);
        BufferedReader file = new BufferedReader(new FileReader(f));
        if (!file.ready()) {
            System.err.println("Chưa mở được file");
        }
        else{
            System.out.println("mở thành công");
        }


    }
            
}
