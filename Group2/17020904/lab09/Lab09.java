

import java.io.*;
import java.util.Scanner;

public class Lab09 {

    public static String readContentFormFile(String path){
        File file = new File(path);
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch(IOException e){}

        try (Scanner sc = new Scanner(file)){
            String str;

            while (sc.hasNext()){
                str = sc.nextLine();
                System.out.println(str);
            }
        }
        catch (Exception e){}
        return path;
    }
    public static void wirteContentToFile (String path){
        File file = new File (path);

        try{
            FileWriter f = new FileWriter(file,true);
            PrintWriter p = new PrintWriter(f);

            p.println("He");
            p.close();
        }
        catch (Exception e){}

    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File (folderPath);
        if (!file.exists()) {
            return null;
        }
        File [] listFile = file.listFiles();
        if (listFile != null){
            for (File f: listFile){
                if (f.getName().endsWith(fileName)){
                    return f.getAbsoluteFile();
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        String a = "A";
        wirteContentToFile(a);
        readContentFormFile(a);
        System.out.println(findFileByName("C:\\Users\\bbnam\\IdeaProjects\\OOP1", "A"));

    }
}
