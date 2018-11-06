/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CACLV
 */
public class Utils {

    // đọc dl từ file
    public static String readContentFromFile(String path) throws IOException {
        String str = "";
        try (FileReader fileReader = new FileReader(path);
                BufferedReader br = new BufferedReader(fileReader)) {
            String str1;
            while((str1 = br.readLine()) != null) {
                str += str1 + "\n";
                str1 = br.readLine();
            }
        } catch(FileNotFoundException e){
            System.out.println("FileNotFound");
        }
        return str;
    }

    // ghi vào file (ghi tiếp vào cuối file)
    public static void writeContentToFile2(String path) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write((int) (Math.random() * 100));
        }
    }

    // ghi vào file( xóa dl cũ)
    public static void writeContentToFile1(String path) throws IOException {
//        try (FileWriter fileWriter = new FileWriter(path)) {
//            fileWriter.write((int) (Math.random() * 100));
//        }
        
        FileWriter writer = new FileWriter(path);
        try (BufferedWriter buffer = new BufferedWriter(writer)) {
            buffer.write((int) (Math.random() * 100));
        }

    }

    // tìm kiếm file trong thư mục
    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().equals(fileName)) {
                return f;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String path = "read.txt";

        try {
            path = findFileByName("E:\\FFOutput\\OOP1\\week9", "sdfsadf").getPath();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            // in ra dl ban đầu
            System.out.println(readContentFromFile(path));

            // in ra dl mới thay đổi
            writeContentToFile1(path);
            System.out.println(readContentFromFile(path));

            // thêm vòa cuối và in ra
            writeContentToFile2(path);
            System.out.println(readContentFromFile(path));

        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
