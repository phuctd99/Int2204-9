/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author admin
 */
public class Lab09 {

    /**
     *
     * @param a
     * @return
     */
    public static String readContentFromFile(String a){
        BufferedReader doc = null;
        String file = "";
          
        try {
            doc = new BufferedReader(new FileReader(a));
             String dong = doc.readLine();
             while ( dong != null){
                 file += dong;
                 file += "\n";
                 dong = doc.readLine();
             }
        }
        catch (IOException e){
        }
        finally {
            try{
                doc.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return file;
        
    }
    public static void writeContentToFile(String path) {
        try {
            FileWriter ghi = new FileWriter(path);
            ghi.write("Diamond");
            ghi.close();
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
    
    public static void writeContentToFileC(String path) {
        try {
            FileWriter ghi = new FileWriter(path, true);
            ghi.write("\n");
            ghi.write("F T D");
            ghi.close();
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        writeContentToFileC("C:\\Users\\admin\\Desktop\\New Text Document.txt");
        writeContentToFile("C:\\Users\\admin\\Desktop\\New Text Document.txt");
        System.out.print(readContentFromFile("C:\\Users\\admin\\Desktop\\New Text Document.txt"));
    }
    
}
