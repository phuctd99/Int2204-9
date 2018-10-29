/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author CCNE
 */
public class fileNotFound {
    public static void method(String file) throws FileNotFoundException{
        try {
            File f = new File(file);
            BufferedReader bf = new BufferedReader(new FileReader(f));
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        method("C:\\Users\\CCNE\\Downloads\\Squa.java");
    }
}
