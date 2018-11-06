package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static String readContentFromFile(String path) throws IOException {
        String s = "";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String text;
        try {
            while((text = br.readLine())!=null){
                s = s + text+"\n";
            }
        } catch (java.io.FileNotFoundException a) {
            System.out.println(a);
        }
        return s;
    }
    public static void writeContentToFile(String path) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần điền file");
        String s = sc.nextLine();
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fileWriter);
            out.write(s);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void writeContentToFile2(String path) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần điền vào cuối file");
        String s = sc.nextLine();
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter out = new BufferedWriter(fileWriter);
            out.newLine();
            out.append(s);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        File[] listFile = file.listFiles();
        for(int i=0;i<listFile.length;i++){
            if (fileName.equals(listFile[i].getName())) return listFile[i];
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        String link = "C:\\Users\\admin\\IdeaProjects\\lap9\\txt9.txt";

        int option;
        do {
            System.out.println("nhập lựa chọn của bạn");
            System.out.println("1.đọc file");
            System.out.println("2.xuất vào file và xóa nội dung cũ");
            System.out.println("3.xuất vào cuối file");
            System.out.println("4.tìm file");
            System.out.println("5. ket thuc");
            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();

            switch (option) {
                case 1:
                    String s = readContentFromFile(link);
                    System.out.println(s);
                    break;
                case 2:

                    writeContentToFile(link);
                    break;

                case 3:
                    writeContentToFile2(link);

                    break;

                case 4:
                    if (findFileByName("C:\\Users\\admin\\IdeaProjects\\lap9", "txt9.txt") == null) {
                        System.out.println("file not found!!!");
                    } else
                        System.out.println(findFileByName("C:\\Users\\admin\\IdeaProjects\\lap9", "txt9.txt").getName());
                case 5:
                    System.out.println("ket thuc chuong trinh");
                    return ;


                default:
                    System.out.println("nhap sai");
            }
        }
        while (option >= 1 && option <= 5);
    }
}
