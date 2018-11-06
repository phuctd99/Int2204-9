/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap09;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Vu Huong
 */
public class Utils {

    /**
     * @param args the command line arguments
     */
    public static String readContentFromFile(String path) throws IOException {
        int a ;
        try (FileReader fileReader = new FileReader(path);
                BufferedReader b = new BufferedReader(fileReader)) {
            while((a= b.read()) != -1){
            System.out.print((char)a);
            }
        } catch(FileNotFoundException e){
            System.err.println("Khong tim thay file");
        }
        
        return "";
    }
    //ghi tiếp
    public static void writeContentToFile_continue(String path) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write("Ghi tiep vao file và giữ nguyên");
            
        }
    }
    //xoá
     public static void writeContentToFile(String path) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write("Ghi tiep vao file và xoá");
            
        }
    }
     public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().equals(fileName)) {
                return f;
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String link= null;
        try {
            link = findFileByName("C:\\Users\\Hoang Vu Huong\\Documents\\NetBeansProjects\\Lap09", "lap9.txt").getPath();
            System.out.print(readContentFromFile(link));
        writeContentToFile_continue("doc.txt");
        } catch (Exception e) {
            System.err.print("có lỗi : ");
            e.printStackTrace();
        }
        
        
    }
    
}
