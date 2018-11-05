/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author SONY
 */
public class Btt9 {

    static String s;

    public Btt9(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "doc.txt";
        String a = readContentFromFile(path);
        System.out.println(a);
        String name = "nam";
        s = name;
        writeContentToFile(path);
        System.out.println(findFileByName("abc","a.txt").getAbsolutePath());
    }

    public static String readContentFromFile(String path) {
        String t = null;
        try {
            File f = new File(path);
            FileReader rd = new FileReader(f);
            BufferedReader br = new BufferedReader(rd);
            String line;
            t = br.readLine();
            while ((line = br.readLine()) != null) {
                t.concat(line + " ");
                //t.concat(" "+line);
            }
            br.close();
            rd.close();
        } catch (Exception e) {
            t = "khong the doc file!! " + e.getMessage();
        }
        return t;
    }

    public static void writeContentToFile(String path) {
      

        try {
            File f = new File(path);
            FileWriter wt = new FileWriter(f,true);          
            if (s.isEmpty() == false) {

                wt.write(s);
            }
            wt.close();
        } catch (Exception e) {
            System.out.println("khong the ghi vao file!! " + e.getMessage());
        }

    }
    public static File findFileByName(String folderPath, String fileName){  
       
        File f = new File(folderPath);   
        if(f.exists()){
        File[] fs = f.listFiles(); 
        if(fs != null){
            for(File f1 : fs){
                if(f1.getName().equals(fileName)){
                    return f1;
                }
            }
        }
        }
        return null;
    }

}
