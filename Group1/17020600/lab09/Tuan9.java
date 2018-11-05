/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pc
 */
public class Tuan9 {

    public static void readContentFromFile(String path) throws FileNotFoundException, IOException {
        String s = null;     
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        s = sb.toString();
        br.close();
        System.out.println(s);   
    }
    public static void appendContentToFile(String path) throws FileNotFoundException {
        String s = "adasfdas"; 
        PrintWriter file = new PrintWriter(path);
        PrintWriter writer = new PrintWriter(file, true); 
        writer.write(s);
        writer.close();
    }
    public static void writeContentToFile(String path) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        String s = "hi";
        fileOutputStream.write(s.getBytes());
    }
    public static File findFileByName(String folderPath, String fileName) {
        
        File file = new File(folderPath);
        File[] listFile = file.listFiles(); // list of sub folder and file in root 
        File a = null;
        for (File x : listFile) {
            if (x.isFile()) { // check if it is not folder 
                if (x.getName().equals(fileName)) {
                    a = x;
                    break;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        readContentFromFile("C:\\Users\\pc\\OneDrive\\Documents\\New folder\\nvb.txt");
        writeContentToFile("C:\\Users\\pc\\OneDrive\\Documents\\New folder\\nvb.txt");
        appendContentToFile("C:\\Users\\pc\\OneDrive\\Documents\\New folder\\nvb.txt");
        findFileByName("C:\\Users\\pc\\OneDrive\\Documents\\New folder", "nvb.txt");
    }
    
}
