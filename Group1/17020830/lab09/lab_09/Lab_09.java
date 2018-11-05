/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Lab_09 {

    public static ArrayList readContentToFile(String path){
        ArrayList<String> list = new ArrayList<>();
        try{
        File newfile = new File(path);
        FileReader fr = new FileReader(newfile);
        BufferedReader input = new BufferedReader(fr);
            String s = null;
            while((s= input.readLine())!=null){
                list.add(s);
            }
        } catch(Exception e){
            System.out.println("loi");
            }
//        for(int i =0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
        return list;
        
    }
    public static void writeContentToFile(String path){
      
        try{
            File newfile = new File(path);
            FileWriter  writer = new FileWriter(newfile);          
            PrintWriter pw = new PrintWriter(writer);
            String input = "hello tran van khai";
                pw.write(input);
                pw.close();       
        } catch(Exception e){
            
        }
        
    }
    public static void writeContentToFile_update(String path){
         ArrayList<String> list = new ArrayList<>();
        try{
            File newfile = new File(path);
            list = readContentToFile(path);
            FileWriter  writer = new FileWriter(newfile);          
            BufferedWriter pw = new BufferedWriter(writer);
            String input = "hello tran van khai";
            list.add(input);
            for(int i =0; i<list.size(); i++){
                pw.write(list.get(i));
                pw.newLine();
            }
                pw.close();       
        } catch(Exception e){
            
        }
        
    }
    
    public static File findFileByName(String folderPath, String fileName ){
        File result = null;
            File file = new File(folderPath);
          
            File[] danhsach = file.listFiles();
                for(int i = 0; i<danhsach.length ; i++){
                    if(fileName.equals(danhsach[i].getName())){
                        result = danhsach[i];
                        break;
                    }
                }
            
        return result;
    }
    
    public static void main(String[] args){
        String p = "C:\\Users\\admin\\Desktop\\list\\data.txt";
        writeContentToFile(p);
        //writeContentToFile_update(p);
        ArrayList<String> list = new ArrayList<>();
        list = readContentToFile(p);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        try {
            File file = findFileByName("C:\\Users\\admin\\Desktop\\list", "data.txt");
            System.out.println("ton tai file: " + file.getName());
        } catch (Exception e) {
            System.out.println("khong co file trong thu muc");
        }
        
        
}
}
