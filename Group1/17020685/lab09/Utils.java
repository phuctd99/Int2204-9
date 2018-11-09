/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

// readStringfromfile    fileutils dependencies     

/**
 *
 * @author HP
 */
public class Utils {

    /**
     * @param args the command line arguments
     */
    public static String readContentFromFile(String path) {
        String str = null;
        try {      
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());// tách dòng.
            }
            str = sb.toString();
            br.close();
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("ERROR!");
        }
        return str;
    }
    
    public static void writeContentToFile(String path) {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        try {
            PrintWriter file = new PrintWriter(path);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace(); // In ra kết quả của phương thức toString cùng với stack trace đến System.err
        }
    }
    
    public static void writeContentToFiles(String path) {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        try {
            FileWriter file = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(file); 
            bw.write(content);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static File findFileByName(String folderPath, String fileName) {
        
        File folder = new File(folderPath);
        File[] listFile = folder.listFiles(); 
        File file = null;
        for (File element : listFile) {
            if (element.isFile()) {
                if (element.getName().equals(fileName)) {
                    file = element;
                    break;
                }
            }
        }
        return file;
    }
    
    public static void main(String[] args){
        // TODO code application logic here
        String path = "E:\\file.txt";        
     
//        writeContentToFiles(path);

        writeContentToFiles(path);
        
        System.out.println(readContentFromFile(path));

        findFileByName("E:\\", "file.txt");
              
    }
    
}
