package Tuan9;

import java.io.*;
import java.util.Scanner;

public class main {

    public static String readContentFromFile(String path) {
        String result = "";
        try {
            File file = new File(path);
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                result += scn.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return result;
    }

    public static void writeContentToFile(String path) {
        try {
            String data = "Hi!\n";
            File file = new File(path);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), false);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void insertContentToFile(String path) {
        try {
            String data = "My name is Tam.\nI am 20 years old.";
            File file = new File(path);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] listFile = file.listFiles();
        for(int i=0; i<listFile.length; i++) {
            if( listFile[i].getAbsolutePath().equals(folderPath+'\\'+fileName)) {
                return listFile[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(readContentFromFile("D:\\Data\\Code\\BtapOOP\\BaiTapT9\\data.txt"));
        writeContentToFile("D:\\Data\\Code\\BtapOOP\\BaiTapT9\\data.txt");
        System.out.println(readContentFromFile("D:\\Data\\Code\\BtapOOP\\BaiTapT9\\data.txt"));
        insertContentToFile("D:\\Data\\Code\\BtapOOP\\BaiTapT9\\data.txt");
        System.out.println(readContentFromFile("D:\\Data\\Code\\BtapOOP\\BaiTapT9\\data.txt"));
        File file = findFileByName("D:\\Data\\Code\\BtapOOP\\BaiTapT9", "data.txt");
        System.out.println(readContentFromFile(file.getAbsolutePath()));
    }
}
