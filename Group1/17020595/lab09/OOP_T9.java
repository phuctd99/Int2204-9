package oop_t9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;
import static sun.net.www.http.HttpClient.New;

public class OOP_T9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //System.out.println(readContentFromFile("file.txt"));
        //WriteContentToFile("file.txt");
        writeNewContent("file.txt");
//        File f = findByName("New folder", "file.txt");
//        Scanner readFile = new Scanner(f);
//        if (readFile.hasNextLine()){
//            System.out.println("true");    
//        }
    }
    public static String readContentFromFile(String path) throws IOException{
        Scanner readFile = new Scanner(Paths.get(path));
        String st = "";
        while (readFile.hasNextLine()){
            st = "Da doc thanh cong";
            break;
        }
        return st;
    }
    public static void WriteContentToFile(String path) throws FileNotFoundException{
        PrintWriter write = new PrintWriter(path);
        String s = "";
        while (true){
            s = sc.nextLine();
            if (!s.equals("0")){
                write.println(s);
            }
            else break;
                        
        }
        write.close();
        
    }
    public static void writeNewContent(String path) throws FileNotFoundException, IOException{
        String st = "day la content moi";
        FileInputStream file = new FileInputStream(path);
        FileWriter write = new FileWriter(path,true);
        BufferedWriter bw = new BufferedWriter(write);
        bw.write("\r\n" + st);
        bw.close();
    }    
    public static File findByName(String folderPath, String fileName ){
        File f = new File(folderPath);
        String[] li = f.list();
        File t ;
        for (int i = 0; i < li.length; i++){
            if (fileName.equals(li[i])){
                return t = new File(fileName);
            }
        }
        return f;
    }
}
