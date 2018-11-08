/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

import java.io.*;
import java.util.Scanner;

public class io{

    public static String readContentFromFile(String path) throws IOException {
        String result = new String();
        String temporary;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        while ((temporary = bfr.readLine()) != null){
            result += temporary + '\n';
        }
        bfr.close();
        return result;
    }

    public static void writeContentToFile(String path, boolean append) throws IOException{
        Scanner scr = new Scanner(System.in);
        String content;
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, append), "UTF-8"));
        //tab để kết thúc
        while ((content = scr.nextLine()).charAt(0) != '\t')
        bfw.write(content + '\n');
        bfw.close();
    }

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        File[] listFile = file.listFiles();
        for (File f : listFile){
            if (f.toString().equals(folderPath+'\\'+fileName)){
                return f;
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        System.out.println(findFileByName("C:\\Users\\VIETTEL\\Documents\\NetBeansProjects\\swing", "text.txt"));
    }
}
