/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lab09 {
    public static String readContentFromFile(String path) {
        String s="";
        try{
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);
	String line = br.readLine();
        while(line != null){
            s += line;
            s +="\n";
            line = br.readLine();
        }
        fis.close();
        isr.close();
        br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return s;
    }
    public static void writeContentToFile(String path, String s){
        try{
        FileOutputStream fos = new FileOutputStream(path);
	OutputStreamWriter osw = new OutputStreamWriter(fos);
	BufferedWriter bw = new BufferedWriter(osw);
        //if()
        bw.write(s); 
        
        bw.close();
        fos.close();
        osw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void writeContentToFileNotDelete(String path, String s){
        try{
        File file = new File(path);
        FileWriter fw = new FileWriter(file, true);//
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(s);
        bw.close();
        fw.close();
    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        boolean check = false;
        if(file.exists()){
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                        if (f.getName().equals(fileName)) {
                            check =true;
                            System.out.println(f.getAbsolutePath());
                            return f;
                    }  
                }
                if(check == false){
                    System.out.println("Khong tim thay file");
                }
            }
        }
        else{
            System.out.println("Khong ton tai folder");
        }
        return null;
        
    }
    public static void main(String[] args) {
        String s = "";
        s = readContentFromFile("data.txt");
        System.out.println(s);
//        writeContentToFile("output.txt", "Add data");
//        writeContentToFileNotDelete("output.txt", "Add data");
         File file = findFileByName("test", "newfile.txt");
    } 
}
