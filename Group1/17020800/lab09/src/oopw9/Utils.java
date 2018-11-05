/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenhuy
 */
public class Utils {

    private static final String path = "C:\\Users\\nguyenhuy\\Documents\\NetBeansProjects\\OOPW9\\src\\oopw9\\FileText.txt";

    public static String readContentFromFile(String path) {
        String Text = "";
        try {
            FileReader file = new FileReader(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String fullLine = sc.nextLine();
                Text += fullLine;
            }
            return Text;
        } catch (FileNotFoundException ex) {
            System.out.println("Không có thư mục cần tìm");
        }
        return "";
    }

    public static void writeContentToFile(String path) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner sc = new Scanner(System.in, "utf8");
        String s = sc.nextLine();
        try {
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void writeaddContentToFile(String path) {
        String ss = readContentFromFile(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner sc = new Scanner(System.in, "utf8");
        String s = sc.nextLine();
        try {
            fileWriter.write(ss + s);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] matchingFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals(fileName);
            }
        });
        return matchingFiles.length != 0 ? matchingFiles[0] : null;
    }

    public static void main(String[] args) throws IOException {
        Utils ut = new Utils();
        ut.writeContentToFile(path);
        System.out.println(ut.readContentFromFile(path));
        String path1 = "C:\\Users\\nguyenhuy\\Documents\\NetBeansProjects\\OOPW9\\src\\oopw9";
        String path2 = "FileText.txt";
        System.out.println(ut.findFileByName(path1, path2));
    }
}
