
import java.io.*;
import java.util.*;

public class Utils {
    public static String readContentFromFile(String path){
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            String s = "";
            while((str = br.readLine()) != null){
                s = s + str;
            }
            fr.close();
            br.close();
            return s;
        } catch (IOException e){
            return "ERROR";
        }
    }

    public static void writeContentToFile(String path){
        try {
            File f = new File(path);
            FileWriter fr = new FileWriter(f);
            Scanner sc = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(fr);
            System.out.println("nhập vào chuỗi: ");
            writer.write(sc.next());
            writer.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    public static void writeContentToFile2(String path){
        try {
            Scanner sc = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            System.out.println("nhập vào chuỗi: ");
            writer.write(sc.next());
            writer.newLine();
            writer.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        try {
            File folder = new File(folderPath);
            File [] files = folder.listFiles();
            File s = null;

            for(File file : files){
                if (file.getName().equals(fileName)) {
                    s = file;
                    break;
                }
            }

            return s;
        }catch (Exception e){
            return null;
        }
    }

    public static void main(String args[]){
       System.out.println(readContentFromFile("C:\\Users\\admin\\Desktop\\lab09.txt.txt"));
//        writeContentToFile("C:\\Users\\admin\\Desktop\\lab09.txt.txt");
//        writeContentToFile2("C:\\Users\\admin\\Desktop\\lab09.txt.txt");
//        System.out.println(findFileByName("C:\\Users\\admin\\Desktop", "lab09.txt.txt"));
    }

}
