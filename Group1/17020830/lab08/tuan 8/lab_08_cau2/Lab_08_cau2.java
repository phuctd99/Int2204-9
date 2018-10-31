/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08_cau2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author admin
 */  

public class Lab_08_cau2 {
    
    public void nulpointException() throws NullPointerException {
        String name = null;
        if(name.equals("kenvin"))
            System.out.println("ok");
                
    }
    
    public void arrayindex() throws ArrayIndexOutOfBoundsException{
        
        int[] A = new int[20];
        System.out.println(A[20]);
        
    }
    
    public void arithmetic() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a/b);
    }
    
    
    public void notfoundfile() throws FileNotFoundException{
        File file = new File("bangtu.txt");
        Scanner sc = new Scanner(file);
        String read = sc.next();
        System.out.println(read);
    }
    
    public int classcast(Object s) throws ClassCastException{
        return (int) s;
                
    }
    
//    public void ioe() throws IOException{
//        FileWriter file = new FileWriter("data.txt");
//        file.write("hello");
//    }
//    
    
      
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Lab_08_cau2 t = new Lab_08_cau2();
                
        
        try{
            t.arrayindex();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ngoài mảng");
        }
       
        try{
            t.arithmetic();
        } catch(ArithmeticException e){
            System.out.println("số chia không thể bằng 0");
        }
        
        try {
            t.nulpointException();
        } catch (NullPointerException e) {
            System.out.println("có lỗi rồi");
        }
        try{
        t.notfoundfile();
        } catch(FileNotFoundException e){
            System.out.println("khong tim thay file");
        }
        String s = "16";
        try{
        t.classcast(s);
        } catch(ClassCastException e){
            System.out.println("loi");
        }
        
        
                
}
}
