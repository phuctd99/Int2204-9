/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hung
 */
public class Utis {

    public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
        File file = new File(path);
        StringBuilder fileContents = new StringBuilder((int)file.length());        

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return fileContents.toString();
        }
    }
    
    public static String writeContentFromFile1(String path) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try(PrintWriter out = new PrintWriter(path)) {
            out.print(s);
        }
        return "Success";
    }
    public static String writeContentFromFile2(String path) throws FileNotFoundException, IOException{
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try(FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
{
            out.println(s);
            }
                return "Success";
            }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        
        File[] list =file.listFiles();
        File res = null;
        for (File file1 : list){
            if (fileName.equalsIgnoreCase(file1.getName())) res = file1;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
//      String s = sc.nextLine();
//      String res = null;
//      String test2= "abcdef";
//      try{  
//          res = readContentFromFile(s);
//          System.out.print(res);
//        }catch(IOException e){
//            System.out.print("File not found!!");
//        }
      
//      try{
//          writeContentFromFile1(s);
//      }catch(IOException e){
//          System.out.print("File not found");
//      }

//        try{
//            writeContentFromFile2(s);
//        }catch(IOException e){
//            System.out.println("File not found!!");
//        }
        String path = sc.nextLine();
        String name = sc.nextLine();
        File file = findFileByName(path, name);
        
    
}
}
