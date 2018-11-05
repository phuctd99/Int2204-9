package lab09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab09 {

    public static void main(String[] args) {
        // file lab09.txt chua dung de doc ghi file
        String path = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab09\\src\\lab09.txt";
        // duong dan toi thu muc
        String folderPath = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab09\\src";
        // txt2.txt ton tai trong thu muc src
        String txt2 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab09\\src\\txt2.txt";
        // txt4.txt khong ton tai trong thu muc src
        String txt4 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab09\\src\\txt4.txt";
        
        //writeContentToFile_1(path); // ghi vao file va xoa du lieu cu
        writeContentToFile_2(path); // ghi vao file ma khong xoa du lieu cu
        readContentFromFile(path);  // doc tu file
        
        // File res = findFileByName(folderPath, txt4); --> khong ton tai trong thu muc src
        File res = findFileByName(folderPath, txt2);  // co trong thu muc src
        if (res != null) {
            System.out.println("File co trong thu muc, tra ve file thanh cong tu findFileByName");
        }
        else System.out.println("File khong co trong thu muc");

    }
    
    // phuong thuc doc tu file
    public static String readContentFromFile(String path) {
        String res = "";
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                res = sc.nextLine();
                System.out.println(res);
            }
        } catch (Exception e) {
            System.out.println("Error while reading from file");
        }
        return res;
    }
    
    // phuong thuc ghi vao file va xoa du lieu cu
    public static void writeContentToFile_1(String path) {
        File file = new File(path);
        try(PrintWriter pw = new PrintWriter(file)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao xau: ");
            String str = sc.nextLine();
            pw.println(str);
            // se xoa noi dung cu trong file neu da ton tai truoc do
        } catch (Exception e) {
            System.out.println("Error while writing to file!");
        }
    }
    
    // phuong thuc ghi vao cuoi file (khong xoa du lieu cu)
    public static void writeContentToFile_2(String path) {
        File file = new File(path);
        try( FileWriter fw = new FileWriter(file, true);
                // tham so boolean: append
                // true ---> cho phep them noi dung moi vao file
                // false ---> xoa het noi dung cu trong file
             BufferedWriter bfw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bfw) ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao xau: ");
            String str = sc.nextLine();
            pw.println(str);
            // them noi dung moi vao file
        } catch (Exception e) {
            System.out.println("Error while writing to file!");
        }
    }
    
    // phuong thuc tra ve file neu ton tai trong thu muc
    public static File findFileByName(String folderPath, String fileName) {
        int fileName_length = fileName.length();
        int folderPath_length = folderPath.length();
        if (folderPath_length >= fileName_length) return null;
        // lay ra ten file
        String testName = fileName.substring(folderPath_length + 1, fileName_length);
        File file = new File(folderPath); // tro toi folder
        File res = null;
        for (File f: file.listFiles()) {
            // duyet folder
            if (testName.equals(f.getName())) {
                // neu trung ten thi tao ra file va tra ve
                res = new File(fileName);
                break;
            }
        }
        return res;
    }
    
    // phuong thuc phu, kiem tra mot file co trong thu muc hay khong
    private static boolean findByName(String folderPath, String fileName) {
        int fileName_length = fileName.length();
        int folderPath_length = folderPath.length();
        if (folderPath_length >= fileName_length) return false;
        boolean check = false;
        // lay ra ten file
        String testName = fileName.substring(folderPath_length + 1, fileName_length);
        // System.out.println("testName = " + testName);
        File file = new File(folderPath);
        File res = null;
        for (File f: file.listFiles()) {
            if (testName.equals(f.getName())) {
                check = true;
                break;
            }
        }
        return check;
    }
}
