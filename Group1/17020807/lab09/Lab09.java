/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Lab09 {
    public static String readContentFromFile(String path){
        String a = "";
        File f = new File(path);
        try {
            String line = null;
            BufferedReader bf = new BufferedReader(new FileReader(f));
            if ((line = bf.readLine()) != null) a = line;
            while((line = bf.readLine()) != null){
                a += "\n" + line;
                
            }
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab09.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab09.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "D:\\HK 3\\OOP\\lab08.txt";
        System.out.println("Read: " + readContentFromFile(path) + "\n");
        ThucHanh09.writeContentFromFile(path);
        System.out.println("Write: " + readContentFromFile(path) + "\n");
        ThucHanh09.insertContentFromFile(path);
        System.out.println("Insert: " + readContentFromFile(path) + "\n");
        File f = FindFile.findFileByName("D:\\HK 3\\OOP", "lab-8.txt");
        System.out.println("Path file: " + f.getAbsolutePath());
// TODO code application logic here
    }
    
}
