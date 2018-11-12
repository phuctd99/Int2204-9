package oop_t10;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Utils {
    public static File myFile = new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\OOP_T9\\src\\oop_t9\\OOP_T9.java");
    public static List<String> getAllFunctions(File path) throws FileNotFoundException, IOException{
        List list = new ArrayList();
        FileReader file = new FileReader(path);
        Scanner in = new Scanner(file);
        while (in.hasNextLine()){
            String s = in.nextLine().trim();
            if (s.startsWith("public static")){
                list.add(s);
            }
        }
        return list;
    }
    public static void output(List list){
        if (!list.isEmpty()){
            for (int i = 0 ; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //output(getAllFunctions(myFile));
        System.out.println(findFunctionByName("public static File findByName(String folderPath, String fileName)"));
    }
    public static String findFunctionByName(String name) throws FileNotFoundException{
        String s = "";
        int n = name.indexOf(",");
        String[] st = name.split(",");
        String s0 = st[0]; 
        FileReader file = new FileReader(myFile);
        Scanner in = new Scanner(file);
        int count1 = 0,count2 = 0;
        while(in.hasNextLine()){
            String str = in.nextLine();
            if (str.contains(s0)){
                s = s + str+"\n";
                if (str.contains("{")) count1++;
                if (str.contains("}")) count2++;
                if (count1==count2 && count1!=0){
                    break;
                }
            }
            
        }
        return s;
    }
    
}
