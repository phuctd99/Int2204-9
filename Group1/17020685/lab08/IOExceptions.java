/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class IOExceptions {
    public static void IOE(String namefile) throws IOException{
        File f = new File(namefile);
        BufferedReader file = new BufferedReader(new FileReader(f));
        if(!file.ready()){
            System.err.println("Lỗi đọc file.");       
        } else {
            System.out.println("Đọc thành công.");
        }    
    }
    
    public static void main(String[] args) throws IOException {
        String namefile = "E:\\anhdon.txt";
        IOE(namefile);
    }
}
