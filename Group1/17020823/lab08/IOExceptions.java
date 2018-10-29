/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Vu Huong
 */
public class IOExceptions {

    public static void InsertFromFile(String ten_file) throws IOException {
        String S;

        File f = new File(ten_file);
        BufferedReader file = new BufferedReader(new FileReader(f));
        
        
    }
    public static void main(String[] args) throws IOException  {
        
        String s = new Scanner(System.in).nextLine();
        try{
        InsertFromFile(s);
        }catch(IOException a){
            System.err.println("Khong mo duoc file");
        }
    }
}
