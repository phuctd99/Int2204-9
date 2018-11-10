/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghifile;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;


 
public class DocGhiFile {

    
     
    public static void main(String[] args) throws FileNotFoundException, IOException {
        readContentFromFile("d:/data.txt");
        writeContentToFile("d:/data.txt");
        wirteNewContent("d:/data.txt");
         findFileByName("E:", "data.txt");
        
        
    
    }
    
      
   
          
    public static void readContentFromFile(String path) throws FileNotFoundException, IOException {
        
        try (FileInputStream fis = new FileInputStream(path)) {
            int c = fis.read();
            while(c!=-1) {
                
                System.out.print((char) c);
                c = fis.read();
            }
            System.out.println("");
        }
          
          
        }
    public static void writeContentToFile(String path) throws FileNotFoundException, IOException{
        try (FileOutputStream fileOutputStream = new FileOutputStream(path)) {
            String s = "good bye";
            fileOutputStream.write(s.getBytes());
        }
                
    }
    public static void wirteNewContent(String path) throws FileNotFoundException, IOException {
         String data = "This is new content.";
         FileInputStream file = new FileInputStream(path);
         FileWriter fw = new FileWriter(path, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("\n"+data);
        bw.close();
    }
    public static void findFileByName(String folderPath, String fileName) {
         File file = new File(folderPath);
         String[] list = file.list();
         for(int i = 0 ; i < list.length ; i++) {
             String name = list[i];
             if(name.equals(fileName))
             {
              System.out.println("Co file " +name);
                  
         }
         
    
        }
    }
}


    

    
    

