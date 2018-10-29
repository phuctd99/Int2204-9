/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FileNotFoundExceptions {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner inFile = new Scanner(new FileInputStream("E:\\anhdonn.txt"),"UTF-8");
            System.out.println("File Found.");
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found.");
        }
    }
    
}
