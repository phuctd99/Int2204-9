/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ThucHanh09 {
    public static void writeContentFromFile(String path){
        
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("Yes!");
        }
         catch (IOException ex) {
            Logger.getLogger(ThucHanh09.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertContentFromFile(String path){
        String a = Lab09.readContentFromFile(path);
        try (FileWriter writer = new FileWriter(path)) {
            a += "\n" + "Tomorrow";
            writer.write(a);
        }
         catch (IOException ex) {
            Logger.getLogger(ThucHanh09.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
